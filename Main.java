public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
        
        System.out.println("Do I like video games? " + Main.isALike("video games"));
        System.out.println("Do I like boxing? " + Main.isALike("boxing"));

        Main.printAboutMe();
    }

    public static void printAboutMe() {
        System.out.println("I like video games, gamedev, music, manga, anime, and writing.");
    }

    public static boolean isALike(String topic) {
        String myLikes = "I like video games, game development, music, manga, anime, and writing.";
        return myLikes.contains(topic);
    }
}