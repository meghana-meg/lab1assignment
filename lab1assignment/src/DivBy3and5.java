import java.util.*;
public class DivBy3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        DivBy3and5 d=new DivBy3and5();
        System.out.println("enter n value");
        int n=sc.nextInt();
        int result=d.calculateSum(n);
        System.out.println(result);
	}
    int calculateSum(int n)
    {
    	int sum=0;
    	for(int i=1;i<=n;i++) 
    	{
    	if(i%3==0 || i%5==0)
    		sum=sum+i;
    	}
    	return sum;
    }
}

