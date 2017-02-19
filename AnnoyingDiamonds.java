package com.kNoAPP.AnnoyingDiamonds;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class AnnoyingDiamonds extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable() {
		
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		return false;
	}
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if(p.getInventory().getItemInMainHand() != null) {
			ItemStack is = p.getInventory().getItemInMainHand();
			if(is.getType() == Material.DIAMOND) {
				p.playSound(p.getLocation(), Sound.ENTITY_GHAST_SCREAM, 1F, 1F);
			}
		}
	}
}
