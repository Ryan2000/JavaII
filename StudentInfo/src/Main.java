//import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		if(args.length != 5){
		    System.out.println("[Id] [First Name] [Last Name] [Phone Number] [Email]");
		    System.out.println("Exiting...");
		    System.exit(-1);
		}
		
		int id = -1;
		try {
		    id = Integer.parseInt(args[0]);
		} catch (NumberFormatException nfe){
		    System.out.println("First argument has to be an integer. Exiting...");
		    System.exit(-1);
		}
		String fName = args[1];
		String lName = args[2];
		String pNumber = args[3];
		String email = args[4];
		

		
/*		try(Scanner scanner = new Scanner(System.in)){  //scanner with try block, to automatically close
            System.out.println("Please enter the student id");
            String idStr = scanner.nextLine();
            
            int id = -1;
            try {
                id = Integer.parseInt(idStr);
            } catch (NumberFormatException nfe){
                System.out.println("This wasn't a number! Exiting...");
                System.exit(0);
            }
            
            System.out.println("Enter the first name");
            String fName = scanner.nextLine();
            
            System.out.println("Enter the last name");
            String lName = scanner.nextLine();
            
            System.out.println("Enter the phone number");
            String pNumber = scanner.nextLine();
            
            System.out.println("Enter the email address");
            String eAddress = scanner.nextLine();*/
            
            //Create Student info object
            StudentInfo studentInfo = new StudentInfo(id, lName, fName, pNumber, email);
            
            //default
            StudentInfo studentInfoTwo = new StudentInfo();
            studentInfoTwo.setFirstName("Sterling");
            studentInfoTwo.setLastName("Archer");
            studentInfoTwo.setEmailAddress("ryanhoyda@gmail.com");
            
            System.out.println("");
            System.out.println("studentInfo.getFirstName(): " + studentInfo.getFirstName());
            System.out.println("studentInfo.getEmailAddress(): " + studentInfo.getEmailAddress());
            
            System.out.println("studentInfo: " + studentInfo.toString());
            System.out.println("studentInfoTwo: " + studentInfoTwo.toString());
            
            
		}
		

	}


