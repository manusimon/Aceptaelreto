
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class aceptaelreto452 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int bolas = sc.nextInt();

        while(bolas >= 2){

            ArrayList<Integer> numeros = new ArrayList<>();
            HashSet<Integer> set = new HashSet<>();

            for(int i=0;i<bolas;i++){

                numeros.add(sc.nextInt());

            }

            for(int i=0;i<numeros.size();i++){
                for(int j=0;j<numeros.size();j++){

                    if(j == i) break;
                    set.add(Math.abs((int)(numeros.get(i)-numeros.get(j))));

                }
            }

            List<Integer> orden = new ArrayList<Integer>(set);
            Collections.sort(orden);
            Iterator<Integer> it = orden.iterator();

            while(it.hasNext()){

                int n = it.next();
                System.out.print(n);

                if(it.hasNext()){

                    System.out.print(" ");

                }

            }

            System.out.println();
            bolas = sc.nextInt();
        }

        sc.close();

    }
}
