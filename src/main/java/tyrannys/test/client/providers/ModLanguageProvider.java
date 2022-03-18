package tyrannys.test.client.providers;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import tyrannys.test.TestMod;
import tyrannys.test.client.player.TestItemGroup;
import tyrannys.test.setup.ModItems;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(DataGenerator gen, String locale) {
        super(gen, TestMod.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemgroup." + TestItemGroup.TEST_ITEM_GROUP, "Test");

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
    }

    @Override
    public String getName() {
        return "Test LanguageProvider";
    }

}
