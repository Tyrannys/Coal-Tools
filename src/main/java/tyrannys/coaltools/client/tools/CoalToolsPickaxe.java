package tyrannys.coaltools.client.tools;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class CoalToolsPickaxe extends PickaxeItem {

    public CoalToolsPickaxe(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flagIn) {
         if (Screen.hasShiftDown()) {
             tooltip.add(new TextComponent("\u00A7e"+"I wonder what happens if you throw it in a fire?" + "\u00A7e"));
         }
         else {
             tooltip.add(new TextComponent("\u00A77"+"Hold "+"\u00A7e"+"shift "+"\u00A77"+"for more info" + "\u00A77"));
         }
    }
}
