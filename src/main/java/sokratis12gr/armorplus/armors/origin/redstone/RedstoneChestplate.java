package sokratis12gr.armorplus.armors.origin.redstone;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import sokratis12gr.armorplus.ARPConfig;
import sokratis12gr.armorplus.ArmorPlus;
import sokratis12gr.armorplus.registry.ModItems;

import java.util.List;

/**
 * sokratis12gr.armorplus.armors.dev
 * ArmorPlus created by sokratis12GR on 7/25/2016 10:08 AM.
 */
public class RedstoneChestplate extends ItemArmor {

    public static int armorPreffix = 0;

    public RedstoneChestplate() {
        super(ModItems.REDSTONE_ARMOR_MATERIAL, armorPreffix, EntityEquipmentSlot.CHEST);
        setMaxStackSize(1);
        setRegistryName("redstone_chestplate");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName("RedstoneChestplate");     // Used for localization (en_US.lang)
        GameRegistry.register(this);
        setCreativeTab(ArmorPlus.TAB_ARMORPLUS);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation("armorplus:RedstoneChestplate", "inventory"));
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List infoList, boolean par4) {
        int redstoneArmorEffectlevel = ARPConfig.redstoneArmorEffectlevel + 1;
        if (ARPConfig.enableRedstoneCSpeed) {
            infoList.add("\2479Ability: " + "\247rSpeed " + redstoneArmorEffectlevel);
            infoList.add("\2473Use: " + "\247rEquip A Piece");
        }
        if (ARPConfig.enableFullRedstoneArmorEffect) {
            infoList.add("\2479Ability: " + "\247rSpeed " + redstoneArmorEffectlevel);
            infoList.add("\2473Use: " + "\247rEquip The Full Set");
        }
    }

    @Override
    public void onArmorTick(World world, EntityPlayer entity, ItemStack itemStack) {
        if (ARPConfig.enableRedstoneCSpeed && entity instanceof EntityLivingBase && !ARPConfig.enableFullRedstoneArmorEffect) {
            entity.addPotionEffect(new PotionEffect(MobEffects.SPEED, 120, ARPConfig.redstoneArmorEffectlevel, true, true));
        }
    }

    @Override
    public String getItemStackDisplayName(ItemStack stack) {
        return (TextFormatting.DARK_RED + I18n.translateToLocal(this.getUnlocalizedNameInefficiently(stack) + ".name")).trim();
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        if (ARPConfig.recipes == 0) {
            return repair.getItem() == Items.REDSTONE;
        }
        if (ARPConfig.recipes == 1) {
            return repair.getItem() == Item.getItemFromBlock(Blocks.REDSTONE_BLOCK);
        }
        return true;
    }
}