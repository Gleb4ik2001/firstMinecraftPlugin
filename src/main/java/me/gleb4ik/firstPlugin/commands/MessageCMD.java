package me.gleb4ik.firstPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MessageCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args[0].equalsIgnoreCase("hello")){
            sender.sendMessage("Hello " + sender.getName());
            return true;
        }
        else if(args[0].equalsIgnoreCase("goodbye")){
            sender.sendMessage("Goodbye " + sender.getName());
            return true;
        }
        else if(args[0].equalsIgnoreCase("whatsup")){
            sender.sendMessage("Whazzup " + sender.getName());
            return true;
        }
        sender.sendMessage("Хуй знает что за аргумент!");
        return false;
    }
}
