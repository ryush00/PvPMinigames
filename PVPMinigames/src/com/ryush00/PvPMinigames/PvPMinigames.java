package com.ryush00.PvPMinigames;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.ryush00.PvPMinigames.Commands.CmdPvPMinigames;

public class PvPMinigames extends JavaPlugin {

	public static Logger log = Logger.getLogger("Minecraft.PvPMiniGames");
	public Integer GameStatus = 0;
	public final CmdPvPMinigames commandhandler = new CmdPvPMinigames(this);
	public void onEnable()
	{
		PluginManager pm = getServer().getPluginManager();
		log.info("PvPMinigames Enabled!");
		log.info("Developed by ryush00!");
		log.info("You may not edit this plugin!");
		pm.registerEvents(new Listeners(), this);
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		return commandhandler.command(sender, args);
	}

	
	public void onDisable()
	{
		
	}

}
