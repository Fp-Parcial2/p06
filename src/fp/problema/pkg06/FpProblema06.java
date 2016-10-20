
package fp.problema.pkg06;
import java.util.*;

public class FpProblema06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int horas;
        double SalarioTotal;
        double sxh=9.23;
        SalarioTotal=dinero();
    }
    public static double dinero(){
        int horas;
        double sxh=9.23;
    Scanner entrada= new Scanner(System.in);
    System.out.println("Introduce las horas que trabajo el empleado:");
        horas= entrada.nextInt();
       
    if(horas==40){
        System.out.println("El salario es:" + (horas*sxh) );
        }
    else if((horas>40)&&(horas<=48)){
        System.out.println("El salario es: $" + ((horas*sxh) + (sxh * 2)));
        }
    else if (horas>=49){
        System.out.println("El salario es: $" + ((horas*sxh) + sxh *3 ));
        
    }else{
            System.out.println("FIN");
        }
        
            return horas;
    }

        
        
    }
    
    
    

