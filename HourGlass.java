import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HourGlass {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mat[][] = {{1, 1, 1, 0, 0, 0},
        		       {0, 1, 0, 0, 0, 0},
        		       {1, 1, 1, 0, 0, 0},
        		       {0, 9, 2, -4, -4, 0},
        		       {0, 0, 0, -2, 0, 0},
        		       {0, 0, -1, -2, -4, 0}};
        
           //new int[6][6];
//        for(int i=0; i < 6; i++){
//            for(int j=0; j < 6; j++){
//                mat[i][j] = in.nextInt();
//            }
//        }
        int max_sum = 0;
        for (int i=0; i<mat.length-2; i++)
       {
          for (int j=0; j<mat[i].length-2; j++)
          {
            // Considering mat[i][j] as top left cell of
            // hour glass.
            int sum = (mat[i][j]+mat[i][j+1]+mat[i][j+2])+
                      (mat[i+1][j+1])+
                  (mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2]);
 
            // If previous sum is less then current sum then
            // update new sum in max_sum
            if(sum > max_sum)
            {
                max_sum = sum;
            }
        }
      }
        System.out.println(max_sum);
    }

}
