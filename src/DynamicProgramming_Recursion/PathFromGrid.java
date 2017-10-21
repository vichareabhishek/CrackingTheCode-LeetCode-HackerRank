package DynamicProgramming_Recursion;

import java.util.ArrayList;
import java.util.HashMap;

public class PathFromGrid {
	//without Dynamic Programming
	public static boolean getPath(int x , int y, ArrayList<Point> path){
		
		Point p = new Point(x,y);
		
		if(x==0 && y==0){
			return true;
		}
		
		boolean success=false;
		
		if(x>=1 && isFree(x-1,y)){
			success = getPath(x-1,y,path);
		}
		if(!success && isFree(x,y-1)){
			success = getPath(x,y-1,path);
		}
		if(success){
			path.add(p);
		}
		return success;
	}

	private static boolean isFree(int i, int y) {
		
		return true;
	}

	//with Dynamic Programming
	public boolean getPath2(int x, int y, ArrayList<Point> path, HashMap<Point,Boolean> map){
		
		Point p = new Point(x,y);
		
		if(x==0 && y==0){
			return true;
		}
		
		if(map.containsKey(p)){
			return map.get(p);
		}
		boolean success = false;
		if(x>=1 && isFree(x-1,y)){
			success = getPath2(x-1,y,path,map);
		}
		if(y>=1 && isFree(x,y-1)){
			success = getPath2(x,y-1,path,map);
		}
		if(success){
			path.add(p);
		}
		map.put(p, success);
		return success;
	}
}

class Point{
	int x;
	int y;
	
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}