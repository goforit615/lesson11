package string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("Java");
        System.out.println("javaStr 문자열 주소: " + System.identityHashCode(javaStr));

        StringBuilder buffer = new StringBuilder("Hello World");
        System.out.println(("연산 전 buffer 메모리 주소:" + System.identityHashCode(buffer)));

        buffer.append(" and");
        buffer.append(" Android");
        buffer.append(" programing is fun!!!");
        System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer));

        javaStr = buffer.toString();
        System.out.println(javaStr);
        System.out.println("연결된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
    }
}
