import java.util.*;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Informe o seu endereço: ");
            String fullAddress = scanner.nextLine();

            String [] vector = fullAddress.split(" ");

            String address = "";
            String addressNumber = "";
            String separator = " ";

            int aux = 0;

            for (int i = 0; i < vector.length; i++){
                for (int j = 0; j < vector[i].length(); j++){
                    if(Character.isDigit(vector[i].charAt(j))){
                        addressNumber = vector[i];
                        aux = i;
                    }
                }
            }

            boolean isAbbreviation = aux > 0 && (vector[aux -1].equalsIgnoreCase("n°") || vector[aux -1].equals("No"));


            if (isAbbreviation){
                String auxAddressNumber = addressNumber;
                addressNumber = vector[aux-1].concat(separator).concat(auxAddressNumber);
                vector[aux-1] = "";
            }







            System.out.println("{\"" + address.trim() + "\"" + ", \"" + addressNumber.trim() + "\"}");

        }
        catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
