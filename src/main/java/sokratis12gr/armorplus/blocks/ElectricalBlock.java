package sokratis12gr.armorplus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import sokratis12gr.armorplus.ArmorPlus;

/**
 * sokratis12gr.armorplus.blocks
 * ArmorPlus created by sokratis12GR on 6/13/2016 9:46 PM.
 */
public class ElectricalBlock extends Block {

    public ElectricalBlock() {
        super(Material.IRON);
        setUnlocalizedName("ElectricalBlock");
        this.setResistance(20.0F);
        this.setCreativeTab(ArmorPlus.TAB_ARMORPLUS_BLOCKS);
        this.setHardness(5.0F);
        this.setHarvestLevel("pickaxe", 1);
    }
}
