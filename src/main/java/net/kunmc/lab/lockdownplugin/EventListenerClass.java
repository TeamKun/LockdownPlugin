package net.kunmc.lab.lockdownplugin;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import static org.bukkit.Bukkit.getServer;

public class EventListenerClass implements Listener{
    public boolean night() {
        Server server = getServer();
        String worldName = server.getWorlds().get(0).getName();
        long time = server.getWorld(worldName).getTime() ;

        return ((13000 < time) & (time < 23992));

    }
    @EventHandler
    public void onHouseEvent(PlayerMoveEvent event) {
        Player p = event.getPlayer();
        Location loc = p.getLocation();
        int playerPositionY = loc.getBlockY();
        int highestBlock = loc.getWorld().getHighestBlockAt(loc).getY();
        GameMode g = p.getGameMode();
        if ((playerPositionY > highestBlock)& (g.equals(GameMode.SURVIVAL)) & night()) {
            p.setHealth(0);
        }
    }
}

