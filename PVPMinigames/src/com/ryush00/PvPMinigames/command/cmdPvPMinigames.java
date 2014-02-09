package com.ryush00.PvPMinigames.command;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.ryush00.PvPMinigames.PvPMinigames;

public class cmdPvPMinigames implements CommandExecutor {
	private PvPMinigames plugin; // pointer to your main class, unrequired if you don't need methods from the main class
	 
	public cmdPvPMinigames(PvPMinigames plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		sender.sendMessage("명령어를 입력하셨습니다");
		sender.sendMessage(args[0]);
		return true;
	}
	public boolean command(CommandSender sender, String[] args) {
		int len = args.length;
		String label = args[0];	
		if (label.equalsIgnoreCase("pgm")){
			if(args[1].equalsIgnoreCase("test")){
				sender.sendMessage("테스트에요.");
			}
			else if(args[1].equalsIgnoreCase("test"))
			{
				Player p = (Player)sender;
				p.playSound(p.getLocation(), Sound.ZOMBIE_PIG_HURT, 10, 1);
			
			}
			return true;
		}

		return true;
	}

}
