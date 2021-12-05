//In the above figure, GrandFather is a super class. 
//The Father class inherits the properties of the GrandFather class. 
//Since Father and GrandFather represents single inheritance. 
//Further, the Father class is inherited by the Son1 and Son2 class. 
//Thus, the Father becomes the parent class for Son1 and Son2. 
//These classes represent the hierarchical inheritance. 
//Combinedly, it denotes the hybrid inheritance.

//Grandfather class - Country
class Country {  
    public void show() {  
        System.out.println("U.S.A");  
    }  
}  
//Father class - State  
class State extends Country {  
    public void show() {  
        System.out.println("California");  
    }  
}  
//Son1 class - City1  
class City1 extends State {  
    public void show() {  
        System.out.println("Los Angeles");  
    }  
}  
//Son2 class - City2 
public class City2 extends State {  
    public void show() {  
        System.out.println("San Francisco");  
    }  
    public static void main(String args[]) {  
        City2 obj = new City2();  
        obj.show();  
    }  
}

//please name the program as "City2.java" and then paste the program in it.

