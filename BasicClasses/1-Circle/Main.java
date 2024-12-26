package Com.java.oop;

public class Main {
    
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(3.0);
        c1.setColor("Black");
        System.out.println(c1.toString());
        
        Circle c2 = new Circle();
        c2.setRadius(2.0);
        c2.setColor("Blue");
        System.out.println(c2.getCircumference());
    }
}