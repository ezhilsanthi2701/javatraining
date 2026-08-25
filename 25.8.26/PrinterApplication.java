package printerTask;
import java.util.*;


public class PrinterApplication {
	public static void main(String[] args) {
		printerTask a=new printerTask();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1 place order"
					+ "2 show order"
					+ "3 next order"
					+ "4 to remove order"
					+"5exist"
					+ "enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			
				System.out.println("enter task id:");
				int n=sc.nextInt();
				System.out.println("enter task:");
				String tsk=sc.nextLine();
				sc.nextLine();
				Print p=new Print(n,tsk);
				a.addTask(p);
				break;
	
				
			
			case 2:
		
				a.showAll();
				break;
			
			case 3:
			
				a.nextPrint();
				break;
			 case 4:
	               
	                a.removePrint();
	                break;
	                
	                
	            case 5:
	                System.out.println("Exiting...");
	                break;

	            default:
	                System.out.println("Invalid choice!");
	 }
			
		}while(choice!=5);
		sc.close();
	}
}


	




