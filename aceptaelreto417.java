
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;

public class aceptaelreto417 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb;
        int personas = sc.nextInt();

        while(personas != 0){

            ArrayList<String> fechas = new ArrayList<>();
            HashSet<String> set = new HashSet<>();

            boolean resultado = false;
            String s = "";

            for(int i=0;i<personas;i++){

                s = sc.next().replace("/", "");
                sb = new StringBuilder(s);
                for(int j=4;j>0;j--){
                    sb.deleteCharAt(sb.length()-1);
                }
                s = sb.toString();
                fechas.add(s);

            } 

            for(String f : fechas){
                if(set.add(f) == false){
                    resultado = true;
                }
            }
            

            if(resultado == true) System.out.println("SI");
            
            else System.out.println("NO");

            personas = sc.nextInt();
        }

    }
}
