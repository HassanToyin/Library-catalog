
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

       Book theBook = new Book();

       Scanner scanner = new Scanner(System.in);


        System.out.println("please enter the title of the book /n");
        String Title = scanner.nextLine();
        theBook.setTitle(Title);

        System.out.println("please enter the name of the author of the book /n");
        String Author = scanner.nextLine();
        theBook.setAuthor(Author);

        System.out.println("please enter the ISBN of the book /n");
        String ISBN = scanner.nextLine();
        theBook.setISBN(ISBN);

        System.out.println("please enter the Genre of the book /n");
        String Genre = scanner.nextLine();
        theBook.setGenre(Genre);

        ArrayList<String> LibraryBooks = new ArrayList<String>();
        LibraryBooks.add("literature");
        LibraryBooks.add("biology");
        LibraryBooks.add("english");
        LibraryBooks.add("math");
        LibraryBooks.add("account");

        LibraryCatalog libraryAccess = new LibraryCatalog();
        System.out.println(LibraryBooks);

        System.out.println("To add a book - enter 1, To remove a book - enter 2, To find a book - enter 3, To list all book - enter 4");
        int toDo = scanner.nextInt();

        switch (toDo){
            case 1:
                System.out.println("please enter the title of the book /n");
                String addBook = scanner.nextLine();
                libraryAccess.setAddBook(addBook);
                LibraryBooks.add(addBook);

                System.out.println(LibraryBooks);
                break;

            case 2:
                System.out.println("please enter the title of the book /n");
                String removeBook = scanner.nextLine();
                libraryAccess.setRemoveBook(removeBook);
                LibraryBooks.remove(removeBook);

                System.out.println(LibraryBooks);
                break;

            case 3:
                System.out.println("please enter the index of the book to search /n");
                int findBook = scanner.nextInt();
                libraryAccess.setFindBook(findBook);

                System.out.println(LibraryBooks.get(findBook));
                break;

            case 4:

                System.out.println(LibraryBooks);
                break;

            case 5:

                System.out.println("Invalid input");
                break;

        }























    }
}