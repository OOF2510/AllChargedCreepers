package me.nate.acc;

import org.bukkit.plugin.java.JavaPlugin;

import me.nate.acc.listeners.SpawnListen;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		new SpawnListen(this);
	}
	
}
