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

class Volume extends Area{
    void Cube(int h, int l, int b){
        int volume = h * l * b;
        System.out.println("Volume: " + volume);
    }
}

public class mainClass {
    public static void main(String[] args) {
        int length = 5, breadth = 4, height = 6;
        Volume v = new Volume();
        System.out.println("Example of Multi-Level Inheritance.");
        v.Dimensions(length, breadth);
        System.out.println("Height: " + height);
        v.Rectangle(length, breadth);
        v.Cube(height, length, breadth);
    }
}
