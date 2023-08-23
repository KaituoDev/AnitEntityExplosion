package fun.kaituo.event;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class onExplode implements Listener {

    @EventHandler
    public void onEntityExplode(EntityExplodeEvent event) {
        Entity entity = event.getEntity();
        EntityType entityType = entity.getType();
        if (entityType == EntityType.CREEPER || entityType == EntityType.GHAST) {
            event.blockList().clear();
        }

    }
}
