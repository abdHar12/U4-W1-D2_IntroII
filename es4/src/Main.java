import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Inserisci il numero: ");
        int num = sc.nextInt();
        for(int i=num;i>=0;i--){
            System.out.println(i);
        }
    }
}