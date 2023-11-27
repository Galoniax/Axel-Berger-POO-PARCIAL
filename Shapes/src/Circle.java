public abstract class Circle extends Shape{
    private double radius;

    //Constructors
    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 20;
    }

    public double getPerimeter() {
        return 30;
    }

    public String toString(){
        String SHAPEdata = super.toString();
        String CIRCLE = "";
        CIRCLE+= "Radius: " + radius + "\n";


        return SHAPEdata + ", " + CIRCLE;
    }
}
