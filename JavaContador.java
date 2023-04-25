import java.util.*;
public class JavaContador {
    public static void main(String[] args) {

        int serie=1;
        boolean sumar =true;
        int cont;
        String cadena="Serie: ";

        System.out.println("Indique cuantos numeros de la serie desea ver: ");
        Scanner sc = new Scanner(System.in);
        cont=sc.nextInt();

        do {
                cadena=cadena.concat(String.valueOf(serie)+ " ");
                cont--;

                if (sumar) serie+=4;
                else serie-=2;

                sumar=!sumar;
        } while (cont>0);
            System.out.println(cadena);

    }
}
