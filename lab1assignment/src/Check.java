import java.util.*;
public class Check {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        Check p=new Check();
        System.out.println("enter n value");
        int n=sc.nextInt();
        boolean result=p.checkNumber(n);
        System.out.println(result);

	}
     boolean checkNumber(int n)
     {   
    	 int flag=0;
    	 int num=n%10;
    	 n=n/10;
    	 while(n>0)
    	 {
    		 if(num<=n%10)
    		 {
    			flag=1;
    			break;
    		 }
    		 num=n%10;
    		 n=n/10;
    	 }
    	 if(flag==1)
    		 return false;
    	 else return true;
     }
}


		

	


