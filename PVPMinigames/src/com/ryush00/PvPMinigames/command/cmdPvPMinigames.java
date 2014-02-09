package com.ryush00.PvPMinigames.command;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.ryush00.PvPMinigames.PvPMinigames;

public class cmdPvPMinigames {
	private PvPMinigames plugin; // pointer to your main class, unrequired if you don't need methods from the main class
	 
	public cmdPvPMinigames(PvPMinigames plugin) {
		this.plugin = plugin;
	}
	

	public boolean command(CommandSender sender, String[] args) {
		int len = args.length;
		String label = args[0];	
		if (label.equalsIgnoreCase("pmg")){
				sender.sendMessage("테스트에요.");
		}
		else if(label.equalsIgnoreCase("test"))
		{
				Player p = (Player)sender;
				p.playSound(p.getLocation(), Sound.ZOMBIE_PIG_HURT, 10, 1);
			
		}
		else
		{
			sender.sendMessage(args[0]);
		}

		return true;
	}

}
