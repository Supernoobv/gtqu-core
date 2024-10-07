package gtqu.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static gregtech.common.blocks.MetaBlocks.statePropertiesToString;

public class MetaBlocks {
    public static BlockStandardCasing STANDARD_CASING;

    private MetaBlocks() {}
    public static void init() {
        STANDARD_CASING = new BlockStandardCasing();
        STANDARD_CASING.setRegistryName("standard_casing");
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModels() {
        registerItemModel(STANDARD_CASING);
    }

    @SideOnly(Side.CLIENT)
    private static void registerItemModel(Block block) {
        for (IBlockState validState : block.getBlockState().getValidStates()) {
            ModelLoader.setCustomModelResourceLocation(
                    Item.getItemFromBlock(block),
                    block.getMetaFromState(validState),
                    new ModelResourceLocation(block.getRegistryName(), statePropertiesToString(validState.getProperties()))
            );
        }
    }
}
