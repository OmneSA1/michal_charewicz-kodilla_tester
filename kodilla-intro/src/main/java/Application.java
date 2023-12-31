public class Application {
    public static void main(String[] args) {
        User user1 = new User("Adam", 40.5, 178);

        User[] users = {user1};
        user1.checkUser();

    }

    public static class User {
        String name;
        double age;
        double height;

        public User(String name, double age, double height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public void checkUser() {
            if (name != null) {
                if (age > 30 && height > 160) {
                    System.out.println("User is older than 30 and taller than 160cm");
                } else {
                    System.out.println("User is 30 (or younger) or 160cm (or shorter)");
                }
            }
        }
    }
}
