package asd.modul3_tugas;
import java.util.Scanner;
public class modul3_tugas1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        String[] angka = {"Galileo","Archimedes","Alkhawarizmi","Aljabar","Tegar","Tesla"};
        int found = 0;
        System.out.println("Nama-nama orang berpengaruh:/n");
        for (int i=0; i<angka.length; i++){
             System.out.print("|"+angka[i]+"| ");
             }
        System.out.println("\n\nmasukan nama yang akan dicari:");
        String key = input.nextLine();
        
        for (int i=0; i<angka.length; i++){
            if (key.equalsIgnoreCase(angka[i])){
                found = 1;
                System.out.println("nama: "+key+", pada indeks ke-"+i);
                break;
            }
        }
        if (found == 1){
            System.out.println("data telah ditemukan");
        }
        else{
            System.out.println("data tidak ditemukan");
            System.out.println("\n===== hai Tegar =====");
        }
    }
}
//tegarrizqyyuliansantoso(20090080)