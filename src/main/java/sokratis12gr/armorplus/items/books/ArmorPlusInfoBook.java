package sokratis12gr.armorplus.items.books;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import sokratis12gr.armorplus.ArmorPlus;
import sokratis12gr.armorplus.client.gui.GuiArmorPlusInfo;

public class ArmorPlusInfoBook extends Item {

    public ArmorPlusInfoBook() {
        setRegistryName("armorplus_info_book");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName("ArmorPlusInfoBook");     // Used for localization (en_US.lang)
        GameRegistry.register(this);
        this.setCreativeTab(ArmorPlus.TAB_ARMORPLUS_ITEMS);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation("armorplus:ArmorPlusBook", "inventory"));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ActionResult<ItemStack> onItemRightClick(ItemStack item, World world, EntityPlayer player, EnumHand hand) {
        Minecraft.getMinecraft().displayGuiScreen(new GuiArmorPlusInfo());
        return super.onItemRightClick(item, world, player, hand);
    }
}
