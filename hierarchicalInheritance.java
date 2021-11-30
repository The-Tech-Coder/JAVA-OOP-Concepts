class Parameters{
    void Dimensions(double r, double h){
        System.out.println("Radius: " + r);
        System.out.println("Height: " + h);
    }
}

class Sphere extends Parameters{
    void SphereVolume(double r){
        double volume = (4 * 3.14 * r * r * r) / 3;
        System.out.println("Volume of the Sphere: " + volume);
    }
}

class Cylinder extends Parameters{
    void CylinderVolume(double r, double h){
        double volume = 3.14 * r * r * h;
        System.out.println("Volume of the Cylinder: " + volume);
    }
}

public class mainClass {
    public static void main(String[] args) {
        double radius = 5, height = 6;
        Sphere s = new Sphere();
        Cylinder c = new Cylinder();
        System.out.println("Example of Hierarchical Inheritance.");
        s.Dimensions(radius, height);
        s.SphereVolume(radius);
        c.CylinderVolume(radius, height);
    }
}
