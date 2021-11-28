class Bakery {
    int order;
    String menu;
    void customer(int o, String m) {
        order = o;
        menu = m;
    }
    void display() {
        System.out.println("Customer Order no:" + order);
        System.out.println("Menu:" + menu);
    }
}

class Make{
    public static void main(String[] args) {
        Bakery b1 = new Bakery();
        b1.customer(45, "Samuel");
        b1.display();
        Bakery b2 = new Bakery();
        b2.customer(78, "Carla");
        b2.display();
    }
}
