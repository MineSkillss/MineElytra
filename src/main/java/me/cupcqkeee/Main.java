package me.cupcqkeee;

import me.cupcqkeee.functions.Bannedmending;
import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener {
    public Main() {
    }
    @Override
    public void onEnable() {
        this.registerEvents();
        if (this.isEnabled()) {
            this.getLogger().log(Level.INFO, ChatColor.GREEN + "MineElytra" + ChatColor.AQUA + "v1.0");
        } else{
            this.getLogger().log(Level.WARNING, ChatColor.RED + "Непредвиденная ошибка! Обратитесь к разработчику!");
        }
        }

    private void registerEvents() {
        this.getServer().getPluginManager().registerEvents(new Bannedmending(), this);
    }

    @Override
    public void onDisable() {

        this.getLogger().log(Level.SEVERE, ChatColor.YELLOW + "Плагин успешно был выключен");

    }
}
