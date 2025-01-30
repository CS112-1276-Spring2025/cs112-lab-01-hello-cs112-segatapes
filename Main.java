public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
        System.out.println("Hi! I'm a change! :)");

        System.out.println("Do I like video games? " + Main.isALike("video games"));
        System.out.println("Do I like boxing? " + Main.isALike("boxing"));
        Main.printAboutMe();

        //String writer, String illustrator, String colorist, String title, int issueNum
        Comic myFavorite = new Comic("Urasawa Naoki", "Urasawa Naoki", "Urasawa Naoki", "Monster", 1);
        Comic nerysFavorite = new Comic("Stan Lee", "Ramos", "Delgado", "Spidey", 50);


        nerysFavorite.setTitle("Amazing Spider-Man");
        nerysFavorite.setIssueNum(1);

        System.out.println("My favorite comic is " + myFavorite);
        System.out.println("Nery's favorite comic is " + nerysFavorite);

        System.out.println("Is Nery's Favorite Comic the same as mine? " + nerysFavorite.equals(myFavorite));


    }

    public static void printAboutMe() {
        System.out.println("I like video games, gamedev, music, manga, anime, and writing.");
    }

    public static boolean isALike(String topic) {
        String myLikes = "I like video games, game development, music, manga, anime, and writing.";
        return myLikes.contains(topic);
    }
}