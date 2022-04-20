package ColorArrays;

import java.util.ArrayList;
import java.util.Scanner;

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
}