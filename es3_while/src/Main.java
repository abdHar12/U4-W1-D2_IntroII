import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = null;
        do{
            System.out.printf("\nInserisci la tua stringa: ");
            str = sc.nextLine();

            if(str.equals(":q")) sc.close();
            else{
                str=inserisciVirgole(str);
                System.out.println(str);
            }
        }while (!(str.equals(":q")));
    }

    public static String inserisciVirgole(String input) {
        StringBuilder risultato = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            risultato.append(input.charAt(i));

            if (i < input.length() - 1) {
                risultato.append(",");
            }
        }

        return risultato.toString();
    }
}