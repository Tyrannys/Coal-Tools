package tyrannys.coaltools.client.playeruseable.tools.toolitems.fire;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class FirePickaxe extends PickaxeItem {
    public FirePickaxe(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean mineBlock(ItemStack stack, Level level, BlockState state, BlockPos pos, LivingEntity entity) {
        ItemStack iron = new ItemStack(Items.IRON_INGOT);
        ItemStack gold = new ItemStack(Items.GOLD_INGOT);
        ItemStack copper = new ItemStack(Items.COPPER_INGOT);
        Player player = (Player) entity;

        if (state.is(BlockTags.IRON_ORES) && state.canHarvestBlock(level, pos, player)) {

        }
        if (state.is(BlockTags.GOLD_ORES) && state.canHarvestBlock(level, pos, player)) {
            state.spawnAfterBreak((ServerLevel) level, pos, gold);
        }
        if (state.is(BlockTags.COPPER_ORES) && state.canHarvestBlock(level, pos, player)) {
            state.spawnAfterBreak((ServerLevel) level, pos, copper);
        }

        return super.mineBlock(stack, level, state, pos, entity);
    }
}
