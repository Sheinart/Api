public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Андрей";
        post.passport = "1212 № 18395836";
        post.patronymic = "Сергеевич";
        post.phone = "+7 (977)-966-96-69";
        post.surname = "Манохов";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 10;
        post.birthday.month = 3;
        post.birthday.year = 1995;
    }
}
