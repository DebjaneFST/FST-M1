package activities;
 abstract class Book {
    String title;

    // Abstract method
    abstract void setTitle(String s);

    // Concrete method
    String getTitle() {
        return title;
    }
}

 class MyBook extends Book {

    // Implementing abstract method
    public void setTitle(String s) {
        title = s;
    }
}

public class Activity5 {

    public static void main(String[] args) {

        // Create object of MyBook
        MyBook newNovel = new MyBook();

        // Set title
        String title = "Mahenjodaro";
        newNovel.setTitle(title);

        // Print result
        System.out.println("The title is: " + newNovel.getTitle());
    }
}
