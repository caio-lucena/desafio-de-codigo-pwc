import java.util.*;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Informe o seu endereço: ");
            String fullAddress = scanner.nextLine();

            String [] vector = fullAddress.split(" ");
            String addressNumber = "";
            StringBuilder strBuilder = new StringBuilder();

            int aux = 0;

            for (int i = 0; i < vector.length; i++){
                for(int j = 0; j < vector[i].length(); j++){

                    if (Character.isDigit(vector[i].charAt(j))){
                        addressNumber = vector[i];
                        aux = i;
                    }
                }
            }

            //TODO corrigir palavras truncadas e caracteres como ',' no número. Ex: "4, Rue de la République"
            //TODO revisar necessidade de utilizar o StringBuilder

            for (int i = 0; i < vector.length; i++){
                if(i != aux){
                    strBuilder.append(vector[i]);
                }
            }

            System.out.println("{\"" + strBuilder + "\"" + ", \"" + addressNumber + "\"}");

        }
        catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
