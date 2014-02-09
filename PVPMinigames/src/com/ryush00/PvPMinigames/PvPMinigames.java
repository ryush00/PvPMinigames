package com.ryush00.PvPMinigames;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class PvPMinigames extends JavaPlugin {

	public static Logger log = Logger.getLogger("Minecraft.PvPMiniGames");
	public Integer GameStatus = 0;
	
	public void onEnable()
	{
		PluginManager pm = getServer().getPluginManager();
		log.info("PvPMinigames Enabled!");
		log.info("Developed by ryush00!");
		log.info("You may not edit this plugin!");
		pm.registerEvents(new Listeners(), this);
	}
	
	public void onDisable()
	{
		
	}

}