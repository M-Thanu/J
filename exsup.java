public class exsup{
    public static void main(String[] args){
        B b = new B();
        b.show();
    }
}

class A{
    String colour = "white";
}

class B extends A {
    String colour = "black";

    void show(){
        System.out.println(super.colour);
        System.out.println(colour);
    }
}