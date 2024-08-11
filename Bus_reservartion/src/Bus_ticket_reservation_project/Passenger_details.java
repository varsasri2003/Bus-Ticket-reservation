package Bus_ticket_reservation_project;
import java.util.*;
public class Passenger_details {
  String Passenger_name;
  int Age;
  int Gender;
  String Mail_id;
  Passenger_details(String name,int age,int gender,String mail_id){
	  this. Passenger_name=name;
	  this.Age=age;
	  this.Gender=gender;
	  this.Mail_id=mail_id;
  }
  
  Passenger_details(){
	 Scanner scanner=new Scanner (System.in);
	 System.out.println("enter your name:");
	  Passenger_name=scanner.next();
	  System.out.println("enter your Age: ");
	  Age=scanner.nextInt();
	  System.out.println("press 1 for Female or press 2 for Male");
	  Gender=scanner.nextInt();
	  if(Gender==1)
		  System.out.println("Female");
	  else
		  System.out.println("male");
	  System.out.println("enter your mail_id:");
	  Mail_id=scanner.next();
  }
  
  public String getPassenger_name() {
	  return Passenger_name;
  }
  public void setPassenger_name(String name) {
	  Passenger_name=name;
  }
  public int getAge() {
		 return Age;
	 }
	 public void setAge(int age) {
		 Age=age;
	 }
	 public int getGender() {
		 return Gender;
	 }
	 public void setMail_id(int gender) {
		 Gender=gender;
	 }
	 public String getMail_id() {
		  return Mail_id;
	  }
	  public void settMail_id(String mail_id) {
		  Mail_id=mail_id;
	  }
 public void Passenger_info() {
	 System.out.println(" Passenger_name: "+ Passenger_name+" Gender: "+Gender+"Age: "+Age+"Mail_id: "+Mail_id);
 }
  
}
