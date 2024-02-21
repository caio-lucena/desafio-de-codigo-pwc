import service.AddressFormatter;

import java.util.*;

//github https://github.com/caio-lucena/desafio-de-codigo-pwc/tree/main

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Informe o seu endereço: ");
            String fullAddress = scanner.nextLine();

            System.out.println(AddressFormatter.format(fullAddress));

        }
        catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }

}
