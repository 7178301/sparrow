package sdkInterface;

public abstract class DroneAPI 
{
	static private int apiVersion = 1;
	private AbsolutePosition home;
	private AbsolutePosition currentPosition;
	
	public int getAPIVersion() 
	{
		return apiVersion;
	}
	
	public abstract void flyTo(Position pos, Bearing bear, Double speed);
	public abstract void takeOff(Position pos);
	public abstract void land(Position pos);
	public void wait(double seconds) 
	{
		long milliseconds = (long) (seconds*1000);
		try {
		    Thread.sleep(milliseconds);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
	public void setHome(AbsolutePosition pos) 
	{
		home = pos;
	};
	
	public Position getPosition()
	{
		return currentPosition;
	}
	
	public RelativePosition getDistanceToHome()
	{
		return home.minus(currentPosition);
	}
	
	public void flyHome(Bearing bear, Double speed)
	{
		flyTo(home, bear, speed);
	}
	
	
	
	
	
	
}
