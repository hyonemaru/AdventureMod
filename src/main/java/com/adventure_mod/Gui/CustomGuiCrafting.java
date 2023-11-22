package com.adventure_mod.Gui;

import net.minecraft.client.gui.inventory.GuiCrafting;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

public class CustomGuiCrafting extends GuiCrafting {
    public CustomGuiCrafting(InventoryPlayer playerInv, World worldIn) {
        super(playerInv, worldIn);
    }
}