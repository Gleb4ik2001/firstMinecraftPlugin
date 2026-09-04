package me.gleb4ik.firstPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CalculatorCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        long firstNum;
        long secondNum;
        long result;
        try {
            firstNum = Long.parseLong(args[0]);
            secondNum = Long.parseLong(args[2]);
        } catch (NumberFormatException e) {
            sender.sendMessage("Введите числа");
            return false;
        }
        switch (args[1]){
            case "+":
                result = firstNum + secondNum;
                sender.sendMessage("Ответ: " + result);
                return true;
            case "-":
                result = firstNum - secondNum;
                sender.sendMessage("Ответ: " + result);
                return true;
            case "*":
                result = firstNum * secondNum;
                sender.sendMessage("Ответ: " + result);
                return true;
            case "/":
                result = firstNum / secondNum;
                sender.sendMessage("Ответ: " + result);
                return true;
            default:
                sender.sendMessage("Введите корректный знак. (+ - * /)");
                return false;
        }
    }
}
