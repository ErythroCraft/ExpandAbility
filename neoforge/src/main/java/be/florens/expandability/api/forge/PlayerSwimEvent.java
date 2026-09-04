package be.florens.expandability.api.forge;

import be.florens.expandability.api.EventResult;
import net.minecraft.world.entity.player.Player; // Geändert von Avatar zu Player
import net.neoforged.neoforge.event.entity.living.LivingEvent;

public class PlayerSwimEvent extends LivingEvent {

    private final Player player; // Geändert zu Player
    private EventResult result = EventResult.PASS;

    public PlayerSwimEvent(Player player) { // Geändert zu Player
        super(player);
        this.player = player;
    }

    @Override
    public Player getEntity() { // Geändert zu Player
        return player;
    }

    public EventResult getResult() {
        return result;
    }

    public void setResult(EventResult result) {
        this.result = result;
    }
}
