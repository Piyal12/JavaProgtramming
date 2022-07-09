public class Test {
    final static int x=11;
    static {
        System.out.println("hello");
    }
}
class Sample{
    public static void main(String[] args) {
        System.out.println(Test.x);
    }
}
