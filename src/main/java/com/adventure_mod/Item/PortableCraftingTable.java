package com.adventure_mod.Item;

import com.adventure_mod.AdventureMod;
import com.adventure_mod.Gui.GuiHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class PortableCraftingTable extends Item {

    public PortableCraftingTable(){
        setCreativeTab(CreativeTabs.MISC);
        this.setUnlocalizedName("portable_ct");
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (worldIn.isRemote) {
            playerIn.openGui(AdventureMod.instance, GuiHandler.CUSTOM_WORKBENCH, worldIn, playerIn.getPosition().getX(), playerIn.getPosition().getY(), playerIn.getPosition().getZ());
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}

