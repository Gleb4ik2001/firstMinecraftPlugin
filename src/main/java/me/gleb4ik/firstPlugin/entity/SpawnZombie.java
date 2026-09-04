package me.gleb4ik.firstPlugin.entity;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;

public class SpawnZombie implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        try {
            int quantity = Integer.parseInt(args[0]);
            for (int i = 0; i < quantity; i++) {
                Zombie zombie = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
            }
            return true;
        } catch (NumberFormatException e) {
            sender.sendMessage("Введите корректное число, " + sender.getName());
            return false;
        }
    }
}
