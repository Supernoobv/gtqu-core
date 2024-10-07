package gtqu.api.util;

import gtqu.gtqucore.Tags;
import net.minecraft.util.ResourceLocation;

public class QUUtil {
    public static ResourceLocation id(String value) {
        return new ResourceLocation(Tags.MOD_ID, value);
    }
}
