package com.prondzyn.minecraft.plugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import static com.prondzyn.minecraft.plugin.commands.PlayerCmds.heal;

/**
 * Created by <a href="http://prondzyn.com">prondzyn</a> on 2015-07-06.
 */
public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("VFP is starting...");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if ("heal".equalsIgnoreCase(command.getName())) {
            if (sender instanceof Player) {
                if (args.length == 0) {
                    heal((Player) sender);
                } else {
                    String playerName = args[0];
                    Player player = Bukkit.getPlayer(playerName);
                    if (null != player) {
                        heal(player);
                    } else {
                        sender.sendMessage("No such player found online.");
                    }
                }
            } else {
                sender.sendMessage("You are not a player!");
            }
        }
        return false;
    }

    @Override
    public void onDisable() {
        System.out.println("VFP is shutting down...");
    }
}
