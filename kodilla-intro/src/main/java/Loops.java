public class Loops {
    public static void main(String[] args) {
        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        int numberOfLength = names.length;
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
//Wyświetlanie elementów tablicy od końca //////
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }


}
}