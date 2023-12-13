import java.util.Scanner;

abstract class Shape
{
    abstract void draw();
}

class Square extends Shape
{
    void draw()
    {
        System.out.println("Drawing square");
    }
}

class Circle extends Shape
{
    void draw()
    {
        System.out.println("Drawing circle");
    }
}

class Triangle extends Shape
{
    void draw()
    {
        System.out.println("Drawing triangle");
    }
}

class Driver
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select shape to draw:");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.print("Enter choice: ");
        int choice = scan.nextInt();

        //shape reference
        Shape shp;

        switch (choice) {
            case 1:
                shp = new Square();
                break;
            case 2:
                shp = new Circle();
                break;
            case 3:
                shp = new Triangle();
                break;
            default:
                shp = new Square();
                break;
        }

        shp.draw();
        scan.close();
    }
}