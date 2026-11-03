//Geometry calculator
class ShapeCalculator{
    int calculateArea(int side){
        return side*side;
    }
    int calculateArea(int l, int w){
        return l*w;
    }
    double calculateArea(double r){
        return Math.PI*r*r;
    }
}


class BasicOverloading{
    public static void main(String[] args) {
        ShapeCalculator calc = new ShapeCalculator();

        //square
        System.out.println(calc.calculateArea(5));
        //rect
        System.out.println(calc.calculateArea(5,6));
        //circle
        System.out.println(calc.calculateArea(4.0));
    }
}