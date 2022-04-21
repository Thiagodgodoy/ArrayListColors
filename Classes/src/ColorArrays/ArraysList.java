package ColorArrays;
import java.util.Scanner;

public class ArraysList {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Menu Principal");
            System.out.println("1 - Adicionar cores | 2 - Iterar cores | 3 - Primeira posição");
            System.out.println("4 - Buscar pelo id | 5 - Buscar pelo nome | 6 - Renomear cor");
            System.out.println("7 - Remover cor | 8 - Inserir em determinada posição | 9 - Ordem alfabetica");   
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
                case 4 -> AddColor.SearchColorId();
                case 5 -> AddColor.SearchColorName();
                case 6 -> AddColor.RenameColor();
                case 7 -> AddColor.RemoveColor();
                case 8 -> AddColor.InsertAtPosition();
                case 9 -> AddColor.AlphabeticalSort();
            }
        } while (choice != 0);
        sc.close();
    }
}
