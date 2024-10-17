package HW.chapter01.chapter09;

public class Q01 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("\n Rectangle 1");
        System.out.println("-------------");
        System.out.println("Width:     " + rectangle1.width);
        System.out.println("Height:    " + rectangle1.height);
        System.out.println("Area:      " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        System.out.println("\n Rectangle 2");
        System.out.println("-------------");
        System.out.println("Width:     " + rectangle2.width);
        System.out.println("Height:    " + rectangle2.height);
        System.out.println("Area:      " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }

    public static class Rectangle {
        double width, height;

        public Rectangle() {
            width = 1;
            height = 1;
        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return 2 * (width + height);
        }
    }
}
