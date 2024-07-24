
public class AirCondition {

    double price;
    String brand;
    String color;

    AirCondition(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        AirCondition airCondition=new AirCondition();
        double price=airCondition.price;
        System.out.println(price);
        System.out.println(airCondition.brand);
        System.out.println(airCondition.color);
        
    }
}