import java.util.*;
//TODO incluir a lógica para o logradouro

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Informe o seu endereço: ");
            String address = scanner.nextLine();

            String [] vector = address.split(" ");
            String addressNumber = "";

            for (int i = 0; i < vector.length; i++){
                for(int j = 0; j < vector[i].length(); j++){

                    if (Character.isDigit(vector[i].charAt(j))){
                        addressNumber = vector[i];
                        break;
                    }
                }
            }

            System.out.println("Número do endereço: " + addressNumber);
        }
        catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
