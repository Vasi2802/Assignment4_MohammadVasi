import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
		
		Validation v=new Customer();
		Customer c=new Customer();
		
		System.out.println("Enter Details of Customer ");
		System.out.print("Enter Name : ");
		c.Name=scn.nextLine();
		System.out.print("Enter UserName : ");
		c.Username=scn.next();
		System.out.print("Enter Password : ");
		c.Password=scn.next();
		System.out.print("Enter Address : ");
		c.Address=scn.next();
		System.out.print("Enter Age : ");
		c.Age=scn.nextInt();
		System.out.println("Enter SSN number :");
		c.SSN=scn.next();
		System.out.println("Enter PhoneNumber : ");
        c.phone=scn.next();
		System.out.print("Enter EmailID : ");
		c.Email=scn.next();
		
		c.display();
		System.out.println();
        c.validateAge(c.Age);
        c.validateSSN(c.SSN);}
}
