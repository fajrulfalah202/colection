import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class tuugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] nama = {"siska", "lili", "bobon","silvia","kobo", "yopi", "anya", "alia", "nia", "zen"};
        String [] nrp = {"001", "002", "003","004","005", "006", "007", "008", "009", "0010"};
        float nilai [];
        float temp=0;
        String tempnama;
        String tempnrp;
        nilai = new float[10];

        for (int i=0; i<10; i++)
        {
            System.out.println("nilai untuk "+ nama[i]+" bernim "+ nrp[i]);
            nilai[i]= input.nextFloat();
        }

        for (int b=0; b<10;b++)
        {
            for (int c =1; c<10;c++)
            {
                if (nilai[c-1]>nilai[c])
                {
                     temp = nilai[c-1];
                     nilai [c-1]=nilai[c];
                     nilai [c]=temp;

                     tempnama = nama[c-1];
                     nama [c-1]=nama[c];
                     nama [c]=tempnama;

                     tempnrp = nrp[c-1];
                     nrp [c-1]=nrp[c];
                     nrp [c]=tempnrp;
                   
                    
                    
                }
            }
        }

        for  (int b=0; b<10;b++)
        {
            System.out.println(nama[b]+" "+ nrp[b]+" "+ nilai[b]);
        }


        


      
    }
}
