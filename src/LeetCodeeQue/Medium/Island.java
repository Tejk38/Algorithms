package LeetCodeeQue.Medium;
/*
Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water),
return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
https://leetcode.com/problems/number-of-islands/


 */
public class Island {

    static int islandcount(char[][] ar){
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {

                if(ar[i][j] == '1'){
                    count+=1;
                    Checksurr(ar,i,j);
                }


            }

        }
        return count;
    }

    static void Checksurr(char[][] ar, int i ,int j){
        if(i<0||i>=ar.length|| j<0 || j>=ar[i].length || ar[i][j]=='0'){
            return;
        }

        ar[i][j] = '0';
        Checksurr(ar,i-1,j);//up
        Checksurr(ar,i+1,j);//down
        Checksurr(ar,i,j-1);//left
        Checksurr(ar,i,j+1);//right
    }


    public static void main(String[] args) {
        char[][] a = {{'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}};

        System.out.println(islandcount(a));
    }
}
