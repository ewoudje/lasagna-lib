package org.mashed.lasagna.fabric.services;

import kotlin.jvm.functions.Function0;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.mashed.lasagna.services.LasagnaPlatformHelper;
import org.jetbrains.annotations.NotNull;
import org.mashed.lasagna.services.LasagnaPlatformHelper;

public class LasagnaPlatformHelperFabric implements LasagnaPlatformHelper {
    @NotNull
    @Override
    public CreativeModeTab createCreativeTab(@NotNull ResourceLocation id, @NotNull Function0<ItemStack> stack) {
        return FabricItemGroupBuilder.build(id, stack::invoke);
    }
}