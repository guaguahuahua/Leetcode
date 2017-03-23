package com.xjtuse.easy;

public class IslandPerimeter_1 {
	//����ϰ�ߣ�Ѱ�����е� island cell �����ھ�ֻ�����ұߺ��±ߵ�cell��ÿһ��cell�����������
	public static int islandPerimeter(int [][] grid){
		
		int island=0;
		int neighbor=0;
		for(int i=0;i!=grid.length;i++){
			for(int j=0;j!=grid[i].length;j++){
				if(grid[i][j]!=0){
					island++;
					if(j+1<grid[i].length && grid[i][j+1]==1){
						neighbor++;
					}
					if(i+1<grid.length && grid[i+1][j]==1){
						neighbor++;
					}
				}
			}
		}
		return 4*island-2*neighbor;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]grid={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		int r=islandPerimeter(grid);
		System.out.println(r);
	}

}
