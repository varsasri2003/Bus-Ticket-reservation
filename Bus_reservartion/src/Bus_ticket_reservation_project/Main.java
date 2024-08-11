package Bus_ticket_reservation_project;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		ArrayList<Bus>Buses=new ArrayList <Bus>();
		Buses.add(new Bus(1,true,2,"xxx","Madurai-Chennai",8.00));
		Buses.add(new Bus(2,false,90,"yyy","Chennai-coimbatore",5.00));
		Buses.add(new Bus(3,true,2,"zzz","Madurai-Banglore",9.00));
		ArrayList<Booking>Bookings=new ArrayList <Booking>();
		
		
		
		int useropt=1;
		Scanner scanner=new Scanner(System.in);
		for(Bus b:Buses) {
			b.bus_info();
		}
		while(useropt==1) {
			System.out.println("press 1 for booking and 2 for exit");
			useropt=scanner.nextInt();
				if(useropt==1) {
					Booking booking=new Booking();
					if(booking.isAvailable(Bookings,Buses)) {
						Bookings.add(booking);
						
						}
						System.out.println("Your booking is conform");
					}else
						System.out.println("sorry the bus is full.Try another bus or data");
						
					}
					
					
				}
		}

	


