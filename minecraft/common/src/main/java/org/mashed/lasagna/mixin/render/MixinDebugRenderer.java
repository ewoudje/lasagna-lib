package org.mashed.lasagna.mixin.render;

import com.mojang.blaze3d.vertex.PoseStack;
import org.mashed.lasagna.api.debug.DebugHelper;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.debug.DebugRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DebugRenderer.class)
public class MixinDebugRenderer {

    @Inject(at = @At("HEAD"), method = "render")
    void render(PoseStack poseStack, MultiBufferSource.BufferSource bufferSource, double camX, double camY, double camZ, CallbackInfo ci) {
        DebugHelper.INSTANCE.getDebugRenderers$lasagna().forEach(renderer -> renderer.render(poseStack, bufferSource, camX, camY, camZ));
    }

}