package pbo_sahda;

import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        // buat instansi baru
        Set<String> arr = new HashSet<>();
        
        // tambahkan element
        arr.add("satu");
        arr.add("dua");
        arr.add("tiga");
        arr.add("empat");
        arr.add("lima");
        
        // cetak array
        System.out.println(arr);
        // cetak tiap-tiap element
        for (String angka : arr) {
            System.out.println(angka);
        }
    }
}
