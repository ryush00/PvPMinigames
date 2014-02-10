package com.ryush00.PvPMinigames.Scripts;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class MainScripter {
	public enum GameStatusList{
		NoPlay,
		Ready,
		Start,
	}
	public static GameStatusList GameStatus = GameStatusList.NoPlay;
	
	public static boolean cmdstart(CommandSender sender, Command cmd, String label, String[] args) {
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

	public static boolean cmdstop(CommandSender sender, Command cmd, String label, String[] args) {
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
	
}
