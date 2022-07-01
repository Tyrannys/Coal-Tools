package tyrannys.coaltools.client.playeruseable.tools.toolitems.coal;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import tyrannys.coaltools.setup.ModEnchantments;
import tyrannys.coaltools.setup.ModItems;

import javax.annotation.Nullable;
import java.util.List;

public class CoalArmor extends ArmorItem {

    public CoalArmor(ArmorMaterial pMaterial, EquipmentSlot pSlot, Properties pProperties) {
        super(pMaterial, pSlot, pProperties);
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
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        ItemStack head = new ItemStack(ModItems.FIRE_HELM.get());
        ItemStack chest = new ItemStack(ModItems.FIRE_CHEST.get());
        ItemStack legs = new ItemStack(ModItems.FIRE_LEGS.get());
        ItemStack feet = new ItemStack(ModItems.FIRE_FEET.get());

        if (player.isOnFire() || player.isInLava()) {
            if (stack.is(ModItems.COAL_HELM.get())) {
                stack.shrink(1);
                player.setItemSlot(EquipmentSlot.HEAD, head);
                head.enchant(ModEnchantments.FIRE_THORNS.get(), 1);
            }
            else if (stack.is(ModItems.COAL_CHEST.get())) {
                stack.shrink(1);
                player.setItemSlot(EquipmentSlot.CHEST, chest);
                chest.enchant(ModEnchantments.FIRE_THORNS.get(), 1);
            }
            else if (stack.is(ModItems.COAL_LEGS.get())) {
                stack.shrink(1);
                player.setItemSlot(EquipmentSlot.LEGS, legs);
                legs.enchant(ModEnchantments.FIRE_THORNS.get(), 1);
            }
            else if (stack.is(ModItems.COAL_FEET.get())) {
                stack.shrink(1);
                player.setItemSlot(EquipmentSlot.FEET, feet);
                feet.enchant(ModEnchantments.FIRE_THORNS.get(), 1);
            }
        }
    }

    @Override
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
        if (entity.isOnFire()) {
            if (stack.is(ModItems.COAL_HELM.get())) {
                entity.remove(Entity.RemovalReason.KILLED);
                entity.spawnAtLocation(ModItems.FIRE_HELM.get());
                entity.getItem().enchant(ModEnchantments.FIRE_THORNS.get(), 1);
            }
            else if (stack.is(ModItems.COAL_CHEST.get())) {
                entity.remove(Entity.RemovalReason.KILLED);
                entity.spawnAtLocation(ModItems.FIRE_CHEST.get());
                entity.getItem().enchant(ModEnchantments.FIRE_THORNS.get(), 1);
            }
            else if (stack.is(ModItems.COAL_LEGS.get())) {
                entity.remove(Entity.RemovalReason.KILLED);
                entity.spawnAtLocation(ModItems.FIRE_LEGS.get());
                entity.getItem().enchant(ModEnchantments.FIRE_THORNS.get(), 1);
            }
            else if (stack.is(ModItems.COAL_FEET.get())) {
                entity.remove(Entity.RemovalReason.KILLED);
                entity.spawnAtLocation(ModItems.FIRE_FEET.get());
                entity.getItem().enchant(ModEnchantments.FIRE_THORNS.get(), 1);
            }
        }
        return false;
    }
}
