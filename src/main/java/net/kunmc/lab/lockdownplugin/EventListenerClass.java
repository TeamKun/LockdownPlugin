package net.kunmc.lab.lockdownplugin;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class EventListenerClass implements Listener{
    @EventHandler
    public void onHouseEvent(PlayerMoveEvent event) {
        Player p = event.getPlayer();
        Location loc = p.getLocation();
        int playerPositionY = loc.getBlockY();
        int highestBlock = loc.getWorld().getHighestBlockAt(loc).getY();
        GameMode g = p.getGameMode();
        if ((playerPositionY > highestBlock)& (g.equals(GameMode.SURVIVAL))) {
            p.setHealth(0);
        }
    /*public void onDeath(PlayerDeathEvent event) {
            Player p = event.getPlayer();
            String name = p.getName();

        }*/
    }
}

