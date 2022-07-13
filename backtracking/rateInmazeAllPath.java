/*
	Note:
	To get all the test cases accepted, make recursive calls in following order: Top, Down, Left, Right.
	This means that if the current cell is (x, y), then order of calls should be: top cell (x-1, y), 
	down cell (x+1, y), left cell (x, y-1) and right cell (x, y+1).
*/  

public class Solution {


	static void ratInAMaze(int maze[][], int n) {
        int path[][]=new int[n][n];
        ratInAMazeHelper(maze,0,0,path);
	}
     public static void ratInAMazeHelper(int maze[][],int i,int j,int path[][]){
        int n=path.length;
        if(i<0 || i>=n || j<0 ||j>=n || maze[i][j]==0 || path[i][j]==1){
            return;
        }
        path[i][j]=1;
        if(i==n-1 && j==n-1){
            for(int r=0;r<n;r++){
                for(int c=0;c<n;c++){
                    System.out.print(path[r][c]+" "); 
                }
            }
           System.out.println();
           path[i][j]=0;
           return;
        }
        ratInAMazeHelper(maze,i-1,j,path);
        ratInAMazeHelper(maze,i,j+1,path);
        ratInAMazeHelper(maze,i+1,j,path);
        ratInAMazeHelper(maze,i,j-1,path);
        path[i][j]=0;
    }

}
