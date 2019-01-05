package CC;
import java.util.ArrayList;

import Abstract.AbstractPawn;
import Abstract.Color;
import Abstract.Rule;
import Abstract.Type;

public class CCRule implements Rule{


	public boolean overRule(ArrayList<AbstractPawn> pawns) {
		return false;
	}
	
	public ArrayList<AbstractPawn> moveRule(ArrayList<AbstractPawn> pawns,AbstractPawn pawn, int x, int y) {
		int movex,movey;
		boolean exception=false;
		movex=x-pawn.getxLoc();
		movey=y-pawn.getyLoc();
		switch(pawn.getType()) {
		case Soldiers:
			if(pawn.getColor()==Color.Red) {
				if(movey==1&&movex==0||Math.abs(movex)==1&&movey==0&&y<5) {
					if(havepawn(pawns,x,y)!=-1&&pawncolor(pawns,x,y)==Color.Black)
					{
						pawns.remove(havepawn(pawns,x,y));
						pawns.get(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc())).setLoc(x, y);
					}
					else if(havepawn(pawns,x,y)!=-1&&pawncolor(pawns,x,y)==Color.Red) {
						exception=true;
					}
					else
					{
						pawns.get(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc())).setLoc(x, y);
					}
				}
				else {
					exception=true;
				}
			}
			else
			{
				if(movey==-1&&movex==0||Math.abs(movex)==1&&movey==0&&y>=5) {
					if(havepawn(pawns,x,y)!=-1&&pawncolor(pawns,x,y)==Color.Red)
					{
						pawns.remove(havepawn(pawns,x,y));
						pawns.get(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc())).setLoc(x, y);
					}
					else if(havepawn(pawns,x,y)!=-1&&pawncolor(pawns,x,y)==Color.Black) {
						exception=true;
					}
					else
					{
						pawns.get(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc())).setLoc(x, y);
					}
				}
				else {
					exception=true;
				}
			}
			
			break;
		case Knights:
			if(movex==-2)
			{
				if(havepawn(pawns,pawn.getxLoc()-1,pawn.getyLoc())!=-1) {
					exception=true;
				}
			} else if(movex==2) {
				if(havepawn(pawns,pawn.getxLoc()+1,pawn.getyLoc())!=-1) {
					exception=true;
				}
			} else if(movey==-2) {
				if(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc()-1)!=-1) {
					exception=true;
				}
				
			} else if(movey==2) {
				if(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc()+1)!=-1) {
					exception=true;
				}
			} else {
				exception=true;
			}
			if(!exception) {
				if(Math.abs(movex)/Math.abs(movey)==2||Math.abs(movey)/Math.abs(movex)==2) {
					if(havepawn(pawns,x,y)!=-1&&pawncolor(pawns,x,y)!=pawn.getColor())
					{
						pawns.remove(havepawn(pawns,x,y));
						pawns.get(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc())).setLoc(x, y);
					}
					else if(havepawn(pawns,x,y)!=-1&&pawncolor(pawns,x,y)==pawn.getColor()) {
						exception=true;
					}
					else
					{
						pawns.get(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc())).setLoc(x, y);
					}
				}
				else
				{
					exception=true;
				}
			}
			break;
		case Rooks:
			if(Math.abs(movex)>0&&movey==0)
			{
				if(x>pawn.getxLoc()) {
					for(int i=pawn.getxLoc()+1;i<x;i++)
					{
						if(havepawn(pawns,i,y)!=-1)
						{
							exception=true;
						}
					}
				}
				else {
					for(int i=pawn.getxLoc()-1;i<x;i--)
					{
						if(havepawn(pawns,i,y)!=-1)
						{
							exception=true;
						}
					}
				}
			} else if(Math.abs(movey)>0&&movex==0) {
				if(y>pawn.getyLoc()) {
					for(int i=pawn.getyLoc()+1;i<y;i++)
					{
						if(havepawn(pawns,x,i)!=-1)
						{
							exception=true;
						}
					}
				}
				else {
					for(int i=pawn.getyLoc()-1;i<y;i--)
					{
						if(havepawn(pawns,x,i)!=-1)
						{
							exception=true;
						}
					}
				}
			}
			if(!exception) {
				if(Math.abs(movex)/Math.abs(movey)==2||Math.abs(movey)/Math.abs(movex)==2) {
					if(havepawn(pawns,x,y)!=-1&&pawncolor(pawns,x,y)!=pawn.getColor())
					{
						pawns.remove(havepawn(pawns,x,y));
						pawns.get(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc())).setLoc(x, y);
					}
					else if(havepawn(pawns,x,y)!=-1&&pawncolor(pawns,x,y)==pawn.getColor()) {
						exception=true;
					}
					else
					{
						pawns.get(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc())).setLoc(x, y);
					}
				}
				else
				{
					exception=true;
				}
			}
			break;
		case Cannons:
			int during_number=0;
			if(x==pawn.getxLoc()) {
				if(y>pawn.getyLoc()) {
					for(int i=pawn.getyLoc()+1;i<y;i++)
					{
						if(havepawn(pawns,x,i)!=-1)
						{
							during_number++;
						}
					}
				}
				else {
					for(int i=pawn.getyLoc()-1;i<y;i--)
					{
						if(havepawn(pawns,x,i)!=-1)
						{
							during_number++;
						}
					}
				}
				
			} else if(y==pawn.getyLoc()) {
				if(x>pawn.getxLoc()) {
					for(int i=pawn.getxLoc()+1;i<x;i++)
					{
						if(havepawn(pawns,i,y)!=-1)
						{
							during_number++;
						}
					}
				}
				else {
					for(int i=pawn.getxLoc()-1;i<x;i--)
					{
						if(havepawn(pawns,i,y)!=-1)
						{
							during_number++;
						}
					}
				}
			}
			if(during_number==1) {
				if(pawncolor(pawns,x,y)!=pawn.getColor())
				{
					pawns.remove(havepawn(pawns,x,y));
					pawns.get(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc())).setLoc(x, y);
				}
				else {
					exception=true;
				}
			}
			else if(during_number==0) {
				pawns.get(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc())).setLoc(x, y);
			} else {
				exception=true;
			}
			break;
		case Elephants:
			if(pawn.getColor()==Color.Black&&y<5||pawn.getColor()==Color.Red&&y>4) {
				if(movex==2&&movey==-2)
				{
					if(havepawn(pawns,pawn.getxLoc()+1,pawn.getyLoc()-1)!=-1) {
						exception=true;
					}
				} else if(movex==-2&&movey==-2) {
					if(havepawn(pawns,pawn.getxLoc()-1,pawn.getyLoc()-1)!=-1) {
						exception=true;
					}
				} else if(movey==2&&movex==-2) {
					if(havepawn(pawns,pawn.getxLoc()-1,pawn.getyLoc()+1)!=-1) {
						exception=true;
					}
					
				} else if(movey==2&&movex==2) {
					if(havepawn(pawns,pawn.getxLoc()+1,pawn.getyLoc()+1)!=-1) {
						exception=true;
					}
				} else {
					exception=true;
				}
				if(!exception) {
					if(havepawn(pawns,x,y)!=-1&&pawncolor(pawns,x,y)!=pawn.getColor())
					{
						pawns.remove(havepawn(pawns,x,y));
						pawns.get(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc())).setLoc(x, y);
					}
					else if(havepawn(pawns,x,y)!=-1&&pawncolor(pawns,x,y)==pawn.getColor()) {
						exception=true;
					}
					else
					{
						pawns.get(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc())).setLoc(x, y);
					}
				}
			}
			break;
		case Advisors:
			if((pawn.getColor()==Color.Black&&y>=0&&y<=2&&x>=3&&x<=5||pawn.getColor()==Color.Red&&y>=7&&y<=9&&x>=3&&x<=5)&&Math.abs(movex)==1&&Math.abs(movey)==1) {

					if(havepawn(pawns,x,y)!=-1&&pawncolor(pawns,x,y)!=pawn.getColor())
					{
						pawns.remove(havepawn(pawns,x,y));
						pawns.get(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc())).setLoc(x, y);
					}
					else if(havepawn(pawns,x,y)!=-1&&pawncolor(pawns,x,y)==pawn.getColor()) {
						exception=true;
					}
					else
					{
						pawns.get(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc())).setLoc(x, y);
					}
			}
			else
			{
				exception=true;
			}
			
			break;
		case King:
			if((pawn.getColor()==Color.Black&&y>=0&&y<=2&&x>=3&&x<=5||pawn.getColor()==Color.Red&&y>=7&&y<=9&&x>=3&&x<=5)&&(Math.abs(movex)==1&&movey==0||Math.abs(movey)==1&&movex==0)) {

				if(havepawn(pawns,x,y)!=-1&&pawncolor(pawns,x,y)!=pawn.getColor())
				{
					pawns.remove(havepawn(pawns,x,y));
					pawns.get(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc())).setLoc(x, y);
				}
				else if(havepawn(pawns,x,y)!=-1&&pawncolor(pawns,x,y)==pawn.getColor()) {
					exception=true;
				}
				else
				{
					pawns.get(havepawn(pawns,pawn.getxLoc(),pawn.getyLoc())).setLoc(x, y);
				}
			}
			else
			{
				exception=true;
			}
			break;
		default:
			exception=true;
			break;
		}
		if(exception)
		{
			return null;
		} else {
			return pawns;
		}
		
	}
	
	public int havepawn(ArrayList<AbstractPawn> pawns,int x,int y)
	{
		for(int i=0;i<pawns.size();i++) {
			if(pawns.get(i).getxLoc()==x&&pawns.get(i).getyLoc()==y)
			{
				return i;
			}
		}
		return -1;
	}
	
	public Color pawncolor(ArrayList<AbstractPawn> pawns,int x,int y)
	{
		for(int i=0;i<pawns.size();i++) {
			if(pawns.get(i).getxLoc()==x&&pawns.get(i).getyLoc()==y)
			{
				return pawns.get(i).getColor();
			}
		}
		return null;
	}
	


}
