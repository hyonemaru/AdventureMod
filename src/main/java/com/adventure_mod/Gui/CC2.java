package com.adventure_mod.Gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CC2 extends ContainerWorkbench {
    public CC2(InventoryPlayer playerInv, World worldIn) {
        super(playerInv, worldIn, BlockPos.ORIGIN);
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }
}