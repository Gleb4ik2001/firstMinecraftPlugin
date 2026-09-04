package me.gleb4ik.firstPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.List;

public class CalculatorCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0){
            return List.of("0", "1","2","3","4","5","6","7","8","9");
        }
        if (args.length == 1){
            return List.of("+", "-", "*", "/");
        }
        if (args.length == 2){
            return List.of("0", "1","2","3","4","5","6","7","8","9");
        }
        return List.of();
    }
}
