package ProjectQuestions;

import java.util.Scanner;

public class Info {
    public static Book getBookInfo() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter title : ");
        String title = scanner.nextLine();
        System.out.print("Please enter Author : ");
        String author = scanner.nextLine();
        System.out.print("Please enter Publisher : ");
        String publisher = scanner.nextLine();
        System.out.print("Please enter number of pages : ");
        int pages = scanner.nextInt();
        System.out.print("Please enter publish year: ");
        int year = scanner.nextInt();

        Book newBook = new Book(title, author, publisher, pages, year);
        return newBook;
    }
}



