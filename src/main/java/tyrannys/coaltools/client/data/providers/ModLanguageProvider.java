package tyrannys.coaltools.client.data.providers;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import tyrannys.coaltools.CoalTools;
import tyrannys.coaltools.setup.ModEnchantments;
import tyrannys.coaltools.setup.ModItems;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(DataGenerator gen, String locale) {
        super(gen, CoalTools.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.coaltoolsitemgroup", "Coal Tools");

        //Tools
        add(ModItems.COAL_PICKAXE.get(), "Coal Pickaxe");
        add(ModItems.FIRE_PICKAXE.get(), "Fire Pickaxe");
        add(ModItems.BLAZE_PICKAXE.get(), "Blaze Pickaxe");
        add(ModItems.NETHERITE_BLAZE_PICKAXE.get(), "Netherite Blaze Pickaxe");

        add(ModItems.COAL_SWORD.get(), "Coal Sword");
        add(ModItems.FIRE_SWORD.get(), "Fire Sword");
        add(ModItems.BLAZE_SWORD.get(), "Blaze Sword");
        add(ModItems.NETHERITE_BLAZE_SWORD.get(), "Netherite Blaze Sword");

        add(ModItems.COAL_AXE.get(), "Coal Axe");
        add(ModItems.FIRE_AXE.get(), "Fire Axe");
        add(ModItems.BLAZE_AXE.get(), "Blaze Axe");
        add(ModItems.NETHERITE_BLAZE_AXE.get(), "Netherite Blaze Axe");

        add(ModItems.COAL_SHOVEL.get(), "Coal Shovel");
        add(ModItems.FIRE_SHOVEL.get(), "Fire Shovel");
        add(ModItems.BLAZE_SHOVEL.get(), "Blaze Shovel");
        add(ModItems.NETHERITE_BLAZE_SHOVEL.get(), "Netherite Blaze Shovel");

        add(ModItems.COAL_HOE.get(), "Coal Hoe");
        add(ModItems.FIRE_HOE.get(), "Fire Hoe");
        add(ModItems.BLAZE_HOE.get(), "Blaze Hoe");
        add(ModItems.NETHERITE_BLAZE_HOE.get(), "Netherite Blaze Hoe");

        //Armor
        add(ModItems.COAL_HELM.get(), "Coal Helmet");
        add(ModItems.FIRE_HELM.get(), "Fire Helmet");
        add(ModItems.BLAZE_HELM.get(), "Blaze Helmet");
        add(ModItems.NETHERITE_BLAZE_HELM.get(), "Netherite Blaze Helmet");

        add(ModItems.COAL_CHEST.get(), "Coal Chestplate");
        add(ModItems.FIRE_CHEST.get(), "Fire Chestplate");
        add(ModItems.BLAZE_CHEST.get(), "Blaze Chestplate");
        add(ModItems.NETHERITE_BLAZE_CHEST.get(), "Netherite Blaze Chestplate");

        add(ModItems.COAL_LEGS.get(), "Coal Leggings");
        add(ModItems.FIRE_LEGS.get(), "Fire Leggings");
        add(ModItems.BLAZE_LEGS.get(), "Blaze Leggings");
        add(ModItems.NETHERITE_BLAZE_LEGS.get(), "Netherite Blaze Leggings");

        add(ModItems.COAL_FEET.get(), "Coal Boots");
        add(ModItems.FIRE_FEET.get(), "Fire Boots");
        add(ModItems.BLAZE_FEET.get(), "Blaze Boots");
        add(ModItems.NETHERITE_BLAZE_FEET.get(), "Netherite Blaze Boots");

        //Overworld Ores
        add(ModItems.RAW_FROZEN_FIRE.get(), "Frozen Fire");
        add(ModItems.FROZEN_FIRE.get(), "Touchable Fire");
        add(ModItems.FROZEN_FIRE_ORE_ITEM.get(), "Frozen Fire Ore");

        //Nether Ores
        add(ModItems.RAW_BLAZING_FIRE.get(), "Blazing Fire Coals");
        add(ModItems.BLAZING_FIRE.get(), "Blazing Fire");
        add(ModItems.BLAZING_FIRE_ORE_ITEM.get(), "Blazing Fire Ore");

        //Enchantments
        add(ModEnchantments.FIRE_THORNS.get(), "Fire Thorns");

        //Misc
        add(ModItems.REIGNITER.get(), "Reigniter");

    }

    @Override
    public String getName() {
        return CoalTools.MODID + "LanguageProvider";
    }

}
