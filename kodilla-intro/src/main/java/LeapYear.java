public class LeapYear {
    public static void main(String[] args) {
         int year = 2024;
        if (isLeapYear(year)) {
            System.out.println(year +  " jest rokiem przestępnym");
        }else {
            System.out.println(year + " nie jest rokiem przestępnym");
        }
    }
    public static boolean isLeapYear(int year){
        if(year % 4 == 0) {
            return true;
        }else {
            return false;
        }
    }
}