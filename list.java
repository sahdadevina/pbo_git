package pbo_sahda;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        // membuat List
        List<String> arr = new ArrayList<>();
        
        // menambahkan beberapa data ke List
        arr.add("Semangka");
        arr.add("Kurma");
        arr.add("Nangka");
        
        System.out.println(arr);
        // mencetak tiap-tiap data
        for (String buah : arr) {
            System.out.println(buah);
        }
    }
}
