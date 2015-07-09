package com.prondzyn.minecraft.plugin.commands;

/**
 * Created by <a href="http://prondzyn.com">prondzyn</a> on 2015-07-09.
 */
public final class PlayerCmds {

    public static void heal(org.bukkit.entity.Player player) {
        player.setHealth(20);
        player.setFoodLevel(20);
        player.setFireTicks(0);
    }

    private PlayerCmds() {
        super();
    }
}
