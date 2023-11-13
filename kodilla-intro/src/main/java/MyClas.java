public class MyClas {
    public static void main(String[] args) {
        User name1 = new User("Anna", 20);
        User name2 = new User("Betty", 33);
        User name3 = new User("Carl", 58);
        User name4 = new User("David", 13);
        User name5 = new User("Eva", 18);
        User name6 = new User("Frankie", 45);
        User[] users = {name1, name2, name3, name4, name5, name6};

        int result = 0;
        for(int i = 0; i < users.length; i++){
            result += users[i].getAge();
        }
        int averageAge = result / users.length;

        for(int i = 0; i < users.length; i++){
            if (users[i].getAge() < averageAge) {
                System.out.println(users[i].getName());
            }
        }
    }


    public static class User {
        String name;
        int age;

        public User(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}

