import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
        Fibonacci Serisi Nedir ?
        Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
        Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
        yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
        Fibonacci dizisi, 0'dan başlar ve sonsuza kadar.
        Her rakam, bir önceki rakamla toplanır.
        Elde edilen sonuç rakamın sağ tarafına yazılır.
        Fibonacci dizisinin ilk on sayısı şu şekildedir:
        9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
         */

        //Degiskenler tanimlandi.
        int elemanSayisi, toplam = 0, ilkSayi = 0, ikinciSayi = 1;


        //Kac adet sayi olacagi kullaniciya soruldu ve veri alinarak islemler yapildi.
        Scanner scan = new Scanner(System.in);

        System.out.print("Serinin Eleman Sayisini Giriniz : ");
        elemanSayisi = scan.nextInt();

        for (int i = 1; i <= elemanSayisi; i++)
        {
            toplam = ilkSayi + ikinciSayi;
            System.out.println(ilkSayi + " + " + ikinciSayi + " = " + toplam);
            ilkSayi = ikinciSayi;
            ikinciSayi = toplam;

        }




    }
}
