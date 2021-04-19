import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class aceptaelreto152 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        while(casos != 0){

            ArrayList<Integer> numeros = new ArrayList<>();
            Map<Integer,Integer> m = new HashMap<>();

            for(int i=0;i<casos;i++){
                numeros.add(sc.nextInt());
            }

            for(Integer n : numeros){

                Integer freq = m.get(n);
                m.put(n, (freq == null)? 1 : freq+1);

            }

            int mayor = -99;
            int moda = 0;

            for(Map.Entry<Integer, Integer> entry : m.entrySet() ){
                if(entry.getValue() > mayor){
                    moda = entry.getKey();
                    mayor = entry.getValue();
                }
            }

            System.out.println(moda);

            casos = sc.nextInt();
        }

        sc.close();

    }
}
