import java.util.*;

//TODO tratar casos semelhantes a 2.b, 3.c (vírgulas também devem ser retiradas do logradouro) e 3.d (há um " a mais no campo número)

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Informe o seu endereço: ");
            String fullAddress = scanner.nextLine();

            String [] vector = fullAddress.split(" ");

            String address = "";
            String addressNumber = "";
            String addressNumberWithoutComma = "";
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
            boolean containsComma = vector[aux].contains(",");

            if (isAbbreviation){
                String auxAddressNumber = addressNumber;
                addressNumber = vector[aux-1].concat(separator).concat(auxAddressNumber);
                vector[aux-1] = "";
            }

            if(containsComma){
                addressNumberWithoutComma = addressNumber.replace(",", "");
            }


            for (int i = 0; i < vector.length; i++){
                if(i != aux){
                    String auxAddress = vector[i];

                    address = address.concat(auxAddress).concat(" ");
                }
            }

            if(containsComma){
                System.out.println("{\"" + address.trim() + "\"" + ", \"" + addressNumberWithoutComma.trim() + "\"}");
            }
            else {
                System.out.println("{\"" + address.trim() + "\"" + ", \"" + addressNumber.trim() + "\"}");
            }

        }
        catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
