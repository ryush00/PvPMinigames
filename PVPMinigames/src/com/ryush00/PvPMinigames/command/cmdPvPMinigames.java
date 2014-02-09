package com.ryush00.PvPMinigames.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;

public class cmdPvPMinigames implements Listener {
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		sender.sendMessage("명령어를 입력하셨습니다");
		return true;
	}
	

}
