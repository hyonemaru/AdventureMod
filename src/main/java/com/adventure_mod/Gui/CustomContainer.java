package com.adventure_mod.Gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;

import java.awt.*;

public class CustomContainer extends Container {
    private final InventoryPlayer playerInventory;
    private final InventoryCrafting craftingInventory;
    private final InventoryCraftResult craftResult;
    public CustomContainer(InventoryPlayer playerInventory) {
        this.playerInventory = playerInventory;
        this.craftingInventory = new InventoryCrafting(this, 3, 3);
        this.craftResult = new InventoryCraftResult();


        this.addSlotToContainer(new SlotCrafting(playerInventory.player, craftingInventory, craftResult, 0, 88, 35));


        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                int x = 8 + col * 18;
                int y = 84 + row * 18;
                this.addSlotToContainer(new Slot(playerInventory, col + row * 9 + 9, x, y));
            }
        }

        for (int row = 0; row < 9; ++row) {
            int x = 8 + row * 18;
            int y = 142;
            this.addSlotToContainer(new Slot(playerInventory, row, x, y));
        }
    }
    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }
}
