package gtqu;

import gregtech.GTInternalTags;
import gregtech.api.GTValues;
import gregtech.api.block.VariantItemBlock;
import gtqu.common.blocks.MetaBlocks;
import gtqu.common.items.GTQUMetaItems;
import gtqu.common.metatileentities.QUMetaTileEntities;
import gtqu.gtqucore.Tags;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;
import java.util.function.Function;

@Mod(modid = Tags.MOD_ID, name = Tags.MOD_NAME, version = Tags.VERSION, dependencies = GTInternalTags.DEP_VERSION_STRING)
public class GTQUCore {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MOD_NAME);

    @EventHandler
    public void onConstruction(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        QUMetaTileEntities.init();

        GTQUMetaItems.preInit();

        MetaBlocks.init();

    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event)  {
        LOGGER.info("Registering items...");
        GTQUMetaItems.initItems();

        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(createItemBlock(MetaBlocks.STANDARD_CASING, VariantItemBlock::new));
    }
    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        LOGGER.info("Registering blocks...");
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(MetaBlocks.STANDARD_CASING);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        MetaBlocks.registerItemModels();
    }

    private static <T extends Block> ItemBlock createItemBlock(T block, Function<T, ItemBlock> producer) {
        ItemBlock itemBlock = producer.apply(block);
        itemBlock.setRegistryName(Objects.requireNonNull(block.getRegistryName()));
        return itemBlock;
    }
}
