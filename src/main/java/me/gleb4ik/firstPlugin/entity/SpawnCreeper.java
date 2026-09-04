package me.gleb4ik.firstPlugin.entity;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.yaml.snakeyaml.parser.Parser;

public class SpawnCreeper implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        try {
            int counter = Integer.parseInt(args[0]);
            for (int i = 0; i < counter; i++) {
                Creeper creeper = (Creeper) player.getWorld().spawnEntity(player.getLocation(), EntityType.CREEPER);
                creeper.setPowered(true);
                creeper.ignite();
            }
            return true;
        } catch (NumberFormatException e) {
            sender.sendMessage("Напишите валидное количество мобов!");
            return false;
        }
    }
}
