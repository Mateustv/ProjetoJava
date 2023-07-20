import com.aprendendojava.dominios.Disciplina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teste = scanner.nextLine();

        System.out.println(teste);
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(teste);
        System.out.println("Hello World!");
    }
}