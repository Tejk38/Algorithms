package BackTracking;

import java.util.ArrayList;

public class Maze {

    public static void main(String[] args) {
      //  mazepath("",3,3);
      //  System.out.println(countpaths(3,3));
     //   Diagonalmaze("",3,3);
     //   System.out.println(Diagonalmazeret("",3,3));
        boolean[][] maze = {{true,true,true},{true, false, true}, {true, true, true}};
        PathRestrictions("", maze, 0,0);


    }
    static String mazepath(String p, int r, int c){
        if(r == 1 && c==1){
            System.out.println(p);
            return "";
        }
        if(r>1){
            mazepath(p+'D', r-1,c);


        }
        if (c>1){
            mazepath(p+'R', r, c-1);
        }
        return p;
    }

    static int countpaths( int r, int c){
        int count = 0;
        if (r==1||c==1){
            return 1;
        }
        int left = countpaths(r-1,c);
        int right = countpaths(r,c-1);

        count = left + right;
        return count;
    }

    static String Diagonalmaze(String p, int r, int c){
        if (r==1&&c==1){
            System.out.println(p);
            return "";

        }
        if (r>1 && c > 1){
            Diagonalmaze(p+"D", r-1,c-1);
        }
        if (r>1){
            Diagonalmaze(p+"V", r-1, c);

        }
        if (c>1){
            Diagonalmaze(p+"H", r, c-1);
        }
        return p;
    }

    static ArrayList<String> Diagonalmazeret(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c > 1) {
            list.addAll(Diagonalmazeret(p + "D", r - 1, c - 1));
        }

        if (r > 1) {
            list.addAll(Diagonalmazeret(p+"V",r-1,c));

        }
        if (c > 1) {
            list.addAll(Diagonalmazeret(p+"H",r,c-1));

        }
        return list;
    }

    static void PathRestrictions(String p,boolean[][] maze,  int r,  int c){
        if (r== maze.length-1&&c== maze[0].length-1){
            System.out.println(p);
        }
        if (!maze[r][c]){
            return;
        }
        if (r< maze.length-1){
            PathRestrictions(p+"D",maze, r+1,c);

        }
        if(c<maze[0].length-1){
            PathRestrictions(p+"R", maze, r, c+1);
        }
    }


}
