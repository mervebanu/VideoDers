package day13variabletypes;

public class VariableTypes {

    /*                      INSATANCE VARIABLE
    1) Main metodun ve urettigimiz diger metodlarin disinda (ustunde veya altinda ) olusturulan variab'lara "instance variable" denir.
    2) Instance variable lar object olusturulurkeen olusturulur. Ve her objeye bu variab lar
    monte edilir.
    3) Instance variab lara deger atamasi yapsaniz da olur yapmasaniz da olur.
      Asagida gorukdugu gibi i variable na deger atamasi yaptik. k variablina yapmadik.
      Not ; Bir variable deger atamasi yapma "initialize" olarak adlandirilir
           "i" variable i in initialize edildi digerleri edilmedi.
    4) Initialize edilmeyen "instance variable" lar icin Java kendisi deger atamasi yapar
       Javanin instance variable lara  kendisinin verdigi degerlere "default value" denir.
       byte, short, int, long, icin default value 0 dir.
       float, double icin default value 0.0 dir
       char icin default value 0 dir.
       boolean icin default value false'dur.
       String icin default value null'dir.
     */

    int i= 12;
    int k;
    String s;
    boolean b;
    double d;
    char c;

    /*                      LOCAL VARIABLE
      1) Main methodun veya olusturdugumuz baska bir metodun icinde olusturulan variable'lara
      "local variable" denir.
      2) Local variable'lara deger atamasi yapmak zorundayiz. Aksi takdirde
      o variable'i kullanamayiz
         Java local variable'lar icin "default value" atamasi yapmaz.

     */

    public static void main(String[] args) {

        int a;



    }
}
