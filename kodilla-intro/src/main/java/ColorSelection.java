import java.util.Scanner;
public class ColorSelection {
    public static void main(String[] args){
        String color = getColor();
        System.out.println("Wybrany kolor to: " + color);
    }
    public static String getColor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą literę koloru:");
        String letter = scanner.nextLine().trim().toUpperCase();

        switch (letter){
            case "B":
                return "Biały";
            case "N":
                return "Niebieski";
            case "Ż":
                return "Żółty";
            case "F":
                return "Fioletowy";
            case "Z":
                return "Zielony";
            case "R":
                return "Różowy";
            default:
                return "Nieznam tego koloru";
        }
    }
}
