package BT2_Interface_Colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[4];
        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Square(5);
        for (Shape sh : shape) {
            System.out.println(sh);
            if (sh instanceof Square) {
                ((Square) sh).howToColor();
            }
        }
    }
}