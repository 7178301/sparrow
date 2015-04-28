package api;

/*
 * Drone Interface
 * Created by Lara
 * 
 * Interface for Drone adaptor
 * 
 */

public interface Drone {
	public static boolean ready = false;
	public static Position Position = null;
	public static Position Home = null;
	public void init();// Connect the adaptor and get ready (?)
	public boolean flyInALine();
}
