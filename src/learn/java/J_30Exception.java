package learn.java;
//all the exceptions in java are inherited with Exception class and we can make our own.
// circle radius cannot be -ive

class RadiusIsNegative extends Exception{

//    public RadiusIsNegative(String message) {
//        super(message); // Call the constructor of the parent class (Exception)
//    }
    @Override //overriding the existing getMessage method in Throwable
    public String getMessage() {
        return "Your input value is < 0 pls enter a +ive number";
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}

class Circle {
    private  int radius;

    private void get_radius(int r){
        radius=r;
    }

    public void area(int r){

        try {
            //exception
            if(r<0) throw new RadiusIsNegative();
            get_radius(r);
            double area=Math.PI*r*r;
            System.out.println("The Area:" +area);

        }catch (RadiusIsNegative e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}

public class J_30Exception {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.area(-1);

    }
}
