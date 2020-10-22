import java.util.*;
public class TrafficLight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter traffic signal");
        String n=sc.nextLine();
        switch(n)
        {
        case "red" :
        	System.out.println("stop");
        	break;
        case "yellow" :
        	System.out.println("ready");
        	break;
        case "green" :
        	System.out.println("go");
        	break;
        default :
        	System.out.println("invalid");
        	break;
        }


	}

}
