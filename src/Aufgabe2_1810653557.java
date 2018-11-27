import javax.swing.*;

public class Aufgabe2_1810653557 {
    public static void main(String[]args){

        int var1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib die erste Zahl ein"));
        int var2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib die zweite Zahl ein"));

        if (var1 == var2){
            System.out.println("Die Variablen sind gleich");
        }else(var1 != var2) {
            while (var1 != var2) {
                if(var1 > var2) {
                    ++var2;
                }else if (var1 < var2){
                        ++var1;
                }
            }
        }
    }
}
