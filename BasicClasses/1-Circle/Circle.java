package Com.java.oop;

public class Circle {
    private double radius;
    private String color;
    
    public void setRadius(double r){
        this.radius = r;
    }
    public double getRadius(){
        return radius;
    }
    
    public void setColor(String c){
        this.color = c;
    }
    public String getColor(){
        return color;
    }
    
    public double getArea(){
        double area = Math.PI *radius*radius;
        return area;
    }
    
    public double getCircumference(){
        return 2* Math.PI *radius;
    }
    
    public String toString(){
        return "Circle{"+"redius="+radius+",color="+color+"}";
    }
}