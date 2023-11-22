package com.adventure_mod;

import com.adventure_mod.Gui.GuiHandler;
import com.adventure_mod.Item.PortableCraftingTable;
import com.adventure_mod.Item.PortableFood;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

@Mod(modid = "adventure_mod",
        name = "AdventureMod",
        version ="1.0.0",
        acceptedMinecraftVersions = "[1.12]")
@Mod.EventBusSubscriber(modid = "adventure_mod")
public class AdventureMod {
    public static final String MOD_ID = "adventure_mod";
    public static AdventureMod instance;

    public AdventureMod() {
        instance = this;
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
    }

    public static final Item PORTABLE_FOOD = new PortableFood(10,0.8f,true);
    public static final Item PORTABLE_CT = new PortableCraftingTable();
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event){
        event.getRegistry().register(PORTABLE_FOOD.setRegistryName(MOD_ID,"portable_food"));
        event.getRegistry().register(PORTABLE_CT.setRegistryName(MOD_ID,"portable_ct"));
    }
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){
        ModelLoader.setCustomModelResourceLocation(PORTABLE_FOOD,0,
        new ModelResourceLocation(PORTABLE_FOOD.getRegistryName(),"inventory"));
        ModelLoader.setCustomModelResourceLocation(PORTABLE_CT,0,
        new ModelResourceLocation(PORTABLE_CT.getRegistryName(),"inventory"));
    }
}
