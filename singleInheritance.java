class Parameters{
    void Dimensions(int l, int b){
        System.out.println("Length: " + l);
        System.out.println("Breadth: " + b);
    }
}

class Area extends Parameters{
    void Rectangle(int l, int b){
        int area = l * b;
        System.out.println("Area: " + area);
    }
}

public class mainClass {
    public static void main(String[] args) {
        int length = 5, breadth = 4;
        Area a = new Area();
        System.out.println("Example of Single Level Inheritance.");
        a.Dimensions(length, breadth);
        a.Rectangle(length, breadth);
    }
}
