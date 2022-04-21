package ColorArrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class AddColor {
    static ArrayList<String>color_list = new ArrayList<String>();
    static Scanner sc = new Scanner(System.in);

    public static void Colors() {
        System.out.print("Digite quantas cores deseja adicionar: ");
        int quantity = sc.nextInt();
        for (int i = 0; i < quantity; i++) {
            System.out.print("Digite a cor que deseja adicionar: ");
            String color_name = sc.next();
            color_list.add(color_name);
        }
        System.out.println(color_list);
    }
    public static void Iteract() {
        for (int i = 0; i<color_list.size(); i++) {
            String color_name = color_list.get(i);
            System.out.println(color_name);
        }
    }
    public static void InsertFirst(){
        System.out.print("Digite a cor que deseja adicionar: ");
        String color_name = sc.next();
        color_list.add(0, color_name);
        System.out.println(color_list);
    }
    public static void SearchColorId(){
        System.out.print("Digite qual posição você deseja mostrar: ");
        int color_id = sc.nextInt();
        String elements = color_list.get(color_id);
        System.out.println(elements);
    }
    public static void SearchColorName(){
        System.out.print("Digite qual cor você deseja mostrar: ");
        String color_title = sc.next();
        int index = 0;
        for (int i = 0; i<color_list.size(); i++) {
           if(color_list.get(i).equals(color_title)) {
            index = i;               
           }
        }
        System.out.println(index);
    }
    public static void RenameColor(){
        System.out.print("Digite qual gostaria de alterar: ");
        int color_id = sc.nextInt();
        System.out.print("Qual cor gostaria de inserir: ");
        String color_rename = sc.next();
        String elements = color_list.set(color_id, color_rename);
        System.out.println(elements);        
    }
    public static void RemoveColor(){
        System.out.println("Digite qual o id da cor que deseja remover: ");
        int color_id = sc.nextInt();
        color_list.remove(color_id);
        System.out.println(color_list);
    }
    public static void InsertAtPosition(){
        System.out.print("Digite a cor que deseja adicionar: ");
        String color_name = sc.next();
        System.out.print("Digite o id que deseja adicionar: ");
        int index = sc.nextInt();
        color_list.add(index, color_name);
        System.out.println(color_list);
    }
    public static void AlphabeticalSort(){
        Collections.sort(color_list);
        System.out.println(color_list);
    }
}