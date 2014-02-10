package com.ryush00.PvPMinigames.Commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.ryush00.PvPMinigames.PvPMinigames;
import com.ryush00.PvPMinigames.Scripts.MainScripter;
import com.ryush00.PvPMinigames.Scripts.MainScripter.GameStatusList;

public class CmdPvPMinigames {
	private PvPMinigames plugin; // pointer to your main class, unrequired if you don't need methods from the main class
	public CmdPvPMinigames(PvPMinigames plugin) {
		this.plugin = plugin;
	}
	

	public boolean command(CommandSender sender, Command cmd, String label, String[] args) {
		if(args.length == 0)
			return false;
		if (!label.equalsIgnoreCase("pmg")){
			return false;
		}
		if(args[0].equalsIgnoreCase("start"))
		{
			MainScripter.cmdstart(sender, cmd, label, args);
			
		}
		else if(args[0].equalsIgnoreCase("stop"))
		{
			MainScripter.cmdstop(sender, cmd, label, args);
		}
		else if(args[0].equalsIgnoreCase("info"))
		{
		
		}

		return true;
	}
	


	public boolean cmdjoin(CommandSender sender, Command cmd, String label, String[] args) {
		return false;
		
	}


}
