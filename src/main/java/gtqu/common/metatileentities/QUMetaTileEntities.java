package gtqu.common.metatileentities;

import static gregtech.common.metatileentities.MetaTileEntities.registerMetaTileEntity;

import gregtech.api.metatileentity.SimpleGeneratorMetaTileEntity;
import gtqu.api.recipe.RecipeMaps;
import gtqu.api.render.GTQUTextures;
import gtqu.api.util.QUUtil;
import gtqu.common.metatileentities.multi.electric.MetaTileEntityQuantumStringDeterminator;

public class QUMetaTileEntities {

    public static MetaTileEntityQuantumStringDeterminator QUANTUM_STRING_DETERMINATOR;

    private QUMetaTileEntities() {}

    public static void init() {
        QUANTUM_STRING_DETERMINATOR = registerMetaTileEntity(6000, new MetaTileEntityQuantumStringDeterminator(QUUtil.id("quantum_string_determinator")));
    }
}
