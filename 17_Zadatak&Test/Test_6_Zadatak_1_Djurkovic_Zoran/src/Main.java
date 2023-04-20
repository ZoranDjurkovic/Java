import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner ulaz = new Scanner (System.in);
        int broj;
 
        System.out.print(" Unesi broj: ");
        broj = ulaz.nextInt();
        
 
        boolean prostBroj=true;
 
        for (int i=2; i < broj && prostBroj==true; i++)
        	
            if (broj%i==0)
                prostBroj=false;
        
        if (prostBroj==true)
            System.out.print(" Unijet broj je prost.");
        else
            System.out.print(" Unijeti broj nije prost broj");
    }
}


