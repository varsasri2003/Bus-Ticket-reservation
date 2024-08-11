package Bus_ticket_reservation_project;

public class Bus {
    private int busno;
   private  boolean AC;
   private  int capacity;
   private String Driver_name;                               // get and set method should be created because it is a private
   private String From_To;
   private double duration;
   
     Bus(int b,boolean AC,int Cap,String Driver_name,String From_To,double duration){
    	this. busno=b;
    	this. AC=AC;
    	this. capacity=Cap;
    	this.Driver_name=Driver_name;
    	this.From_To=From_To;
    	this.duration=duration;
    	 }
   public int  getcapacity() {  // accessor method
    	 return capacity;
     }
   public void setcapacity(int Cap) {   // mutator method
	   capacity=Cap;
	   
   }
   public boolean getAC() {
  	 return AC;
   }
 public void setAC(int AC) {
	   capacity=AC;
	   
 }
 public String getDriver_name() {
	 return Driver_name;
 }
 public void setDriver_name(String Driver) {
	 Driver_name=Driver;
 }
 public String getFrom_To() {
	 return From_To ;
 }
 public void setFrom_To(String FromTo) {
	 From_To=FromTo;
 }
 public double getduration() {
	 return duration;
 }
 public void setduration(double dur) {
	 duration=dur;
 }
 public int getbusno() {
	 return busno;
 }
 public void setbusno(int bus) {
	 busno=bus;
 }
 public void bus_info() {
	 System.out.println("bus_no:"+busno+"   AC/non AC:"+AC+"   capacity:"+capacity+"   Driver_name: "+ Driver_name+"   From-To: "+From_To+"   Duration of travel:"
	 		+ " "+duration+"hrs");
 }
}
