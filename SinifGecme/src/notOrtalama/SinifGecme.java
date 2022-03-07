package notOrtalama;
import java.util.Scanner;
public class SinifGecme {
    public static void main(String[]args){
        int fizik,kimya,turkce,mat,muzik;
        Scanner input=new Scanner(System.in);

        System.out.println("Fizik notunuz:");
        fizik= input.nextInt();
        System.out.println("Kimya notunuz:");
        kimya= input.nextInt();
        System.out.println("Turkce notunuz:");
        turkce= input.nextInt();
        System.out.println("Matematik notunuz:");
        mat= input.nextInt();
        System.out.println("Muzik notunuz:");
        muzik= input.nextInt();

     int[]notlar=new int[5];
     notlar[0]=fizik;
     notlar[1]=kimya;
     notlar[2]=turkce;
     notlar[3]=mat;
     notlar[4]=muzik;
        int sayi=0;
        int toplam=0;
     for (int i=0;i<notlar.length;i++){
         if(notlar[i]<0||notlar[i]>100){

         }
         else{
             toplam+=notlar[i];
             sayi++;
         }
     }
     double ortalama=toplam/sayi;
        System.out.println("Ortalamanız"+ortalama);
     if(ortalama<55){
         System.out.println("sınıfta kaldınız");
     }
     else{
         System.out.println("Tebrikler sınıfı geçtiniz..");
     }





    }
}
