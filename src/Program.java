import java.util.*;

//TODO pensar em mais casos de erros

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Informe o seu endereço: ");
            String fullAddress = scanner.nextLine();

            System.out.println(formatAddress(fullAddress));

        }
        catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }

    public static String formatAddress(String fullAddress){

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
        boolean isAddressComplement = (aux + 1 < auxVector.length) && (auxVector[aux + 1].length() == 1);

        if (isAbbreviation){
            String auxAddressNumber = addressNumber;
            addressNumber = auxVector[aux-1].concat(separator).concat(auxAddressNumber);
            auxVector[aux-1] = "";
        }

        if (isAddressComplement){
            addressNumber = addressNumber.concat(separator).concat(vector[aux + 1]);
            auxVector[aux + 1] = "";
        }

        for (int i = 0; i < auxVector.length; i++){
            if(i != aux){
                String auxAddress = auxVector[i];
                address = address.concat(auxAddress).concat(separator);
            }
        }

        String addressNumberWithoutComma = addressNumber.replace(",", "");

        return "{\"" + address.trim() + "\"" + ", \"" + addressNumberWithoutComma.trim() + "\"}";

    }
}
