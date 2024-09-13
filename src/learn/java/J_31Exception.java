package learn.java;

class RadiusIsNegative2 extends Exception{

    @Override //overriding the existing getMessage method in Throwable
    public String getMessage() {
        return "Your input value is < 0 pls enter a +ive number";
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}


class Circle1{
    private float radius;
    void setRadius(float r){
        radius= r;
    }
    void get_area(float r) throws RadiusIsNegative2{
        if (r<0){
            throw new RadiusIsNegative2();
        }
        setRadius(r);
        float area= (float) (Math.PI*radius*radius);
        System.out.println(area);
    }
}

public class J_31Exception {

    public static void main(String[] args) {
        Circle1 c1= new Circle1();
        try {
            c1.get_area(-3);
        }catch (RadiusIsNegative2 e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
