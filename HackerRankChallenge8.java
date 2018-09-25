import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRankChallenge8 {
	
	public static void main(String[] args) {
        ArrayList <Integer> mylist = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int i = 0 ; i < n ; i++)
        {
            int input = s.nextInt();
            mylist.add(input);
        }
        
        int k = s.nextInt();
       // System.out.println(k);
        for(int j = 0 ; j < k ; j++)
        {
        	String query = s.next();
        	//s.nextLine();
        	System.out.println(query);
        	if(query.equals("Insert"))
        	{
        		int x = s.nextInt();
        		int y = s.nextInt();
        		mylist.add(x,y);
        	}
        }
        
//        int k = s.nextInt();
//        for(int j = 0 ; j < k ; j++)
//        {
//            String query = s.nextLine();
//          //  s.nextLine();
//            if(query.equals("Insert"))
//            {
//                int x = s.nextInt();
//                int y = s.nextInt();
//                mylist.add(x,y);
//            }
//            else
//            {
//                int x = s.nextInt();
//                mylist.remove(x);
//            }
//        }
        
        for(int z = 0 ; z < mylist.size() ; z++)
        {
            System.out.println(mylist.get(z));
        }
    }

}
