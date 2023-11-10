public class Grades {
    public static void main(String[] args) {
        Grades myGrades = new Grades();
        myGrades.add(3);
        myGrades.add(6);
        myGrades.add(11);
        myGrades.add(5);
        myGrades.add(3);
        System.out.println("Ostatnia dodana ocena: " + myGrades.getLastGrade());
        System.out.println("Średnia ocen: " + myGrades.getAverage());
    }
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value){
        if(this.size == 10){
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int getLastGrade() {
        if (this.size == 0) {
            return -1;
        }
        return this.grades[this.size - 1];
    }

    public int getAverage() {
        if (this.size == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum += this.grades[i];
        }
        return sum / this.size;
    }
}
