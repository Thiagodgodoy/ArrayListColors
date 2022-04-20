package ColorArrays;
import java.util.Scanner;

public class ArraysList {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Menu Principal");
            System.out.println("1 - Adicionar cores | 2 - Iterar cores | 3 - Inserir cor na primeira posição");
            System.out.println("0 - Sair");
            System.out.print("Digite qual opção deseja executar:  ");
            choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Programa encerrado.");
            }
            switch (choice) {
                case 1 -> AddColor.Colors();
                case 2 -> AddColor.Iteract();
                case 3 -> AddColor.InsertFirst();
            }
        } while (choice != 0);
        sc.close();
    }
}
