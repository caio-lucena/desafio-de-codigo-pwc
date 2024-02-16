import java.util.*;

//TODO tratar caso 2.b (padrão é de apenas uma letra depois do número, vide caso 1.c)
//TODO pensar em mais casos de erros

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Informe o seu endereço: ");
            String fullAddress = scanner.nextLine();

            String [] vector = fullAddress.split(" ");
            String [] auxVector = new String[vector.length];

            String address = "";
            String addressNumber = "";
            String separator = " ";

            int aux = 0;

            for (int i = 0; i < vector.length; i++){
                for (int j = 0; j < vector[i].length(); j++){

                    auxVector[i] = vector[i].replace(",", "");

                }
            }

            for (int i = 0; i < auxVector.length; i++){
                for (int j = 0; j < auxVector[i].length(); j++){
                    if(Character.isDigit(auxVector[i].charAt(j))){
                        addressNumber = auxVector[i];
                        aux = i;

                    }
                }
            }

            boolean isAbbreviation = aux > 0 && (auxVector[aux -1].equals("No"));


            if (isAbbreviation){
                String auxAddressNumber = addressNumber;
                addressNumber = auxVector[aux-1].concat(separator).concat(auxAddressNumber);
                auxVector[aux-1] = "";
            }

            for (int i = 0; i < auxVector.length; i++){
                if(i != aux){
                    String auxAddress = auxVector[i];
                    address = address.concat(auxAddress).concat(separator);
                }
            }

            String addressNumberWithoutComma = addressNumber.replace(",", "");

            System.out.println("{\"" + address.trim() + "\"" + ", \"" + addressNumberWithoutComma.trim() + "\"}");

        }
        catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
