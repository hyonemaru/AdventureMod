package com.adventure_mod.Item;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import javax.annotation.Nullable;
import java.util.List;

public class PortableFood extends ItemFood {
    public PortableFood(int amount, float saturation, boolean isWolfFood){
        super(amount,saturation,isWolfFood);
        this.setCreativeTab(CreativeTabs.FOOD);
        this.setMaxStackSize(64);
        this.setUnlocalizedName("portable_food");
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(I18n.format("item.tutorial.portable_food"));
    }
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player){
        if (!worldIn.isRemote) {
            player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 400, 10));  // 600 ticks = 30 seconds
        }
        super.onFoodEaten(stack, worldIn, player);
    }
}

