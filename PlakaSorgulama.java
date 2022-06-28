import java.util.Scanner;

public class Plaka {

    public static void main(String[] args) {

        // Ödev sahibi: Gizem Aydın * 200541028

        System.out.println("Lütfen bir plaka giriniz: ");
        System.out.println("Dikkat: Yalnızca Türkiye plakaları geçerlidir.");


        Scanner giris = new Scanner(System.in);
        String plaka = giris.nextLine();
        String geciciPlaka = "";
        char[] dizi = new char[plaka.length()];//girilen plaka uzunluğunda bir char dizisi oluşturduk.
        plaka.getChars(0, plaka.length(), dizi, 0);//girilen plakayı getChars komutunu kullanarak elemanlarını char karakteri haline getirdik ve dizimizin içerisine atadık.
        for (int i = 0; i < plaka.length(); i++) {
            if (dizi[i] != ' ') {
                geciciPlaka += dizi[i];
            }
        }
        String ilksayı=plaka.substring(0,2);;
        String harfkodu="";
        String sonsayılar = "";

        if (geciciPlaka.length() <= 6) {
            harfkodu = geciciPlaka.substring(2,3);
            sonsayılar = geciciPlaka.substring(3, geciciPlaka.length());

        }
        else if(geciciPlaka.length()==7){
            harfkodu = plaka.substring(3,5);
            sonsayılar = plaka.substring(6, plaka.length());

        }
        else if(geciciPlaka.length()==8){
            harfkodu = plaka.substring(3,6);
            sonsayılar = plaka.substring(7, plaka.length());

        }
        else if(geciciPlaka.length()==9){
            harfkodu = plaka.substring(3,7);
            sonsayılar = plaka.substring(8, plaka.length());

        }
        else {
            System.out.println("Hatalı plaka");
        }

        int Ilksayı = Integer.parseInt(ilksayı);
        int Sonsayı = Integer.parseInt(sonsayılar);


        switch (Ilksayı) {
            case 1:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Adana şehrine aittir");
                break;
            case 2:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Adıyaman şehrine aittir");
                break;
            case 3:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Afyon şehrine aittir");
                break;
            case 4:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Ağrı şehrine aittir");
                break;
            case 5:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Amasya şehrine aittir");
                break;
            case 6:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Ankara şehrine aittir");
                break;
            case 7:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Antalya şehrine aittir");
                break;
            case 8:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Artvin şehrine aittir");
                break;
            case 9:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Aydın şehrine aittir");
                break;
            case 10:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Balıkesir şehrine aittir");
                break;
            case 11:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Bilecik şehrine aittir");
                break;
            case 12:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Bingöl şehrine aittir");
                break;
            case 13:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Bitlis şehrine aittir");
                break;
            case 14:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Bolu şehrine aittir");
                break;
            case 15:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Burdur şehrine aittir");
                break;
            case 16:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Bursa şehrine aittir");
                break;
            case 17:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Çanakkale şehrine aittir");
                break;
            case 18:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Çankırı şehrine aittir");
                break;
            case 19:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Çorum şehrine aittir");
                break;
            case 20:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Denizli şehrine aittir");
                break;
            case 21:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Diyarbakır şehrine aittir");
                break;
            case 22:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Edirne şehrine aittir");
                break;
            case 23:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Elazığ şehrine aittir");
                break;
            case 24:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Erzincan şehrine aittir");
                break;
            case 25:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Erzurum şehrine aittir");
                break;
            case 26:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Eskişehir şehrine aittir");
                break;
            case 27:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Gaziantep şehrine aittir");
                break;
            case 28:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Giresun şehrine aittir");
                break;
            case 29:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Gümüşhane şehrine aittir");
                break;
            case 30:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Hakkari şehrine aittir");
                break;
            case 31:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Hatay şehrine aittir");
                break;
            case 32:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Isparta şehrine aittir");
                break;
            case 33:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Mersin şehrine aittir");
                break;
            case 34:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve İstanbul şehrine aittir");
                break;
            case 35:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve İzmir şehrine aittir");
                break;
            case 36:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Kars şehrine aittir");
                break;
            case 37:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Kastamonu şehrine aittir");
                break;
            case 38:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Kayseri şehrine aittir");
                break;
            case 39:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Kırklareli şehrine aittir");
                break;
            case 40:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Kırşehir şehrine aittir");
                break;
            case 41:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Kocaeli şehrine aittir");
                break;
            case 42:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Konya şehrine aittir");
                break;
            case 43:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Kütahya şehrine aittir");
                break;
            case 44:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Malatya şehrine aittir");
                break;
            case 45:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Manisa şehrine aittir");
                break;
            case 46:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Kahramanmaraş şehrine aittir");
                break;
            case 47:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Mardin şehrine aittir");
                break;
            case 48:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Muğla şehrine aittir");
                break;
            case 49:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Muş şehrine aittir");
                break;
            case 50:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Nevşehir şehrine aittir");
                break;
            case 51:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Niğde şehrine aittir");
                break;
            case 52:
                System.out.println("Plakanızın il kod:u " + Ilksayı + " ve Ordu şehrine aittir");
                break;
            case 53:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Rize şehrine aittir");
                break;
            case 54:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Sakarya şehrine aittir");
                break;
            case 55:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Samsun şehrine aittir");
                break;
            case 56:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Siirt şehrine aittir");
                break;
            case 57:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Sinop şehrine aittir");
                break;
            case 58:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Sivas şehrine aittir");
                break;
            case 59:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Tekirdağ şehrine aittir");
                break;
            case 60:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Tokat şehrine aittir");
                break;
            case 61:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Trabzon şehrine aittir");
                break;
            case 62:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Tunceli şehrine aittir");
                break;
            case 63:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Şanlıurfa şehrine aittir");
                break;
            case 64:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Uşak şehrine aittir");
                break;
            case 65:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Van şehrine aittir");
                break;
            case 66:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Yozgat şehrine aittir");
                break;
            case 67:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Zonguldak şehrine aittir");
                break;
            case 68:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Aksaray şehrine aittir");
                break;
            case 69:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Bayburt şehrine aittir");
                break;
            case 70:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Karaman şehrine aittir");
                break;
            case 71:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Kırıkkale şehrine aittir");
                break;
            case 72:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Batman şehrine aittir");
                break;
            case 73:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Şırnak şehrine aittir");
                break;
            case 74:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Bartın şehrine aittir");
                break;
            case 75:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Ardahan şehrine aittir");
                break;
            case 76:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Iğdır şehrine aittir");
                break;
            case 77:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Yalova şehrine aittir");
                break;
            case 78:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Karabük şehrine aittir");
                break;
            case 79:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Kilis şehrine aittir ");
                break;
            case 80:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Osmaniye şehrine aittir");
                break;
            case 81:
                System.out.println("Plakanızın il kodu: " + Ilksayı + " ve Düzce şehrine aittir");
                break;
            default:
                System.out.println("Böyle bir şehir kodu bulunmamaktadır. Lütfen tekrar deneyiniz. ");


        }

        switch(harfkodu){
            case "A":
                System.out.println("Harf kodunuz: " +harfkodu+ ", Polis aracı plakası.");
                break;
            case "T":
                System.out.println("Harf kodunuz: " +harfkodu+ ", Taksi plakası.");
                break;
            case "CA":
                System.out.println("Harf kodunuz: " +harfkodu+ ", Elçilik aracı plakası.");
                break;
            case "G":
                System.out.println("Harf kodunuz: " +harfkodu+ ", Geçici araç plakası.");
                break;
            case "MEB":
                System.out.println("Harf kodunuz: " +harfkodu+ ", Eğitim bakanlığına bağlı resmi plakası.");
                break;
            case "M":
                System.out.println("Harf kodunuz: " +harfkodu+ ", Minibüs plakası.");
                break;
            case "S":
                System.out.println("Harf kodunuz: " +harfkodu+ ", Servis plakası.");
                break;
            case "JAA":
                System.out.println("Harf kodunuz: " +harfkodu+ ", Jandarma plakası.");
                break;
            case "SGH":
                System.out.println("Harf kodunuz: " +harfkodu+ ", Sahil güvenlik plakası.");
                break;
            default: //girilen plakadaki harler herhangi resmi bir plaka değil ise default olarak şahsi araç plakası mesajını ekrana yazdırdık
                System.out.println("Şahsi araç plakası.");
                break;

        }
        System.out.println("Plakanızın son sayı kısmı: " + Sonsayı);
    }
}
