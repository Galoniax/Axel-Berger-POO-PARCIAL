public abstract class Square extends Rectangle{
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth(); // Square's side is the same as width or length
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

}