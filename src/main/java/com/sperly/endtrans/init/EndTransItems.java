package com.sperly.endtrans.init;


import com.sperly.endtrans.client.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class EndTransItems
{
    public static Item binder_tool;

    public static void init()
    {
        binder_tool = new Item().setCreativeTab(CreativeTabs.MISC).setMaxStackSize(1).setUnlocalizedName("binder_tool");
    }

    public static void register()
    {
        GameRegistry.registerItem(binder_tool, binder_tool.getUnlocalizedName().substring(5));
    }

    public static void registerRenders()
    {
        registerRender(binder_tool);
    }

    public static void  registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }
}
