package d05typecastıng;

public class TypeCastıng02 {
    public static void main(String[] args) {
        // Autowidining
        byte b1 = 12;
        short s1 = b1;
        int i1 = b1;
        float f1 = b1;

        // Explicit Norrowing
        short s2 = 121;
        byte b2 = (byte)s2;
        // buyuk data tiplerini kucuk data tupe na cevirme islemini java kendisi yapmaz
        // biz kod yazarak yapariz
    }
}
