package DC;

import Abstract.AbstractBoard;

public class DCBoard extends AbstractBoard {
	public DCBoard(boolean[][] locations) {
		super(locations);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setLocation(int x, int y) {
		// TODO Auto-generated method stub
		locations[x][y] = true;
	}

	@Override
	public boolean getLocation(int x, int y) {
		return locations[x][y];
	}

}
