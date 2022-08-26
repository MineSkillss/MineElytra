package me.cupcqkeee.functions;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;

public class Bannedmending implements Listener {
    public Bannedmending(){
    }
    @EventHandler(priority = EventPriority.HIGHEST)
    public void on(PrepareAnvilEvent event) {
        Player p = (Player)event.getView().getPlayer();
        ItemStack stack = event.getResult();
        if (stack != null && stack.getType() == Material.ELYTRA && stack.getItemMeta().getEnchants().containsKey(Enchantment.MENDING) && !p.hasPermission("MineElytra")) {
            event.setResult(new ItemStack(Material.AIR));
            p.sendMessage(ChatColor.RED + "Вы не можете накладывать починку на элитры!");
        }
    }
}
