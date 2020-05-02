package store.intent.zerodevelop.executor;

import java.util.ArrayList;
import java.util.List;

import store.intent.zerodevelop.api.Player;
import store.intent.zerodevelop.api.World;
import store.intent.zerodevelop.event.EventMotion;
import store.intent.zerodevelop.event.EventMove;
import store.intent.zerodevelop.event.EventReceivePacket;
import store.intent.zerodevelop.event.EventSendPacket;
import store.intent.zerodevelop.executor.settings.Setting;
import store.intent.zerodevelop.util.Version;

public abstract class Module {

	public Player player;
	public World world;
	public List<Setting> settings = new ArrayList<Setting>();
	
	public void addSetting(Setting setting) {
		settings.add(setting);
	}
	
	/**
	 * @see addSetting
	 */
	public abstract void registerSettings();

	//TODO KEEP API UP TO DATE
	/**
	 * @return Version of API this module was built with; 1.1.0
	 */
	public abstract Version getBuildVersion();
	
	public abstract String getDescription();
	
	public abstract Category getCategory();
	
	public void setPlayer(Player p) {
		player = p;
	}
	
	public void setWorld(World w) {
		world = w;
	}
	
	public void tick() {
		if(player != null && world != null)
			onTick();
	}
	
	public void update() {
		if(player != null && world != null)
			onUpdate();
	}
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	public void onTick(){
		
	}
	
	public void onUpdate() {
		
	}
	
	public void onMotion(EventMotion event) {

	}
	
	public void onMove(EventMove event) {

	}
	
	public void onSend(EventSendPacket event) {

	}
	
	public void onReceive(EventReceivePacket event) {

	}
	
	public static enum Category {
		RENDER,
		COMBAT,
		MOVEMENT,
		PLAYER,
		ZERODAYS,
		GHOST,
		MEME,
		DEVELOP;
	}
	
}
