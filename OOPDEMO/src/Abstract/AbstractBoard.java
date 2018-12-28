package Abstract;

public abstract class AbstractBoard {
	boolean[][] locations;
	
	abstract protected void setLocation(int x,int y);
	abstract protected int[][] getLocation(int x,int y);
	
	public AbstractBoard(boolean[][] locations) {
		super();
		this.locations = locations;
	}
}
