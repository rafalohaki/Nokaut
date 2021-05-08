package me.smaks6.plugin.Listener;

import me.smaks6.api.Enum.Nokaut;
import me.smaks6.api.utilities.PlayerUtilities;
import me.smaks6.plugin.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;

public class KickPlayerListenear implements Listener {

    @EventHandler
    public void kickListenear(PlayerKickEvent event) {
        Player p = event.getPlayer();

        if(PlayerUtilities.getEnum(p).equals(Nokaut.CARRY) && event.getReason().contains("Cannot interact with self!")) {
            event.setCancelled(true);
            p.sendMessage(ChatColor.RED + Main.getInstance().getConfig().getString("cancelmessage"));
        }

    }
}
