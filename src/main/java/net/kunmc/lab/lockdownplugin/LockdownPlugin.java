package net.kunmc.lab.lockdownplugin;

import net.kunmc.lab.lockdownplugin.common.MessageUtil;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class LockdownPlugin extends JavaPlugin {

    private static Plugin plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        getLogger().info(MessageUtil.getStartMessage());
        Bukkit.getServer().getPluginManager().registerEvents(new EventListenerClass(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info(MessageUtil.getEndMessage());
    }
}
