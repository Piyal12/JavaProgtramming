public class Parent {
    public void m1(){
        System.out.println("m1 running");
    }
    public void m2(){
        System.out.println("m2 running");
    }
}
class Child extends Parent{
    public void m3(){
        System.out.println("hello1");
    }
    public void m4(){
        System.out.println("hello2");
    }

    public static void main(String[] args) {
        Parent p=new Child();
        p.m1();
        p.m2();
        Child c=new Child();
        c.m3();
        c.m4();
    }
}