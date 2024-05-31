package BackTracking;

import java.util.Arrays;

public class LandMines {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 1, 1, 1, 1, 1},
        };
        int [][] path = new int[maze.length][maze[0].length];
        shortestpath("",maze,0,0,0,path, 1);
//        System.out.println(count);

    }
    static void shortestpath(String p, int[][] maze, int r, int c,int count,int[][] path, int step){
        if (r== maze.length-1 && c==maze[0].length-1){
            path[r][c] = step;
            for (int[] ar:path
                 ) {
                System.out.println(Arrays.toString(ar));

            }
            count+=1;
            System.out.println(p);
            System.out.println(count);
            //return count;
            return;
        }
//        for (int i = 0; i < maze.length; i++) {
//            for (int j = 0; j < maze[0].length; j++) {
                if (maze[r][c]==0) {
                    return;
                }

                maze[r][c] = 0;
                path[r][c] = step;
                if (r > 0) {
            shortestpath(p + "U", maze, r - 1, c, count + 1,path,step+1);
        }

                if (r < maze.length-1) {
                        shortestpath(p + "D", maze, r + 1, c, count + 1,path,step+1);
                    }

                if (c < maze[0].length-1) {
            shortestpath(p + "R", maze, r, c + 1, count + 1,path,step+1);
                }
                 if (c > 0) {
            shortestpath(p + "L", maze, r, c - 1, count + 1,path,step+1);
            }




                    maze[r][c] = 1;
                    path[r][c] =0;
                return;
                }











}
