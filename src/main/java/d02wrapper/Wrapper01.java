package d02wrapper;

public class Wrapper01 {
    public static void main(String[] args){

        // byte, short ve int in max. ve min. degerlerini kod yazarak bulunuz
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(maxByte);
        byte minByte = Byte.MIN_VALUE;
        System.out.println(minByte);

        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);
        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

        int maxInteger = Integer.MAX_VALUE;
        System.out.println(maxInteger);
        int minInteger = Integer.MIN_VALUE;
        System.out.println(minInteger);

        String name = "Ali Can";
        name.toUpperCase();
        System.out.println(name.toUpperCase());


    }
}
