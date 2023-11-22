package com.adventure_mod.Gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiCrafting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class GuiHandler implements IGuiHandler {
    public static final int CUSTOM_WORKBENCH = 0;
    public static final int CUSTOM_GUI_ID = 1;

    @Nullable
    @Override
    public Container getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == CUSTOM_GUI_ID) {
            return new CustomContainer(player.inventory);
        }
        else if (ID == CUSTOM_WORKBENCH){
            return new ContainerWorkbench(player.inventory, world, new BlockPos(x, y, z));
        }
        return null;
    }

    @Nullable
    @Override
    public GuiContainer getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){
        if (ID == CUSTOM_GUI_ID) {
            return new CustomGui(player.inventory,world);
        }else if(ID == CUSTOM_WORKBENCH){

            return new GuiCrafting(player.inventory, world, new BlockPos(x, y, z));
        }
        return null;
    }
}
