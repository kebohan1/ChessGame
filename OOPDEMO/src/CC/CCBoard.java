package CC;

import Abstract.AbstractBoard;

public class CCBoard extends AbstractBoard {

	public CCBoard(boolean[][] locations) {
		super(locations);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setLocation(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean getLocation(int x, int y) {
		return locations[x][y];
	}

}
