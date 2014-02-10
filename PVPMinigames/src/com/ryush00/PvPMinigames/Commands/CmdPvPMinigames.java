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
		if(args.length == 1)
			return false;
		if (!label.equalsIgnoreCase("pmg")){
			return false;
		}
		if(args[0].equalsIgnoreCase("start"))
		{
				cmdstart(sender, cmd, label, args);
			
		}
		else if(args[0].equalsIgnoreCase("stop"))
		{
			cmdstop(sender, cmd, label, args);
		}
		else if(args[0].equalsIgnoreCase("info"))
		{
		
		}

		return false;
	}
	
	public boolean cmdstart(CommandSender sender, Command cmd, String label, String[] args) {
		if(MainScripter.GameStatus==GameStatusList.NoPlay) {
			//gamestart();
			sender.sendMessage("게임시작스크립트 없긔. 어쨌든 시작");
			MainScripter.GameStatus=GameStatusList.Ready;
			return true;
		} else {
			sender.sendMessage("이미 시작되었습니다");
			return true;
		}
		
	}

	public boolean cmdstop(CommandSender sender, Command cmd, String label, String[] args) {
		if(MainScripter.GameStatus != GameStatusList.NoPlay){
			//gamestop();
			sender.sendMessage("게임정지스크립트 없긔. 어쨌든 정지");
			MainScripter.GameStatus=GameStatusList.NoPlay;
			return true;
		} else {
			sender.sendMessage("이미 시작되었습니다");
			return true;
		}
		
	}

	public boolean cmdjoin(CommandSender sender, Command cmd, String label, String[] args) {
		return false;
		
	}


}
