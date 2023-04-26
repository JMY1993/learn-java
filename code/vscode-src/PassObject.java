public class PassObject {
    public void printAreas(Circle c, int times){
        System.out.println("Radius\tArea");
        for (int i = 1; i <= times; i++) {
            System.out.println((double)i+"\t"+c.findArea(i));
        }
    }

    public static void main(String[] args) {
        PassObject po = new PassObject();
        Circle circle = new Circle();
        po.printAreas(circle, 5);
    }
}

class Circle{
    public double findArea(double radius){
        return Math.PI*Math.pow(radius, 2);
    }
}
