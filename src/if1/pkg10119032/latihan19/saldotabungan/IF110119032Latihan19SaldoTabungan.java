package if1.pkg10119032.latihan19.saldotabungan;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan
 * total saldo tabungan tiap bulannya.
 */
public class IF110119032Latihan19SaldoTabungan {

    public static void main(String[] args) {
        
        //menginstansiasikan kelas Scanner agar dapat digunakan
        Scanner scan = new Scanner(System.in);
        
        //pengguna memasukkan saldo awal, bunga perbulan, dan lama menabung
        System.out.print("Saldo awal : Rp. ");
        int saldoAwal = scan.nextInt();
        System.out.print("Bunga/bulan(%) : ");
        int bunga = scan.nextInt();
        System.out.print("Lama (Bulan) : ");
        int bulan = scan.nextInt();
        
        //inisialisasi variabel i untuk digunakan didalam perulangan
        int i = 1;
        
        //perulangan untuk menuliskan total saldo perbulannya
        do{
            System.out.print("Saldo di bulan ke-" + i + " Rp. ");
            int bunga2 = (saldoAwal*bunga)/100;
            saldoAwal = saldoAwal + bunga2;
            
            //menampilkan total saldo ke layar
            DecimalFormat commaFormat;
            commaFormat = new DecimalFormat("#,###");
            System.out.println(commaFormat.format(saldoAwal));
            i++;
            
        }while(i <= bulan);
    }
    
}
