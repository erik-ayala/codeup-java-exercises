package Warmup;

class Red {
    public void show(){
        System.out.println("I am red.");
    }

}

class Orange extends Red {
    public void show(){
        System.out.println("I am orange.");
    }
}

public class Colors {
    public static void main(String[] args) {
        Red redobj = new Red();
        Orange ornobj = new Orange();
        redobj.show();  //// I am red
        ornobj.show();   ////// I am orange

    }
}
