package me.gleb4ik.firstPlugin;

import me.gleb4ik.firstPlugin.commands.CalculatorCMD;
import me.gleb4ik.firstPlugin.commands.MessageCMD;
import me.gleb4ik.firstPlugin.commands.MessageCompleter;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Плагин стратанул");
        getCommand("calculator").setExecutor(new CalculatorCMD());
        getCommand("message").setExecutor(new MessageCMD());
        getCommand("message").setTabCompleter(new MessageCompleter());

    }

    @Override
    public void onDisable() {
        System.out.println("Плагин на стопе");
    }
}
