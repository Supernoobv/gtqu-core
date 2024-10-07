package gtqu.common.blocks;

import gregtech.api.block.VariantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockStandardCasing extends VariantBlock<BlockStandardCasing.CasingType> {

    public BlockStandardCasing() {
        super(Material.IRON);
        setTranslationKey("standard_casing");
        setHardness(5.0f);
        setResistance(10.0f);
        setSoundType(SoundType.METAL);
        setHarvestLevel("wrench", 4);
        setDefaultState(getState(CasingType.THERMOSTABLE_CERAMIC));
    }

    @Override
    public boolean canCreatureSpawn(IBlockState state, IBlockAccess world, BlockPos pos, EntityLiving.SpawnPlacementType type) {
        return false;
    }

    public enum CasingType implements IStringSerializable {
        THERMOSTABLE_CERAMIC("thermostable_ceramic"),
        PRESSURE_CASING("high_pressure_casing"),
        UNSTABLE_HYPERSTATIC_CASING("unstable_hyperstatic_casing");

        private final String name;

        CasingType(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return this.name;
        }
    }
}
