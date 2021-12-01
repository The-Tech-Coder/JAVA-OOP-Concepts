class Pizza{  
    void make(){
        System.out.println("Preparing...");
    }  
}  
class Chicken extends Pizza{  
    void make(){
        System.out.println("Preparing Chicken Pizza...");
    }  
}  
class Mushroom extends Pizza{  
    void make(){
        System.out.println("Preparing Mushroom Pizza...");
    }  
}  
class Paneer extends Pizza{  
    void make(){
        System.out.println("Preparing Paneer Pizza...");
    }  
    }  
class TestPolymorphism2{  
    public static void main(String args[]){  
        Pizza p;  
        p = new Chicken();  
        p.make();  
        p = new Mushroom();  
        p.make();  
        p = new Paneer();  
        p.make();  
    }  
}  
