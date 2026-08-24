package collection;
import java.util.*;
public class Browser {

	public static void main(String[] args) {
		BrowserApplication s=new BrowserApplication();
		Scanner sc=new Scanner (System.in);
		  int choice=0;
		do {

	            System.out.println("\n===== APPLICATION =====");
	            System.out.println("1. visit");
	            System.out.println("2. back");
	            System.out.println("3. getBack");
	            System.out.println("4. show all history");
	            System.out.println("5. exit");
	            System.out.print("Enter your choice: ");
	             choice=sc.nextInt();
	             sc.nextLine();
	            switch(choice) {
	            case 1:
	            { 
	            	System.out.println("enter your url");
	            	String adr=sc.nextLine();
	            	s.visit(adr);
	            	break;
	            	
	            }
	            case 2:
	            {
	            	s.back();
	            	break;
	            }
	            case 3:
	            {
	            	System.out.println(s.getBack()); 
	            	break;
	            	
	            }
	            case 4:
	            {
	            	s.showAllHistory();
	            	break;
	            }
	            default:
	            {
	            	System.out.println("nope");
	            	break;
	            }
	            	
	            
	            }
		} while(choice!=5);	

	}

}
