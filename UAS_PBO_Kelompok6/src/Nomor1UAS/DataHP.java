/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor1UAS;

/**
 *
 * @author Eka Prasetiawan (22104410028) (TI-A)
 */
public class DataHP implements Pajak{
    String vendor;
    String tipe;
    int harga;

    public DataHP(String vendor, String tipe, int harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }

    @Override
    public double hitungPajak() {
        double PAJAK = 0;
        
        if (harga > 4000000 && harga <= 4200000) {
            PAJAK = 0.01;
        } else if (harga > 4200000 && harga <= 4500000) {
            PAJAK = 0.02;
        } else if (harga > 4500000) {
            PAJAK = 0.05;
        }

        return (harga + (harga * PAJAK));
    }
    
    public static void main(String[] args) {
        DataHP hp1 = new DataHP("Samsung", "A 51",5000000);
        DataHP hp2 = new DataHP("Oppo", "Reno 5", 4400000);
        DataHP hp3 = new DataHP("Xiaomi", "A1", 4100000);

        System.out.println("hp ke-1:");
        System.out.println("Vendor: " + hp1.vendor);
        System.out.println("Tipe: " + hp1.tipe);
        System.out.println("Harga: Rp " + hp1.harga);
        System.out.println("Harga setelah ditambahkan PAJAK: Rp " + hp1.hitungPajak());

        System.out.println("\nhp ke-2:");
        System.out.println("Vendor: " + hp2.vendor);
        System.out.println("Tipe: " + hp2.tipe);
        System.out.println("Harga: Rp " + hp2.harga);
        System.out.println("Harga setelah ditambahkan PAJAK: Rp " + hp2.hitungPajak());

        System.out.println("\nhp ke-3:");
        System.out.println("Vendor: " + hp3.vendor);
        System.out.println("Tipe: " + hp3.tipe);
        System.out.println("Harga: Rp " + hp3.harga);
        System.out.println("Harga setelah ditambahkan PAJAK: Rp " + hp3.hitungPajak());
    }
}
