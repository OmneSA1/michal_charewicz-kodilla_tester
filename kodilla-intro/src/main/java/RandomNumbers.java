public class RandomNumbers {
    int maxNumber = 0;
    int minNumber = 30;
    int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
    int sum = 0;
    public static void main(String[] args){
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.generateAndProcessNumbers();
        System.out.println("Największa wylosowan liczba " + randomNumbers.getMaxNumber());
        System.out.println("Najmniejsza wylosowana liczba " + randomNumbers.getMinNumber());
    }
    public void generateAndProcessNumbers(){
        int index = 0;
                while(sum <= 5000){
                    int number = numbers[index % numbers.length];
                    sum += number;
                    if(number > maxNumber){
                        maxNumber = number;
                    }
                    if(number < minNumber){
                        minNumber = number;
                    }
                    index++;
                }
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }
}
