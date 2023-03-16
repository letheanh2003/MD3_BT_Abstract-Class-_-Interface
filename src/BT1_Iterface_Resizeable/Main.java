package BT1_Iterface_Resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Shape();
        shape[1] = new Rectangle();
        shape[2] = new Square(5);

        for (Shape sh : shape) {
            if (sh instanceof Circle) {
                System.out.println(sh);
                ((Circle)sh).resize(Math.random());
                System.out.println(sh);
            }else if (sh instanceof Rectangle) {
                System.out.println(sh);
                ((Rectangle) sh).resize(Math.random());
                System.out.println(sh);
            }
        }
   }
}
