package com.github.cp02a.cuberunnerreloaded;

import org.bukkit.plugin.java.JavaPlugin;

public class CubeRunnerReloaded extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("CubeRunnerReloaded successfully enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("CubeRunnerReloaded successfully disabled!");
    }
}
