package gtqu.common.metatileentities.multi.electric;

import gregtech.api.GTValues;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController;
import gregtech.api.pattern.BlockPattern;
import gregtech.api.pattern.FactoryBlockPattern;
import gregtech.api.unification.material.Materials;
import gregtech.api.util.RelativeDirection;
import gregtech.client.renderer.ICubeRenderer;
import gregtech.client.renderer.texture.Textures;
import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.metatileentities.MetaTileEntities;
import gtqu.api.recipe.RecipeMaps;
import gtqu.api.render.GTQUTextures;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nonnull;

public class MetaTileEntityQuantumStringDeterminator extends RecipeMapMultiblockController {
    public MetaTileEntityQuantumStringDeterminator(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, RecipeMaps.INFINITY_EXTRACTOR_RECIPES);
    }

    @Nonnull
    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start(RelativeDirection.RIGHT, RelativeDirection.DOWN, RelativeDirection.FRONT)
                .aisle("###", "I##", "IXS", "#SS", "###")
                .aisle("BB#", "###", "CNO", "#NG", "#V#").setRepeatable(1, 4)
                .aisle("BB#", "###", "CNF", "#NG", "#V#").setRepeatable(0, 1)
                .aisle("GG#", "EGG", "EMS", "#SS", "###")
                .where('S', states(getCasingState()).or(autoAbilities(true, false)))
                .where('C', heatingCoils())
                .where('B', frames(Materials.Steel))
                .where('M', abilities(MultiblockAbility.MUFFLER_HATCH))
                .where('O', abilities(MultiblockAbility.EXPORT_ITEMS))
                .where('F', abilities(MultiblockAbility.EXPORT_FLUIDS))
                .where('I', states(getCasingState()).or(abilities(MultiblockAbility.IMPORT_ITEMS).setPreviewCount(1)))
                .where('E', states(getCasingState()).or(abilities(MultiblockAbility.INPUT_ENERGY).setPreviewCount(2)))
                .where('V', states(Blocks.BEDROCK.getDefaultState()))
                .where('X', selfPredicate())
                .where('N', air())
                .where('#', any())
                .where('G', states(getCasingState()).or(autoAbilities(true, false)))
                .build();
    }

    private IBlockState getCasingState() {
        return MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID);
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart iMultiblockPart) {
        return Textures.SOLID_STEEL_CASING;
    }

    @Override
    protected @Nonnull OrientedOverlayRenderer getFrontOverlay() {
        return GTQUTextures.QUANTUM_STRING_DETERMINATOR_OVERLAY;
    }

    @Override
    public boolean hasMufflerMechanics() {
        return false;
    }

    @Override
    public boolean canBeDistinct() {
        return true;
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityQuantumStringDeterminator(this.metaTileEntityId);
    }
}
