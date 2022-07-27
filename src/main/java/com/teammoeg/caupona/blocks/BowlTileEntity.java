package com.teammoeg.caupona.blocks;

import com.teammoeg.caupona.CPTileTypes;
import com.teammoeg.caupona.network.CPBaseTile;
import com.teammoeg.caupona.util.IInfinitable;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;

public class BowlTileEntity extends CPBaseTile implements IInfinitable{
	public ItemStack internal;
	boolean isInfinite=false;
	public BowlTileEntity(BlockPos pWorldPosition, BlockState pBlockState) {
		super(CPTileTypes.BOWL.get(), pWorldPosition, pBlockState);
	}

	@Override
	public void handleMessage(short type, int data) {
	}

	@Override
	public void readCustomNBT(CompoundTag nbt, boolean isClient) {
		internal = ItemStack.of(nbt.getCompound("bowl"));
		isInfinite=nbt.getBoolean("inf");
	}

	@Override
	public void writeCustomNBT(CompoundTag nbt, boolean isClient) {
		nbt.put("bowl", internal.serializeNBT());
		nbt.putBoolean("inf", isInfinite);
	}

	@Override
	public void tick() {
	}

	@Override
	public boolean setInfinity() {
		return isInfinite=!isInfinite;
	}

}
