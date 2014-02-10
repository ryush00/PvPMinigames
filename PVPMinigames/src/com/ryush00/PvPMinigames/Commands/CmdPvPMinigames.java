package com.ryush00.PvPMinigames.Commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.ryush00.PvPMinigames.PvPMinigames;

public class CmdPvPMinigames {
	private PvPMinigames plugin; // pointer to your main class, unrequired if you don't need methods from the main class
	 
	public CmdPvPMinigames(PvPMinigames plugin) {
		this.plugin = plugin;
	}
	

	public boolean command(CommandSender sender, Command cmd, String label, String[] args) {
		int len = args.length;
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
