package me.cupcqkeee;

import me.cupcqkeee.functions.Bannedmending;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() { // Сообщение либо функция при включении плагина
        getLogger().info(ChatColor.GREEN + "Плагин MineElytra был успешно включён!");
        }


    private void registerEvents() { // Задействовали BannedMending, Да можно и по-другому но я ленивая жопа
        this.getServer().getPluginManager().registerEvents(new Bannedmending(), this);
    }

    @Override
    public void onDisable() { // Сообщение либо функция при выключении плагина
        getLogger().info(ChatColor.RED + "Плагин MineElytra был выключен!");
    }
}
