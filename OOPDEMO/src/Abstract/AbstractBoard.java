package Abstract;

public abstract class AbstractBoard {
	protected boolean[][] locations;
	
	abstract protected void setLocation(int x,int y);
	public abstract boolean getLocation(int x,int y);
	
	public AbstractBoard(boolean[][] locations) {
		super();
		this.locations = locations;
	}
}
