public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 599, 2022);
        System.out.println("Classic notebook weight: " + notebook.weight + " and price: " + notebook.price + " and year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearOfProductionAndPrice();

        Notebook heavyNotebook = new Notebook(2000,2200,2018);
        System.out.println("Heavy Notebook weight: "+ heavyNotebook.weight +  " and price: " + heavyNotebook.price + " and year: " + heavyNotebook.year );
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearOfProductionAndPrice();

        Notebook oldNotebook = new Notebook(1500,900,2012);
        System.out.println("Old Notebook weight: "+ oldNotebook.weight + " and price: " + oldNotebook.price + " and year: " + oldNotebook.year );
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearOfProductionAndPrice();
    }
}

class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice(){
        if(this.price < 600){
            System.out.println("This notebook is very cheap");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good");
        }else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight(){
        if(this.weight < 700){
            System.out.println("This notebook is very light ");
        }else if (this.weight > 700 && this.price < 1500){
            System.out.println("This notebook is not too heavy");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }
    public void checkYearOfProductionAndPrice(){
        if(this.price <= 600 && this.year>=2022){
            System.out.println("Wow! This laptop is a great deal");
        } else if (this.price < 600 && this.year < 2021) {
            System.out.println("It's still a great deal");
        } else if (this.price > 1000 && this.price < 2300 && this.year < 2019) {
            System.out.println("It's averagely profitable");
        } else{
            System.out.println("This is no deal, don't take it");
        }
    }

}
