public interface Polygon {
    public double area();
    public double perimeter();

}
class Triangle implements Polygon {
    double a = 3;
    double b = 4;
    double c = 5;

    @Override
    public double area(){
        double s = (a + b + c)/2;
        return(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }

    @Override
    public double perimeter(){
        return(a + b + c);
    }

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        toString();
    }
    public String toString() {
        return "Triangle edge lengths: " + a + ", " + b + ", " + c;
    }

    Triangle(){
        toString();
    }
}

class Rectangle implements Polygon{
    double width = 1;
    double height = 1;
    @Override
    public double area(){
        return(width*height);
    }
    @Override
    public double perimeter(){
        return((2*width)+(2*height));
    }
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        toString();
    }

    public String toString() {
        return "Rectangle width & height: " + width + ", " + height;
    }

    Rectangle(){
        toString();
    }
}