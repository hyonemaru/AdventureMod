package com.adventure_mod.Gui;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class CustomGui extends GuiContainer {
    private static final ResourceLocation BG_TEXTURE = new ResourceLocation("adventure_mod", "textures/gui/container/ct_gui.png");

    public CustomGui(InventoryPlayer playerInv, World worldIn) {
        super(new CustomContainer(playerInv));
        this.xSize = 176;
        this.ySize = 166;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        mc.getTextureManager().bindTexture(BG_TEXTURE);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}
