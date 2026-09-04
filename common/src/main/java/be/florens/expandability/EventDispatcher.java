package be.florens.expandability;

import org.jetbrains.annotations.ApiStatus;

import be.florens.expandability.api.EventResult;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.material.FluidState;

public class EventDispatcher {

    @ExpectPlatform
    @ApiStatus.Internal
    public static EventResult onPlayerSwim(Player player) {
        throw new IllegalStateException();
    }

    @ExpectPlatform
    @ApiStatus.Internal
    public static boolean onLivingFluidCollision(LivingEntity entity, FluidState fluidState) {
        throw new IllegalStateException();
    }
}
