package tyrannys.coaltools.client.playeruseableitems.tools.toolitems;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import tyrannys.coaltools.client.playeruseableitems.itementities.tools.CoalSwordEntity;

import javax.annotation.Nullable;
import java.util.List;

public class CoalToolsSword extends SwordItem {

    public CoalToolsSword(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flagIn) {
        if (Screen.hasShiftDown()) {
            tooltip.add(new TextComponent("\u00A7e"+"Thrown into a furnace may have some adverse effects" + "\u00A7e"));
        }
        else {
            tooltip.add(new TextComponent("\u00A77"+"Hold "+"\u00A7e"+"shift "+"\u00A77"+"for more info" + "\u00A77"));
        }
    }

    @Override
    public boolean hasCustomEntity(ItemStack stack) {
        return true;
    }

    @Override
    public Entity createEntity(Level level, Entity location, ItemStack stack) {
        return new CoalSwordEntity(level, location.getX(), location.getY(), location.getZ(), stack);
    }

}
