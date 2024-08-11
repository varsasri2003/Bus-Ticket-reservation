package Bus_ticket_reservation_project;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
          
	      int busno;
	      Date date;
	      Passenger_details details=new Passenger_details();
	      
	      Booking(){
	          Scanner scanner=new Scanner(System.in);
	          System.out.println("enter the Bus number");
	    	  busno=scanner.nextInt();
	    	  System.out.println("enter the Date dd-mm-yyyy");
	    	  String dateinput=scanner.next();
	    	  SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
	    	  
	    	try {
				date=  dateFormat.parse(dateinput);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
	    
	    	public boolean  isAvailable(ArrayList<Booking>Bookings,ArrayList<Bus>Buses){
	    		  int Capacity=0;
	    		  for(Bus bus:Buses) {
	    			  if(bus.getbusno()==busno) 
	    				  Capacity=bus.getcapacity();
	    			  }
	    			  
	    		  int booked=0;
	    		  for(Booking b:Bookings) {
	    			  if(b.busno==busno&&b.date.equals(date)) {
	    				  booked++;
	    			  }
	    		  }
             	  return booked<Capacity?true:false;
             	  
	    		  }
	    		  
	    		  
	      }
