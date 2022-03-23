package tyrannys.coaltools.setup.init.generation;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import tyrannys.coaltools.setup.ModBlocks;

public class OreGen {

    public static final int OVERWORLD_VEINSIZE = 10;
    public static final int OVERWORLD_AMOUNT = 20;

    public static final int NETHER_VEINSIZE = 10;
    public static final int NETHER_AMOUNT = 20;

    public static Holder<PlacedFeature> OVERWORLD_OREGEN;
    public static Holder<PlacedFeature> NETHER_OREGEN;

    public static void registerConfiguredFeatures() {
        OreConfiguration overworldConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.FROZEN_FIRE_ORE.get().defaultBlockState(), OVERWORLD_VEINSIZE);
        OVERWORLD_OREGEN = registerPlacedFeature("overworld_frozen_fire_ore", new ConfiguredFeature<>(Feature.ORE, overworldConfig),
                CountPlacement.of(OVERWORLD_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(90)));
        OreConfiguration netherConfig = new OreConfiguration(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.BLAZING_FIRE_ORE.get().defaultBlockState(), NETHER_VEINSIZE);
        NETHER_OREGEN = registerPlacedFeature("overworld_blazing_fire_ore", new ConfiguredFeature<>(Feature.ORE, netherConfig),
                CountPlacement.of(NETHER_AMOUNT),
                InSquarePlacement.spread(),
                BiomeFilter.biome(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(90)));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> Holder<PlacedFeature> registerPlacedFeature(String registryName, ConfiguredFeature<FC,F> feature, CountPlacement countPlacement, InSquarePlacement inSquarePlacement, BiomeFilter biomeFilter, HeightRangePlacement heightRangePlacement) {
        return PlacementUtils.register(registryName, Holder.direct(feature), countPlacement, inSquarePlacement, biomeFilter, heightRangePlacement);
    }

    public static void onBiomeLoadingEvent(BiomeLoadingEvent event) {
        if (event.getCategory() == Biome.BiomeCategory.NETHER) {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_OREGEN);
        }
        else if (event.getCategory() == Biome.BiomeCategory.THEEND) {

        }
        else {
            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OVERWORLD_OREGEN);
        }
    }
}
