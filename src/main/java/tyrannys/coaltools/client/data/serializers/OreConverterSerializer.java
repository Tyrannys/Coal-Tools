package tyrannys.coaltools.client.data.serializers;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.registries.ForgeRegistries;
import tyrannys.coaltools.client.misc.modifiers.OreConverterModifier;

public class OreConverterSerializer extends GlobalLootModifierSerializer<OreConverterModifier> {

    @Override
    public OreConverterModifier read(ResourceLocation location, JsonObject object, LootItemCondition[] lootItemConditions) {
        int numRawOre = GsonHelper.getAsInt(object, "numOre");
        Item ore = ForgeRegistries.ITEMS.getValue(new ResourceLocation(GsonHelper.getAsString(object, "oreItem")));
        Item ingot = ForgeRegistries.ITEMS.getValue(new ResourceLocation(GsonHelper.getAsString(object, "replacement")));
        return new OreConverterModifier(lootItemConditions, numRawOre, ore, ingot);
    }

    @Override
    public JsonObject write(OreConverterModifier instance) {
        JsonObject json = makeConditions(instance.conditions);
        json.addProperty("numOre", instance.numOreToConvert);
        json.addProperty("ingotItem", ForgeRegistries.ITEMS.getKey(instance.itemToCheck).toString());
        json.addProperty("replacement", ForgeRegistries.ITEMS.getKey(instance.itemReward).toString());
        return json;
    }
}
