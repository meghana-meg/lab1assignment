import java.util.Scanner;
import java.lang.Math;

public class Squares {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        Squares s=new Squares();
        System.out.println("enter n value");
        int n=sc.nextInt();
        int result=s.calculateDifference(n);
        System.out.println(result);
	}
    int calculateDifference(int n)
    {
    	int sum=0,v=0;
		int k=0;
    	for(int i=1;i<=n;i++) 
    	{
    	   k=k+(int)Math.pow(i, 2);
    	   v=v+i;
    	}
    	
    	 sum=k-(int)Math.pow(v, 2);
    	return sum;

		// TODO Auto-generated method stub

	}

}
