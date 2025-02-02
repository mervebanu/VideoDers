package d02wrapper;

public class IncrementDecrement {
    public static void main(String[] args) {
     // Bir variable in degerini toplama veya carpma yaparak arttirmaya denir

        int i1 = 12;

        // 1. yol
        i1 = i1 + 5;
        System.out.println(i1);

        // i1 in degerini 8 arttirin
        i1 = i1 + 8;
        System.out.println(i1); //25

        // 2. yol
        i1 += 10;
        System.out.println(i1);
        // i1 i 2. yolu kullanarak 5 arttirin
        i1 += 5;
        System.out.println(i1);

        // 3. yol Sadece 1 arttirmak istedigimizde kullanilir
        i1++;
        System.out.println(i1);

        //......Post Increment (i++). Pre Increment (++i)
        int i = 10;
        int k = i++;
        System.out.println(i); //11
        System.out.println(k);  //10

        //........
        int m = 15;
        int n = ++m;

        System.out.println(n); //16
        System.out.println(m);  //16

        int p = 17;
        int r = p--;

        System.out.println(r); //17
        System.out.println(p); //16

        int s = 20; //19
        int t = --s; //19



    }
}
