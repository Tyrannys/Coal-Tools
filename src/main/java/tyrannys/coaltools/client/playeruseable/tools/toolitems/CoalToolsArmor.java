package tyrannys.coaltools.client.playeruseable.tools.toolitems;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import tyrannys.coaltools.setup.ModItems;

import javax.annotation.Nullable;
import java.util.List;

public class CoalToolsArmor extends ArmorItem {

    public CoalToolsArmor(ArmorMaterial pMaterial, EquipmentSlot pSlot, Properties pProperties) {
        super(pMaterial, pSlot, pProperties);
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
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
        if (entity.isOnFire()) {
            if (stack.is(ModItems.COAL_HELM.get())) {
                entity.remove(Entity.RemovalReason.KILLED);
                entity.spawnAtLocation(ModItems.FIRE_HELM.get());
            }
            else if (stack.is(ModItems.COAL_CHEST.get())) {
                entity.remove(Entity.RemovalReason.KILLED);
                entity.spawnAtLocation(ModItems.FIRE_CHEST.get());
            }
            else if (stack.is(ModItems.COAL_LEGS.get())) {
                entity.remove(Entity.RemovalReason.KILLED);
                entity.spawnAtLocation(ModItems.FIRE_LEGS.get());
            }
            else if (stack.is(ModItems.COAL_FEET.get())) {
                entity.remove(Entity.RemovalReason.KILLED);
                entity.spawnAtLocation(ModItems.FIRE_FEET.get());
            }
        }
        return false;
    }
}
