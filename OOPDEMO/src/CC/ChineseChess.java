package CC;

import java.util.ArrayList;

import Abstract.AbstractBoard;
import Abstract.AbstractChess;
import Abstract.AbstractPawn;
import Abstract.Color;
import Abstract.Rule;
import Abstract.Type;


public class ChineseChess extends AbstractChess {

	@Override
	public AbstractBoard createChessBoard(ArrayList<AbstractPawn> pawns,Rule rule) {
		// TODO Auto-generated method stub
		return new CCBoard(pawns,rule);

	}

	@Override
	public ArrayList<AbstractPawn> createPawn() {
		// TODO Auto-generated method stub
		ArrayList<AbstractPawn> ccpawn = new ArrayList<>();
		//Red
		CCPawn RedSoilder1 = new CCPawn(Type.Soldiers,Color.Red,6,0);
		ccpawn.add(RedSoilder1);
		CCPawn RedSoilder2 = new CCPawn(Type.Soldiers,Color.Red,6,2);
		ccpawn.add(RedSoilder2);
		CCPawn RedSoilder3 = new CCPawn(Type.Soldiers,Color.Red,6,4);
		ccpawn.add(RedSoilder3);
		CCPawn RedSoilder4 = new CCPawn(Type.Soldiers,Color.Red,6,6);
		ccpawn.add(RedSoilder4);
		CCPawn RedSoilder5 = new CCPawn(Type.Soldiers,Color.Red,6,8);
		ccpawn.add(RedSoilder5);
		CCPawn RedKnights1 = new CCPawn(Type.Knights,Color.Red,9,1);
		ccpawn.add(RedKnights1);
		CCPawn RedKnights2 = new CCPawn(Type.Knights,Color.Red,9,7);
		ccpawn.add(RedKnights2);
		CCPawn RedRooks1 = new CCPawn(Type.Rooks,Color.Red,9,0);
		ccpawn.add(RedRooks1);
		CCPawn RedRooks2 = new CCPawn(Type.Rooks,Color.Red,9,8);
		ccpawn.add(RedRooks2);
		CCPawn RedCannons1 = new CCPawn(Type.Cannons,Color.Red,7,1);
		ccpawn.add(RedCannons1);
		CCPawn RedCannons2 = new CCPawn(Type.Cannons,Color.Red,7,7);
		ccpawn.add(RedCannons2);
		CCPawn RedElephants1 = new CCPawn(Type.Elephants,Color.Red,9,2);
		ccpawn.add(RedElephants1);
		CCPawn RedElephants2 = new CCPawn(Type.Elephants,Color.Red,9,6);
		ccpawn.add(RedElephants2);
		CCPawn RedAdvisors1 = new CCPawn(Type.Advisors,Color.Red,9,3);
		ccpawn.add(RedAdvisors1);
		CCPawn RedAdvisors2 = new CCPawn(Type.Advisors,Color.Red,9,5);
		ccpawn.add(RedAdvisors2);
		CCPawn RedKing = new CCPawn(Type.King,Color.Red,9,4);
		ccpawn.add(RedKing);
		//Black
		CCPawn BlackSoilder1 = new CCPawn(Type.Soldiers,Color.Black,3,0);
		ccpawn.add(BlackSoilder1);
		CCPawn BlackSoilder2 = new CCPawn(Type.Soldiers,Color.Black,3,2);
		ccpawn.add(BlackSoilder2);
		CCPawn BlackSoilder3 = new CCPawn(Type.Soldiers,Color.Black,3,4);
		ccpawn.add(BlackSoilder3);
		CCPawn BlackSoilder4 = new CCPawn(Type.Soldiers,Color.Black,3,6);
		ccpawn.add(BlackSoilder4);
		CCPawn BlackSoilder5 = new CCPawn(Type.Soldiers,Color.Black,3,8);
		ccpawn.add(BlackSoilder5);
		CCPawn BlackKnights1 = new CCPawn(Type.Knights,Color.Black,0,1);
		ccpawn.add(BlackKnights1);
		CCPawn BlackKnights2 = new CCPawn(Type.Knights,Color.Red,0,7);
		ccpawn.add(BlackKnights2);
		CCPawn BlackRooks1 = new CCPawn(Type.Rooks,Color.Black,0,0);
		ccpawn.add(BlackRooks1);
		CCPawn BlackRooks2 = new CCPawn(Type.Rooks,Color.Black,0,8);
		ccpawn.add(BlackRooks2);
		CCPawn BlackCannons1 = new CCPawn(Type.Cannons,Color.Black,2,1);
		ccpawn.add(BlackCannons1);
		CCPawn BlackCannons2 = new CCPawn(Type.Cannons,Color.Black,2,7);
		ccpawn.add(BlackCannons2);
		CCPawn BlackElephants1 = new CCPawn(Type.Elephants,Color.Black,0,2);
		ccpawn.add(BlackElephants1);
		CCPawn BlackElephants2 = new CCPawn(Type.Elephants,Color.Black,0,6);
		ccpawn.add(BlackElephants2);
		CCPawn BlackAdvisors1 = new CCPawn(Type.Advisors,Color.Black,0,3);
		ccpawn.add(BlackAdvisors1);
		CCPawn BlackAdvisors2 = new CCPawn(Type.Advisors,Color.Black,0,5);
		ccpawn.add(BlackAdvisors2);
		CCPawn BlackKing = new CCPawn(Type.King,Color.Black,0,4);
		ccpawn.add(BlackKing);
		return ccpawn;
	}

	@Override
	public Rule createRule() {
		// TODO Auto-generated method stub
		Rule ccrule = new CCRule();
		return ccrule;
	}

}
