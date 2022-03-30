package tyrannys.coaltools.client.playeruseable.tools.toolitems.coal;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import tyrannys.coaltools.setup.ModItems;

import javax.annotation.Nullable;
import java.util.List;

public class CoalHoe extends HoeItem {

    public CoalHoe(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flagIn) {
        if (Screen.hasShiftDown()) {
            tooltip.add(new TextComponent("\u00A7e"+"Thrown into a fire may have adverse effects" + "\u00A7e"));
        }
        else {
            tooltip.add(new TextComponent("\u00A77"+"Hold "+"\u00A7e"+"shift "+"\u00A77"+"for more info" + "\u00A77"));
        }
    }

    @Override
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
        if (entity.isOnFire()) {
            entity.remove(Entity.RemovalReason.KILLED);
            entity.spawnAtLocation(ModItems.FIRE_HOE.get());
        }
        return false;
    }

    @Override
    public void onUsingTick(ItemStack stack, LivingEntity player, int count) {
        if (player.isOnFire()) {
            stack.shrink(1);
            player.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(ModItems.FIRE_HOE.get()));
        }
    }
}
