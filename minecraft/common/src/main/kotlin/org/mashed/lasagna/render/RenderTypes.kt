package me.crackhead.potato_battery.render

import com.mojang.blaze3d.vertex.DefaultVertexFormat
import com.mojang.blaze3d.vertex.VertexFormat
import net.minecraft.client.renderer.RenderStateShard
import net.minecraft.client.renderer.RenderType

// Based of Create Mod by simibubi
object RenderTypes : RenderStateShard("lasagna:render_types",
    {}, {}
) {
    val solid = RenderType.solid()
    val cutout = RenderType.cutout()
    val cutoutMipped = RenderType.cutoutMipped()
    val translucent = RenderType.translucent()
    val translucentNoCrumbling = RenderType.translucentNoCrumbling()
    val lines = RenderType.lines()

    val solidOutline: RenderType = RenderType.create(
        "outline_solid", DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS,
        256, false, false,
        RenderType.CompositeState.builder()
            .setShaderState(RENDERTYPE_ENTITY_SOLID_SHADER)
            .setTextureState(TextureStateShard(SpecialTextures.BLANK.location, false, false))
            .setCullState(CULL)
            .setLightmapState(LIGHTMAP)
            .setOverlayState(OVERLAY)
            .createCompositeState(false)
    )

    val solidOutlineGlow: RenderType = RenderType.create(
        "outline_solidglow", DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS,
        256, true, false,
        RenderType.CompositeState.builder()
            .setShaderState(RENDERTYPE_GLINT_SHADER)
            .setTextureState(TextureStateShard(SpecialTextures.BLANK.location, false, false))
            .setCullState(CULL)
            .setLightmapState(LIGHTMAP)
            .setOverlayState(OVERLAY)
            .createCompositeState(false)
    )

    /*

    fun getOutlineTranslucent(texture: ResourceLocation?, cull: Boolean): RenderType {
        return RenderType.create(
            createLayerName("outline_translucent" + if (cull) "_cull" else ""),
            DefaultVertexFormat.NEW_ENTITY,
            VertexFormat.Mode.QUADS,
            256,
            false,
            true,
            RenderType.CompositeState.builder()
                .setShaderState(if (cull) RENDERTYPE_ENTITY_TRANSLUCENT_CULL_SHADER else RENDERTYPE_ENTITY_TRANSLUCENT_SHADER)
                .setTextureState(TextureStateShard(texture, false, false))
                .setTransparencyState(TRANSLUCENT_TRANSPARENCY)
                .setCullState(if (cull) CULL else NO_CULL)
                .setLightmapState(LIGHTMAP)
                .setOverlayState(OVERLAY)
                .setWriteMaskState(COLOR_WRITE)
                .createCompositeState(false)
        )
    }

    fun getGlowingSolid(texture: ResourceLocation?): RenderType {
        return RenderType.create(
            createLayerName("glowing_solid"), DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS, 256,
            true, false, RenderType.CompositeState.builder()
                .setShaderState(NO_SHADER)
                .setTextureState(TextureStateShard(texture, false, false))
                .setCullState(CULL)
                .setLightmapState(LIGHTMAP)
                .setOverlayState(OVERLAY)
                .createCompositeState(true)
        )
    }

    val glowingSolid = getGlowingSolid(InventoryMenu.BLOCK_ATLAS)

    fun getGlowingTranslucent(texture: ResourceLocation?): RenderType {
        return RenderType.create(
            createLayerName("glowing_translucent"), DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS,
            256, true, true, RenderType.CompositeState.builder()
                .setShaderState(NO_SHADER)
                .setTextureState(TextureStateShard(texture, false, false))
                .setTransparencyState(TRANSLUCENT_TRANSPARENCY)
                .setLightmapState(LIGHTMAP)
                .setOverlayState(OVERLAY)
                .createCompositeState(true)
        )
    }

    val additive: RenderType = RenderType.create(
        createLayerName("additive"), DefaultVertexFormat.BLOCK,
        VertexFormat.Mode.QUADS, 256, true, true, RenderType.CompositeState.builder()
            .setShaderState(BLOCK_SHADER)
            .setTextureState(TextureStateShard(InventoryMenu.BLOCK_ATLAS, false, false))
            .setTransparencyState(ADDITIVE_TRANSPARENCY)
            .setCullState(NO_CULL)
            .setLightmapState(LIGHTMAP)
            .setOverlayState(OVERLAY)
            .createCompositeState(true)
    )
    val glowingTranslucent = getGlowingTranslucent(InventoryMenu.BLOCK_ATLAS)
    val itemPartialSolid: RenderType = RenderType.create(
        createLayerName("item_partial_solid"), DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS, 256, true,
        false, RenderType.CompositeState.builder()
            .setShaderState(RENDERTYPE_ENTITY_SOLID_SHADER)
            .setTextureState(BLOCK_SHEET)
            .setCullState(CULL)
            .setLightmapState(LIGHTMAP)
            .setOverlayState(OVERLAY)
            .createCompositeState(true)
    )
    val itemPartialTranslucent: RenderType = RenderType.create(
        createLayerName("item_partial_translucent"),
        DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS, 256, true, true, RenderType.CompositeState.builder()
            .setShaderState(RENDERTYPE_ENTITY_TRANSLUCENT_CULL_SHADER)
            .setTextureState(BLOCK_SHEET)
            .setTransparencyState(TRANSLUCENT_TRANSPARENCY)
            .setLightmapState(LIGHTMAP)
            .setOverlayState(OVERLAY)
            .createCompositeState(true)
    )
    val fluid: RenderType = RenderType.create(
        createLayerName("fluid"),
        DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS, 256, false, true, RenderType.CompositeState.builder()
            .setShaderState(RENDERTYPE_ENTITY_TRANSLUCENT_CULL_SHADER)
            .setTextureState(BLOCK_SHEET_MIPPED)
            .setTransparencyState(TRANSLUCENT_TRANSPARENCY)
            .setLightmapState(LIGHTMAP)
            .setOverlayState(OVERLAY)
            .createCompositeState(true)
    )
*/

}