import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println(area);
    }
}
// Area of Rectangle 

double l = sc.nextDouble();
double b = sc.nextDouble();
System.out.println(l * b);

// Area of triangle
double base = sc.nextDouble();
double height = sc.nextDouble();
System.out.println(0.5 * base * height);

//Area of Equilateral Triangle
double a = sc.nextDouble();
System.out.println((Math.sqrt(3) / 4) * a * a);

//Perimeter of Circle
double r = sc.nextDouble();
System.out.println(2 * Math.PI * r);
//Perimeter of Rectangle
double l = sc.nextDouble();
double b = sc.nextDouble();
System.out.println(2 * (l + b));

//Volume of Cylinder
double r = sc.nextDouble();
double h = sc.nextDouble();
System.out.println(Math.PI * r * r * h);

//Volume of Sphere
double r = sc.nextDouble();
System.out.println((4.0/3) * Math.PI * r * r * r);




























    }
}
