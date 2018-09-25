import java.util.Scanner;

public class HackerRankChallenge2 {
	
	
	    public static void main(String[] args) {
	            Scanner sc=new Scanner(System.in);
	            System.out.println("================================");
	            for(int i=0;i<3;i++){
	            	int count = 0;
	                String s1=sc.next();
	                int x=sc.nextInt();
	                int t = x;
	                while(t > 0)
	                {
	                	t = t / 10;
	                	count ++;
	                }
	                if(count == 2)
	                {
	                	System.out.println(s1 + "\t" + "\t" + "0"+x);
	                }
	                if(count == 1)
	                {
	                	System.out.println(s1 + "\t" + "\t" +"00"+x);
	                }
	                if(count == 3)
	                {
	                	System.out.println(s1 + "\t" + "\t"+ x);
	                }
	                
	            }
	            System.out.println("================================");

	    }
	}



