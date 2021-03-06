package tyrannys.coaltools.setup;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tyrannys.coaltools.CoalTools;
import tyrannys.coaltools.client.misc.CoalToolsItemGroup;
import tyrannys.coaltools.setup.enums.ModArmorMaterials;
import tyrannys.coaltools.client.playeruseable.tools.ModTiers;
import tyrannys.coaltools.client.playeruseable.tools.toolitems.coal.*;
import tyrannys.coaltools.client.playeruseable.tools.toolitems.fire.FireArmor;
import tyrannys.coaltools.client.playeruseable.tools.toolitems.fire.Reigniter;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CoalTools.MODID);

    public static void init() { ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus()); }

    //Tools
    //Coal Pickaxe and upgrades
    public static RegistryObject<Item> COAL_PICKAXE = ITEMS.register("coal_pickaxe", () ->
            new CoalPickaxe(ModTiers.COALTOOLS, 1, -2.8F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    public static RegistryObject<Item> FIRE_PICKAXE = ITEMS.register("fire_pickaxe", () ->
            new PickaxeItem(ModTiers.FIRETOOLS, 1, -2.8F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    public static RegistryObject<Item> BLAZE_PICKAXE = ITEMS.register("blaze_pickaxe", () ->
            new PickaxeItem(ModTiers.BLAZETOOLS, 1, -2.8F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    public static RegistryObject<Item> NETHERITE_BLAZE_PICKAXE = ITEMS.register("netherite_blaze_pickaxe", () ->
            new PickaxeItem(ModTiers.NETHERITEBLAZETOOLS, 1, -2.8F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    // Coal Sword and upgrades
    public static RegistryObject<Item> COAL_SWORD = ITEMS.register("coal_sword", () ->
            new CoalSword(ModTiers.COALTOOLS, 3, -2.4F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    public static RegistryObject<Item> FIRE_SWORD = ITEMS.register("fire_sword", () ->
            new SwordItem(ModTiers.FIRETOOLS, 3, -2.4F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    public static RegistryObject<Item> BLAZE_SWORD = ITEMS.register("blaze_sword", () ->
            new SwordItem(ModTiers.BLAZETOOLS, 3, -2.4F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    public static RegistryObject<Item> NETHERITE_BLAZE_SWORD = ITEMS.register("netherite_blaze_sword", () ->
            new SwordItem(ModTiers.NETHERITEBLAZETOOLS, 3, -2.4F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    //Coal Axe and upgrades
    public static RegistryObject<Item> COAL_AXE = ITEMS.register("coal_axe", () ->
            new CoalAxe(ModTiers.COALTOOLS, 6, -2.4F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    public static RegistryObject<Item> FIRE_AXE = ITEMS.register("fire_axe", () ->
            new AxeItem(ModTiers.FIRETOOLS, 6.0F, -2.4F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    public static RegistryObject<Item> BLAZE_AXE = ITEMS.register("blaze_axe", () ->
            new AxeItem(ModTiers.BLAZETOOLS, 6.0F, -2.4F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    public static RegistryObject<Item> NETHERITE_BLAZE_AXE = ITEMS.register("netherite_blaze_axe", () ->
            new AxeItem(ModTiers.NETHERITEBLAZETOOLS, 6.0F, -2.4F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    //Coal Shovel and upgrades
    public static RegistryObject<Item> COAL_SHOVEL = ITEMS.register("coal_shovel", () ->
            new CoalShovel(ModTiers.COALTOOLS, 1.5F, -3.0F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    public static RegistryObject<Item> FIRE_SHOVEL = ITEMS.register("fire_shovel", () ->
            new ShovelItem(ModTiers.FIRETOOLS, 1.5F, -3.0F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    public static RegistryObject<Item> BLAZE_SHOVEL = ITEMS.register("blaze_shovel", () ->
            new ShovelItem(ModTiers.BLAZETOOLS, 1.5F, -3.0F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    public static RegistryObject<Item> NETHERITE_BLAZE_SHOVEL = ITEMS.register("netherite_blaze_shovel", () ->
            new ShovelItem(ModTiers.NETHERITEBLAZETOOLS, 1.5F, -3.0F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    //Coal Hoe and upgrades
    public static RegistryObject<Item> COAL_HOE = ITEMS.register("coal_hoe", () ->
            new CoalHoe(ModTiers.COALTOOLS, -2, -2.8F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    public static RegistryObject<Item> FIRE_HOE = ITEMS.register("fire_hoe", () ->
            new HoeItem(ModTiers.FIRETOOLS, -2, -2.8F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    public static RegistryObject<Item> BLAZE_HOE = ITEMS.register("blaze_hoe", () ->
            new HoeItem(ModTiers.BLAZETOOLS, -2, -2.8F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    public static RegistryObject<Item> NETHERITE_BLAZE_HOE = ITEMS.register("netherite_blaze_hoe", () ->
            new HoeItem(ModTiers.NETHERITEBLAZETOOLS, -2, -2.8F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    //Misc
    public static RegistryObject<Item> REIGNITER = ITEMS.register("reigniter", () ->
            new Reigniter(new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP)
                    .fireResistant()
            )
    );

    //Block Items
    public static RegistryObject<Item> FROZEN_FIRE_ORE_ITEM = fromBlock(ModBlocks.FROZEN_FIRE_ORE);

    public static RegistryObject<Item> RAW_FROZEN_FIRE = ITEMS.register("raw_frozen_fire", () ->
            new Item(
                    new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant()
            )
    );

    public static RegistryObject<Item> FROZEN_FIRE = ITEMS.register("frozen_fire", () ->
            new Item(
                    new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant()
            )
    );

    public static RegistryObject<Item> BLAZING_FIRE_ORE_ITEM = fromBlock(ModBlocks.BLAZING_FIRE_ORE);

    public static RegistryObject<Item> RAW_BLAZING_FIRE = ITEMS.register("raw_blazing_fire", () ->
            new Item(
                    new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant()
            ));

    public static RegistryObject<Item> BLAZING_FIRE = ITEMS.register("blazing_fire", () ->
            new Item(
               new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant()
            ));

    //Armor
    //Coal Helmets and upgrades
    public static RegistryObject<Item> COAL_HELM = ITEMS.register("coal_helm", ()->
            new CoalArmor(ModArmorMaterials.COAL, EquipmentSlot.HEAD, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );
    public static RegistryObject<Item> FIRE_HELM = ITEMS.register("fire_helm", ()->
            new FireArmor(ModArmorMaterials.FIREY, EquipmentSlot.HEAD, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );
    public static RegistryObject<Item> BLAZE_HELM = ITEMS.register("blaze_helm", ()->
            new FireArmor(ModArmorMaterials.BLAZE, EquipmentSlot.HEAD, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );
    public static RegistryObject<Item> NETHERITE_BLAZE_HELM = ITEMS.register("netherite_blaze_helm", ()->
            new FireArmor(ModArmorMaterials.NETHERITE_BLAZE, EquipmentSlot.HEAD, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    //Coal ChestPlates and upgrades
    public static RegistryObject<Item> COAL_CHEST = ITEMS.register("coal_chest", ()->
            new CoalArmor(ModArmorMaterials.COAL, EquipmentSlot.CHEST, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );
    public static RegistryObject<Item> FIRE_CHEST = ITEMS.register("fire_chest", ()->
            new FireArmor(ModArmorMaterials.FIREY, EquipmentSlot.CHEST, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );
    public static RegistryObject<Item> BLAZE_CHEST = ITEMS.register("blaze_chest", ()->
            new FireArmor(ModArmorMaterials.BLAZE, EquipmentSlot.CHEST, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );
    public static RegistryObject<Item> NETHERITE_BLAZE_CHEST = ITEMS.register("netherite_blaze_chest", ()->
            new FireArmor(ModArmorMaterials.NETHERITE_BLAZE, EquipmentSlot.CHEST, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    //Coal Legs and upgrades
    public static RegistryObject<Item> COAL_LEGS = ITEMS.register("coal_legs", ()->
            new CoalArmor(ModArmorMaterials.COAL, EquipmentSlot.LEGS, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );
    public static RegistryObject<Item> FIRE_LEGS = ITEMS.register("fire_legs", ()->
            new FireArmor(ModArmorMaterials.FIREY, EquipmentSlot.LEGS, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );
    public static RegistryObject<Item> BLAZE_LEGS = ITEMS.register("blaze_legs", ()->
            new FireArmor(ModArmorMaterials.BLAZE, EquipmentSlot.LEGS, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );
    public static RegistryObject<Item> NETHERITE_BLAZE_LEGS = ITEMS.register("netherite_blaze_legs", ()->
            new FireArmor(ModArmorMaterials.NETHERITE_BLAZE, EquipmentSlot.LEGS, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    //Coal Feet and upgrades
    public static RegistryObject<Item> COAL_FEET = ITEMS.register("coal_feet", ()->
            new CoalArmor(ModArmorMaterials.COAL, EquipmentSlot.FEET, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );
    public static RegistryObject<Item> FIRE_FEET = ITEMS.register("fire_feet", ()->
            new FireArmor(ModArmorMaterials.FIREY, EquipmentSlot.FEET, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );
    public static RegistryObject<Item> BLAZE_FEET = ITEMS.register("blaze_feet", ()->
            new FireArmor(ModArmorMaterials.BLAZE, EquipmentSlot.FEET, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );
    public static RegistryObject<Item> NETHERITE_BLAZE_FEET = ITEMS.register("netherite_blaze_feet", ()->
            new FireArmor(ModArmorMaterials.NETHERITE_BLAZE, EquipmentSlot.FEET, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP).fireResistant())
    );

    public static final BlockBehaviour.Properties BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops();
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP);

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}