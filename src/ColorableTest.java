public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle(4,5);
        shapes[2] = new Square(7);
        for (int i=0;i<shapes.length;i++) {
            if (shapes[i] instanceof Colorable){
                ((Colorable) shapes[i]).howToColor();
            }else if (shapes[i] instanceof getShapeArea){
                System.out.println(shapes[i].getArea());
            }
        }
    }
}
