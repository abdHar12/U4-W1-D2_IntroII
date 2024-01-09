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
            System.out.printf(str);
            if(str.equals(":q")) sc.close();
        }while (!(str.equals(":q")));
    }
}