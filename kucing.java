package pemlan.modul1classobject;

import pemlan.modul1classobject.cat;
public class kucing {

    public static void main(String[] args) {
        // deklarasi variable
        cat swiper, pucho;

        // instansiasi swiper
        swiper = new cat();
        swiper.warna = "Orange";
        swiper.umur = 2;
        swiper.mata = "Kuning dan Hijau";

        // instansiasi pucho
        pucho = new cat();
        pucho.warna = "Putih Coklat";
        pucho.umur = 3;
        pucho.mata = "Kuning";

        System.out.println("Kucing saya yang pertama:\n" +
                "warna: " + swiper.warna + "\n" +
                "umur: " + swiper.umur + " tahun" + "\n" +
                "mata: " + swiper.mata + "\n" +
                "suara swiper: " + swiper.soundswiper() + "\n" +
                "makanan kesukaan swiper: ");
        swiper.makananswiper();
        System.out.println();

        System.out.println("Kucing saya yang kedua: \n" +
                "warna: " + pucho.warna + "\n" +
                "umur: " + pucho.umur + " tahun" + "\n" +
                "mata: " + pucho.mata + "\n" +
                "suara pucho: " + pucho.soundpucho() + "\n" +
                "makanan kesukaan pucho: ");
        pucho.makananpucho();

    }
}
