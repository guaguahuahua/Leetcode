package com.xjtuse.easy;

public class IslandPerimeter {

	public static int islandPerimeter(int [][] grid){
		int perimeter=0;
		int perimeter1=0;
		for(int i=0;i!=grid.length;i++){
			for(int j=0;j!=grid[i].length;j++){
				if(grid[i][j]!=0){
					perimeter1=4;
					if(i-1>=0)
						perimeter1=(grid[i-1][j]==0)?perimeter1:perimeter1-1;;
					if(j+1<grid[i].length)
						perimeter1=(grid[i][j+1]==0)?perimeter1:perimeter1-1;
					if(i+1<grid.length)
						perimeter1=(grid[i+1][j]==0)?perimeter1:perimeter1-1;
					if(j-1>=0)
						perimeter1=(grid[i][j-1]==0)?perimeter1:perimeter1-1;
					perimeter+=perimeter1;
				}			
			}
		}
		System.out.println(perimeter);
		return perimeter;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]grid={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		int r=islandPerimeter(grid);
		System.out.println(r);
	}

}
