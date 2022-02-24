package cgpl_plugin.cgpl_plugin;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityBreakDoorEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.bukkit.event.weather.WeatherEvent;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public final class CGPL_Plugin extends JavaPlugin implements Listener {


    Inventory inv = Bukkit.createInventory(null, 27, "상점");


    @Override
    public void onEnable() {
        System.out.println("plugin enabled");

        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        System.out.println("plugin Disabled");
    }



    @EventHandler
    public void onClick(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        Action a = e.getAction();
        Location l = p.getLocation();
        UUID uuid = p.getUniqueId();



        if(a == Action.RIGHT_CLICK_AIR || a == Action.RIGHT_CLICK_BLOCK) {

            if(p.getItemInHand().getType().equals(Material.DIAMOND_AXE)) {
                p.setVelocity(p.getLocation().getDirection().multiply(1.1));

                }

            }


            }









    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("la")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                Location l = p.getLocation();

                if(p.getItemInHand().getType().equals(Material.DIAMOND)) {
                    p.sendMessage("위치 X:" + l.getBlockX() + "  " + "Y:" + l.getBlockY() + "     " + "Z:" + l.getBlockZ());

                } else {
                    p.sendMessage("좌표를 확인하려면 다이아몬드를 손에 들고 시도해주세요.");
                }

            }
            return true;
        }
        return false;
    }

    }





