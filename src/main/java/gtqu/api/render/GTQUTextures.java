package gtqu.api.render;

import gregtech.api.gui.resources.TextureArea;
import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;
import gtqu.api.util.QUUtil;
import net.minecraft.util.ResourceLocation;

public class GTQUTextures {
    public static SimpleOverlayRenderer INDESTRUCTIBLE_CASING = simple("casings/hardened_casing/indestructible_casing");
    public static SimpleOverlayRenderer INDESTRUCTIBLE_PIPE_CASING = simple(
            "casings/hardened_casing/indestructible_pipe_casing");
    public static SimpleOverlayRenderer PLASMA_PIPE_CASING = simple("casings/hardened_casing/plasma_pipe_casing");
    public static SimpleOverlayRenderer THERMOSTABLE_CERAMIC = simple("casings/standard_casing/thermostable_ceramic");
    public static SimpleOverlayRenderer PRESSURE_CASING = simple("casings/standard_casing/high_pressure_casing");
    public static SimpleOverlayRenderer UNSTABLE_HYPERSTATIC_CASING = simple(
            "casings/standard_casing/unstable_hyperstatic_casing");
    public static SimpleOverlayRenderer HYPERSTATIC_CASING = simple("casings/hardened_casing/hyperstatic_casing");

    public static final OrientedOverlayRenderer NAQ_REACTOR_OVERLAY = oriented("machines/generators/naquadah");

    public static final OrientedOverlayRenderer ANTIMATTER_COMPRESSOR_OVERLAY = oriented(
            "overlay/multiblock/antimatter_compressor");
    public static final OrientedOverlayRenderer ELECTRODE_SMELTER_OVERLAY = oriented("overlay/multiblock/electrode_smelter");
    public static final OrientedOverlayRenderer FORGING_FURNACE_OVERLAY = oriented("overlay/multiblock/forging_furnace");
    public static final OrientedOverlayRenderer FUSION_STACK_OVERLAY = oriented("overlay/multiblock/fusion_stack");
    public static final OrientedOverlayRenderer HEAT_DISPERSER_OVERLAY = oriented("overlay/multiblock/heat_disperser");
    public static final OrientedOverlayRenderer HEAT_EXCHANGER_OVERLAY = oriented("overlay/multiblock/heat_exchanger");
    public static final OrientedOverlayRenderer HEAT_RECLAIMER_OVERLAY = oriented("overlay/multiblock/heat_reclaimer");
    public static final OrientedOverlayRenderer INFINITY_EXTRACTOR_OVERLAY = oriented("overlay/multiblock/infinity_extractor");
    public static final OrientedOverlayRenderer LARGE_NAQ_REACTOR_OVERLAY = oriented(
            "overlay/multiblock/generators/large_naquadah");
    public static final OrientedOverlayRenderer MEGA_STEAM_ENGINE_OVERLAY = oriented(
            "overlay/multiblock/generators/mega_steam_engine");
    public static final OrientedOverlayRenderer NAQ_FUEL_CELL_PACKER_OVERLAY = oriented(
            "overlay/multiblock/naq_fuel_cell_packer");
    public static final OrientedOverlayRenderer PNEUMATIC_INFUSER_OVERLAY = oriented("overlay/multiblock/pneumatic_infuser");
    public static final OrientedOverlayRenderer STAR_SIPHON_OVERLAY = oriented("overlay/multiblock/star_siphon");
    public static final OrientedOverlayRenderer SYMPATHETIC_COMBUSTOR_OVERLAY = oriented(
            "overlay/multiblock/generators/sympathetic_combustor");
    public static final OrientedOverlayRenderer STRING_THEOREM_DETERMINATOR_OVERLAY = oriented("overlay/multiblock/string_theorem_determinator");
    public static final OrientedOverlayRenderer QUANTUM_STRING_DETERMINATOR_OVERLAY = oriented("overlay/multiblock/quantum_string_determinator");
    public static final OrientedOverlayRenderer SUPERPOSITION_LINKING_INTRADIMENSIONAL_MAGNETIC_ENERGIFIER_OVERLAY = oriented("overlay/multiblock/superposition_linking_intradimensional_magnetic_energifier");
    public static final OrientedOverlayRenderer GODLIKEBEINGS_USED_NEEDLE_OVERLAY = oriented("overlay/multiblock/godlikebeings_used_needle");
    public static final OrientedOverlayRenderer LET_ABSOLUTE_WORLD_NATURALLY_BECOME_ANSWER_SETTLING_EVERYTHING_OVERLAY = oriented("overlay/multiblock/let_absolute_world_naturally_become_answer_settling_everything");

    public static final TextureArea ROBOT_ARM_OVERLAY = fullImage("textures/gui/slot/robot_arm_overlay.png");


    private static SimpleOverlayRenderer simple(String basePath) {
        return new SimpleOverlayRenderer("gregtech:" + basePath);
    }

    private static OrientedOverlayRenderer oriented(String basePath) {
        return new OrientedOverlayRenderer("gregtech:" + basePath);
    }

    private static TextureArea fullImage(String imageLocation) {
        return new TextureArea(new ResourceLocation("gregtech", imageLocation), 0.0, 0.0, 1.0, 1.0);
    }
}
