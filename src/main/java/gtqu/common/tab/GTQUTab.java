package gtqu.common.tab;

import gtqu.common.items.GTQUMetaItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GTQUTab extends CreativeTabs {
    public GTQUTab() {
        super("gtqucore");
    }

    public ItemStack getTabIconItem() { return GTQUMetaItems.HYPERCONDUCTING_ANTISCHRABIDIC_CIRCUIT.getStackForm(); }


    @Override
    public ItemStack createIcon() {
        return getTabIconItem();
    }
}
