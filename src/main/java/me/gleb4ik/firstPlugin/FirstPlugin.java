package me.gleb4ik.firstPlugin;

import me.gleb4ik.firstPlugin.commands.CalculatorCMD;
import me.gleb4ik.firstPlugin.commands.CalculatorCompleter;
import me.gleb4ik.firstPlugin.commands.MessageCMD;
import me.gleb4ik.firstPlugin.commands.MessageCompleter;
import me.gleb4ik.firstPlugin.entity.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Плагин стратанул");
        getCommand("calculator").setExecutor(new CalculatorCMD());
        getCommand("calculator").setTabCompleter(new CalculatorCompleter());

        getCommand("message").setExecutor(new MessageCMD());
        getCommand("message").setTabCompleter(new MessageCompleter());

        getCommand("spawnCreeper").setExecutor(new SpawnCreeper());
        getCommand("spawnCreeper").setTabCompleter(new SpawnCompleter());

        getCommand("spawnZombie").setExecutor(new SpawnZombie());
        getCommand("spawnZombie").setTabCompleter(new SpawnZombieCompleter());
    }

    @Override
    public void onDisable() {
        System.out.println("Плагин на стопе");
    }
}