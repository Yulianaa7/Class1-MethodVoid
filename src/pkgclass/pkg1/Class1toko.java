/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass.pkg1;

import java.util.Scanner;

/**
 *
 * @author Yuliana
 */
public class Class1toko {
    //method void isi
    void isi(){
        //membuat scanner
        Scanner input = new Scanner(System.in);
        //membuat judul
        System.out.println("========= TOKO SERBA ADA =========");
        
        System.out.println("");
        
        //user menginputkan nama, harga, dan jumlah barang
        System.out.print("Nama Barang           : ");
        String nama = input.nextLine();
        System.out.print("Harga Barang          : ");
        int harga = input.nextInt();
        System.out.print("Jumlah Barang         : ");
        int jumlah = input.nextInt();
        //menghitung total
        int total = harga*jumlah;
        System.out.println("Total               : "+total);
        
        //membuat perulangan apabila uang yang dimasukkan user kurang dari total
        boolean running = true;
        while(running){
        System.out.print("Masukkan Uang Anda    : ");
        int uang = input.nextInt();
        if (uang<total){
            int kurang = total-uang;
            System.out.println("Mohon maaf uang anda kurang "+"Rp."+kurang+" Silahkan masukkan uang anda lagi");
            running=true; //jika user memasukkan uang kurang maka user akan disuruh memasukkan uang lagi
        }else if (uang>total){
            int lebih = uang - total;
            System.out.println("Kembalian anda "+"Rp."+lebih);
            running=false;//uang user lebih, maka user mendapatkan kembalian dan program akan dilanjutkan ke method void akhir
        }else{
            System.out.println("Uang anda pas");
            running=false;//uang user pas, maka program akan dilanjutkan ke method void akhir
        }
    }
}
    //method void untuk akhiran
    void akhir(){
        System.out.println("");
        System.out.println("Terima kasih telah berbelanja di Toko Serba Ada");
    }
}
