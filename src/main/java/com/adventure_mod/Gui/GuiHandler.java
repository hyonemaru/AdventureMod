package com.adventure_mod.Gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class GuiHandler implements IGuiHandler {
    public static final int CUSTOM_WORKBENCH = 0;


    @Nullable
    @Override
    public Container getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
         if (ID == CUSTOM_WORKBENCH){
            return new CC2(player.inventory,world);
        }
        return null;
    }

    @Nullable
    @Override
    public GuiContainer getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){
         if(ID == CUSTOM_WORKBENCH){
            return new  CustomGuiCrafting(player.inventory, world);
        }
        return null;
    }
}
