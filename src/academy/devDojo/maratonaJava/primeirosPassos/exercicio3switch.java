package academy.devDojo.maratonaJava.primeirosPassos;
import java.util.Scanner;
public class exercicio3switch {


    public static void main(String[] args) {


        byte diaSem = 1;

        switch (diaSem){
            case 1:
            case 7:
                System.out.println("final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;


        }
    }
}
