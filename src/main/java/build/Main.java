package build;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Maksym")
                .age(18)
                .occupation("UCU")
                .occupation("Homework")
                .lastName("Tsapiv")
                .gender("war plane F-71")
                .build();
        System.out.println(user);
    }
}