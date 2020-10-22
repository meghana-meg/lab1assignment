import java.util.*;
public class SumofCubes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        SumofCubes p=new SumofCubes();
        System.out.println("enter n value");
        int n=sc.nextInt();
        int result=p.SumOfCubes(n);
        System.out.println(result);
}
   int SumOfCubes(int n)
   {
	   int sum=0;
	   for(int i=1;i<=n;i++)
	   {
		  sum=sum+i*i*i;
		  
	   }
	   return sum;

	}

}
