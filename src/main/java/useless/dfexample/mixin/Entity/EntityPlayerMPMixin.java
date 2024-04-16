package useless.dfexample.mixin.Entity;

import net.minecraft.client.Minecraft;
import net.minecraft.core.net.packet.Packet100OpenWindow;
import net.minecraft.server.entity.player.EntityPlayerMP;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
@Mixin(value = EntityPlayerMP.class, remap = false)
public abstract class EntityPlayerMPMixin {
	@Unique
	private final Minecraft mc = Minecraft.getMinecraft(this);
	@Unique
	private final EntityPlayerMP thisAs = (EntityPlayerMP)(Object)this;
	@Shadow
	private void getNextWindowId() {}
	@Shadow
	private int currentWindowId = 0;
}
