package integertest;

public class IntegerTest {

    public static void main(String[] args) {
        Integer a;
        Integer b;

        for (int i = 125; i < 130; i++) {
            a = i;
            b = i;
            System.out.println(a==b);
        }
    }

}
