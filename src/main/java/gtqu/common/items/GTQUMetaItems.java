package gtqu.common.items;

import gregtech.api.items.metaitem.MetaItem;
import gregtech.api.items.metaitem.StandardMetaItem;

public class GTQUMetaItems {
    public static MetaItem<?>.MetaValueItem BLINDING_GLOWSTONE;
    public static MetaItem<?>.MetaValueItem ULTRADENSE_POWDER;

    public static MetaItem<?>.MetaValueItem BOTATHAUMAHAEMIC_SENTIENT_DIODE;
    public static MetaItem<?>.MetaValueItem BOTATHAUMAHAEMIC_SENTIENT_HIVEMIND_CELL;
    public static MetaItem<?>.MetaValueItem BOTATHAUMAHAEMIC_SENTIENT_HIVEMIND;

    public static MetaItem<?>.MetaValueItem ASTROTHAUMIC_CONSTELLATIONATTUNED_ARCHIVE;
    public static MetaItem<?>.MetaValueItem CONSTELLATIONATTUNED_DIASTRODE;

    public static MetaItem<?>.MetaValueItem ASTROTHAUMAMANIC_CONSTELLATIONLINKED_REPOSITORY;

    public static MetaItem<?>.MetaValueItem HYPERCONDUCTING_ANTISCHRABIDIC_CIRCUIT;
    public static MetaItem<?>.MetaValueItem HYPERCONDUCTING_ANTISCHRABIDIC_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem HYPERCONDUCTING_ANTISCHRABIDIC_COMPUTER;
    public static MetaItem<?>.MetaValueItem HYPERCONDUCTING_ANTISCHRABIDIC_MAINFRAME;
    public static MetaItem<?>.MetaValueItem SPARKSCHRABIDIC_EPOXY_RESIN_SHEET;
    public static MetaItem<?>.MetaValueItem SPARKSCHRABIDIC_CIRCUIT_BOARD;

    public static MetaItem<?>.MetaValueItem STRING_OF_STRADIVARI;
    public static MetaItem<?>.MetaValueItem STRING_OF_HAWKING;
    public static MetaItem<?>.MetaValueItem STRING_OF_IRIS;
    public static MetaItem<?>.MetaValueItem STRING_OF_KUZU;

    public static MetaItem<?>.MetaValueItem STRINGENTANGLED_CIRCUIT;
    public static MetaItem<?>.MetaValueItem STRINGENTANGLED_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem STRINGENTANGLED_COMPUTER;
    public static MetaItem<?>.MetaValueItem STRINGENTANGLED_MAINFRAME;
    public static MetaItem<?>.MetaValueItem STRINGENTANGLED_EPOXY_RESIN_SHEET;
    public static MetaItem<?>.MetaValueItem STRINGENTANGLED_CIRCUIT_BOARD;

    public static MetaItem<?>.MetaValueItem EXOTIC_CIRCUIT;
    public static MetaItem<?>.MetaValueItem EXOTIC_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem EXOTIC_COMPUTER;
    public static MetaItem<?>.MetaValueItem EXOTIC_MAINFRAME;
    public static MetaItem<?>.MetaValueItem EXOTIC_EPOXY_RESIN_SHEET;
    public static MetaItem<?>.MetaValueItem EXOTIC_CIRCUIT_BOARD;

    public static MetaItem<?>.MetaValueItem SUPERPOSITIONLINKED_PARTICLES;
    public static MetaItem<?>.MetaValueItem SUPERPOSITIONLINKED_CIRCUIT;
    public static MetaItem<?>.MetaValueItem SUPERPOSITIONLINKED_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem SUPERPOSITIONLINKED_COMPUTER;
    public static MetaItem<?>.MetaValueItem SUPERPOSITIONLINKED_MAINFRAME;
    public static MetaItem<?>.MetaValueItem SUPERPOSITIONLINKED_EPOXY_RESIN_SHEET;
    public static MetaItem<?>.MetaValueItem SUPERPOSITIONLINKED_CIRCUIT_BOARD;

    public static MetaItem<?>.MetaValueItem ABSOLUTE_ITEM;
    public static MetaItem<?>.MetaValueItem ABSOLUTE_CIRCUIT;
    public static MetaItem<?>.MetaValueItem ABSOLUTE_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem ABSOLUTE_COMPUTER;
    public static MetaItem<?>.MetaValueItem ABSOLUTE_MAINFRAME;
    public static MetaItem<?>.MetaValueItem ABSOLUTE_EPOXY_RESIN_SHEET;
    public static MetaItem<?>.MetaValueItem ABSOLUTE_CIRCUIT_BOARD;

    private GTQUMetaItems() {

    }



    public static void preInit() {
        ITEMS = new StandardMetaItem();

        ITEMS.setRegistryName("gtqu_item");
    }

    public static void initItems() {
        BLINDING_GLOWSTONE = ITEMS.addItem(0, "blinding_glowstone");
        ULTRADENSE_POWDER = ITEMS.addItem(1, "ultradense_powder");

        BOTATHAUMAHAEMIC_SENTIENT_DIODE = ITEMS.addItem(2, "botathaumahaemic_sentient_diode");
        BOTATHAUMAHAEMIC_SENTIENT_HIVEMIND_CELL = ITEMS.addItem(3, "botathaumahaemic_sentient_hivemind_cell");
        BOTATHAUMAHAEMIC_SENTIENT_HIVEMIND = ITEMS.addItem(4, "botathaumahaemic_sentient_hivemind");

        ASTROTHAUMIC_CONSTELLATIONATTUNED_ARCHIVE = ITEMS.addItem(5, "astrothaumic_constellationattuned_archive");
        CONSTELLATIONATTUNED_DIASTRODE = ITEMS.addItem(6, "constellationattuned_diastrode");

        ASTROTHAUMAMANIC_CONSTELLATIONLINKED_REPOSITORY = ITEMS.addItem(7, "astrothaumamanic_constellationlinked_repository");

        HYPERCONDUCTING_ANTISCHRABIDIC_CIRCUIT = ITEMS.addItem(8, "hyperconducting_antischrabidic_circuit");
        HYPERCONDUCTING_ANTISCHRABIDIC_ASSEMBLY = ITEMS.addItem(9, "hyperconducting_antischrabidic_assembly");
        HYPERCONDUCTING_ANTISCHRABIDIC_COMPUTER = ITEMS.addItem(10, "hyperconducting_antischrabidic_computer");
        HYPERCONDUCTING_ANTISCHRABIDIC_MAINFRAME = ITEMS.addItem(11, "hyperconducting_antischrabidic_mainframe");
        SPARKSCHRABIDIC_EPOXY_RESIN_SHEET = ITEMS.addItem(12, "sparkschrabidic_epoxy_resin_sheet");
        SPARKSCHRABIDIC_CIRCUIT_BOARD = ITEMS.addItem(13, "sparkschrabidic_circuit_board");

        STRING_OF_STRADIVARI = ITEMS.addItem(14, "string_of_stradivari");
        STRING_OF_HAWKING = ITEMS.addItem(15, "string_of_hawking");
        STRING_OF_IRIS = ITEMS.addItem(16, "string_of_iris");
        STRING_OF_KUZU = ITEMS.addItem(17, "string_of_kuzu");

        STRINGENTANGLED_CIRCUIT = ITEMS.addItem(18, "stringentangled_circuit");
        STRINGENTANGLED_ASSEMBLY = ITEMS.addItem(19, "stringentangled_assembly");
        STRINGENTANGLED_COMPUTER = ITEMS.addItem(20, "stringentangled_computer");
        STRINGENTANGLED_MAINFRAME = ITEMS.addItem(21, "stringentangled_mainframe");
        STRINGENTANGLED_EPOXY_RESIN_SHEET = ITEMS.addItem(22, "stringentangled_epoxy_resin_sheet");
        STRINGENTANGLED_CIRCUIT_BOARD = ITEMS.addItem(23, "stringentangled_circuit_board");

        EXOTIC_CIRCUIT = ITEMS.addItem(24, "exotic_circuit");
        EXOTIC_ASSEMBLY = ITEMS.addItem(25, "exotic_assembly");
        EXOTIC_COMPUTER = ITEMS.addItem(26, "exotic_computer");
        EXOTIC_MAINFRAME = ITEMS.addItem(27, "exotic_mainframe");
        EXOTIC_EPOXY_RESIN_SHEET = ITEMS.addItem(28, "exotic_epoxy_resin_sheet");
        EXOTIC_CIRCUIT_BOARD = ITEMS.addItem(29, "exotic_circuit_board");

        SUPERPOSITIONLINKED_PARTICLES = ITEMS.addItem(30, "superpositionlinked_particles");
        SUPERPOSITIONLINKED_CIRCUIT = ITEMS.addItem(31, "superpositionlinked_circuit");
        SUPERPOSITIONLINKED_ASSEMBLY = ITEMS.addItem(32, "superpositionlinked_assembly");
        SUPERPOSITIONLINKED_COMPUTER = ITEMS.addItem(33, "superpositionlinked_computer");
        SUPERPOSITIONLINKED_MAINFRAME = ITEMS.addItem(34, "superpositionlinked_mainframe");
        SUPERPOSITIONLINKED_EPOXY_RESIN_SHEET = ITEMS.addItem(35, "superpositionlinked_epoxy_resin_sheet");
        SUPERPOSITIONLINKED_CIRCUIT_BOARD = ITEMS.addItem(36, "superpositionlinked_circuit_board");

        ABSOLUTE_ITEM = ITEMS.addItem(37, "absolute_item");
        ABSOLUTE_CIRCUIT = ITEMS.addItem(38, "absolute_circuit");
        ABSOLUTE_ASSEMBLY = ITEMS.addItem(39, "absolute_assembly");
        ABSOLUTE_COMPUTER = ITEMS.addItem(40, "absolute_computer");
        ABSOLUTE_MAINFRAME = ITEMS.addItem(41, "absolute_mainframe");
        ABSOLUTE_EPOXY_RESIN_SHEET = ITEMS.addItem(42, "absolute_epoxy_resin_sheet");
        ABSOLUTE_CIRCUIT_BOARD = ITEMS.addItem(43, "absolute_circuit_board");
    }

    public static MetaItem<?> ITEMS;
}
