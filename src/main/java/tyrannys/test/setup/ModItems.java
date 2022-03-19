package tyrannys.test.setup;

import net.minecraft.world.item.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tyrannys.test.CoalTools;
import tyrannys.test.client.player.CoalToolsItemGroup;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CoalTools.MODID);

    public static void init() { ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus()); }

    //Coal Pickaxe and upgrades
    public static RegistryObject<Item> COAL_PICKAXE = ITEMS.register("coal_pickaxe", () ->
            new PickaxeItem(Tiers.STONE, 1, -2.8F, (new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP)))
    );

    public static RegistryObject<Item> FIRE_PICKAXE = ITEMS.register("fire_pickaxe", () ->
            new PickaxeItem(Tiers.IRON, 1, -2.8F, (new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP)))
    );

    public static RegistryObject<Item> BLAZE_PICKAXE = ITEMS.register("blaze_pickaxe", () ->
            new PickaxeItem(Tiers.DIAMOND, 1, -2.8F, (new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP)))
    );

    public static RegistryObject<Item> NETHERITE_BLAZE_PICKAXE = ITEMS.register("netherite_blaze_pickaxe", () ->
            new PickaxeItem(Tiers.NETHERITE, 1, -2.8F, (new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP)))
    );

    // Coal Sword and upgrades
    public static RegistryObject<Item> COAL_SWORD = ITEMS.register("coal_sword", () ->
            new SwordItem(Tiers.STONE, 3, -2.4F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    public static RegistryObject<Item> FIRE_SWORD = ITEMS.register("fire_sword", () ->
            new SwordItem(Tiers.IRON, 3, -2.4F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    public static RegistryObject<Item> BLAZE_SWORD = ITEMS.register("blaze_sword", () ->
            new SwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    public static RegistryObject<Item> NETHERITE_BLAZE_SWORD = ITEMS.register("netherite_blaze_sword", () ->
            new SwordItem(Tiers.NETHERITE, 3, -2.4F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    //Coal Axe and upgrades
    public static RegistryObject<Item> COAL_AXE = ITEMS.register("coal_axe", () ->
            new AxeItem(Tiers.STONE, 6.0F, -2.4F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    public static RegistryObject<Item> FIRE_AXE = ITEMS.register("fire_axe", () ->
            new AxeItem(Tiers.IRON, 6.0F, -2.4F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    public static RegistryObject<Item> BLAZE_AXE = ITEMS.register("blaze_axe", () ->
            new AxeItem(Tiers.DIAMOND, 6.0F, -2.4F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    public static RegistryObject<Item> NETHERITE_BLAZE_AXE = ITEMS.register("netherite_blaze_axe", () ->
            new AxeItem(Tiers.NETHERITE, 6.0F, -2.4F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    //Coal Shovel and upgrades
    public static RegistryObject<Item> COAL_SHOVEL = ITEMS.register("coal_shovel", () ->
            new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    public static RegistryObject<Item> FIRE_SHOVEL = ITEMS.register("fire_shovel", () ->
            new ShovelItem(Tiers.IRON, 1.5F, -3.0F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    public static RegistryObject<Item> BLAZE_SHOVEL = ITEMS.register("blaze_shovel", () ->
            new ShovelItem(Tiers.DIAMOND, 1.5F, -3.0F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    public static RegistryObject<Item> NETHERITE_BLAZE_SHOVEL = ITEMS.register("netherite_blaze_shovel", () ->
            new ShovelItem(Tiers.NETHERITE, 1.5F, -3.0F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    //Coal Hoe and upgrades
    public static RegistryObject<Item> COAL_HOE = ITEMS.register("coal_hoe", () ->
            new HoeItem(Tiers.STONE, -2, -2.8F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    public static RegistryObject<Item> FIRE_HOE = ITEMS.register("fire_hoe", () ->
            new HoeItem(Tiers.IRON, -2, -2.8F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    public static RegistryObject<Item> BLAZE_HOE = ITEMS.register("blaze_hoe", () ->
            new HoeItem(Tiers.DIAMOND, -2, -2.8F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );

    public static RegistryObject<Item> NETHERITE_BLAZE_HOE = ITEMS.register("netherite_blaze_hoe", () ->
            new HoeItem(Tiers.NETHERITE, -2, -2.8F, new Item.Properties().tab(CoalToolsItemGroup.COAL_TOOLS_ITEM_GROUP))
    );
}