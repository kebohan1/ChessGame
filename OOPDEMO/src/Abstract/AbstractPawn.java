package Abstract;

public abstract class AbstractPawn {

	private Type type ;
	private Color color;
	private int xLoc;
	private int yLoc;
	public AbstractPawn(Type type,Color color,int x,int y) {
		this.type = type;
		this.color = color;
		this.xLoc = x;
		this.yLoc = y;
	}
	public int getxLoc() {
		return xLoc;
	}
	public void setLoc(int xLoc,int yLoc) {
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}
	public int getyLoc() {
		return yLoc;
	}
	public Type getType() {
		return type;
	}
	public Color getColor() {
		return color;
	}
	
}
