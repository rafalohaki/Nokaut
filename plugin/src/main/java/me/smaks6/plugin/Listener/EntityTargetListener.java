package me.smaks6.plugin.Listener;

import me.smaks6.plugin.utilities.PlayerUtilities;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;

public class EntityTargetListener implements Listener {

    @EventHandler
    public void setEntityTargetEvent(EntityTargetEvent event) {
        if(event.getTarget() instanceof Player){
            Player player = (Player) event.getTarget();

            if(!PlayerUtilities.isNull(player)){
                event.setTarget(null);
            }
        }
    }
}
