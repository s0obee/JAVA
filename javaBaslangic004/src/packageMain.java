import java.util.Scanner;
import math.dortIslem;
import math.logaritma;

public class packageMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adiniz..: ");

        String name = scanner.nextLine();
        System.out.println("Merhaba " + name);

        dortIslem dortIslem = new dortIslem();
        logaritma logaritma = new logaritma();
        System.out.println(dortIslem.topla(1,2));
        System.out.println(logaritma.logaritmaHesapla());

    }

}