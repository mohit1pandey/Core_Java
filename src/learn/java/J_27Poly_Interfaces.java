package learn.java;
//create some interfaces.
class Phone{
 public void  get_charged(){
        System.out.println("Phone is getting charged");
    }
  public   void inr_vol(){
        System.out.println("vol is increased");
    }
}
//camera interface
interface Camera{
    void  click_pic();
}
//wifi interface
interface WiFi{
    String arr[]={"wifi1","wifi2","wifi3"};
    void  scan_network();
}
//calling
interface CellPhone{
    void make_call();
}
// make a smartphone class
class SmartPhone extends Phone implements Camera,WiFi,CellPhone {
    public void click_pic() {
        System.out.println("Captured");
    }

    public void scan_network() {
        for (String a : arr) {
            System.out.println(a);
        }
    }

    public void make_call() {
        System.out.println("Call in progress .......");
    }
}

public class J_27Poly_Interfaces {
    // make phone with only wifi facility.
    public static void main(String[] args) {
        WiFi Phone1= new SmartPhone();// only can access charging vol and signal
        Phone1.scan_network();

        SmartPhone Phone2= new SmartPhone();
        //Phone2 can access any method provided
    }
}


