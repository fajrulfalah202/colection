import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.lang.annotation.Target;
import java.util.HashSet;
import java.util.Iterator;

public class tugas1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<String> warna= new LinkedList<String>();

        warna.add("magenta");
        warna.add("red");
        warna.add("white");
        warna.add("blue");
        warna.add("cyan");

        System.out.println(warna);

       
            LinkedList<String> hapus_warna= new LinkedList<String>();
    
         
            hapus_warna.add("red");
            hapus_warna.add("white");
            hapus_warna.add("blue");

            Set baru = new TreeSet<String>(warna);
            baru.removeAll(hapus_warna);
          

       
         
       
           
         System.out.println(baru);

        System.out.println("selesai"); 
    }
          
    
    
}
