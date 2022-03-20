package tyrannys.coaltools.client.tools;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import tyrannys.coaltools.setup.ModItems;

import javax.annotation.Nullable;
import java.util.List;

public class CoalPickaxe extends PickaxeItem {

    public CoalPickaxe(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flagIn) {
         if (Screen.hasShiftDown()) {
             tooltip.add(new TranslatableComponent("\u00A7e"+"I wonder what happens if you throw it in a fire?" + "\u00A7e"));
         }
         else {
             tooltip.add(new TranslatableComponent("\u00A77"+"Hold "+"\u00A7e"+"shift "+"\u00A77"+"for more info" + "\u00A77"));
         }
    }

    @Override
    public boolean hasCustomEntity(ItemStack stack)
    {
        return true;
    }

    @Override
    public Entity createEntity(Level level, Entity location, ItemStack stack)
    {
        if (location.isOnFire() && location.isOnGround()) {
            return ModItems.FIRE_PICKAXE.get().createEntity(level, location, stack);
        }
        return null;
    }

}
