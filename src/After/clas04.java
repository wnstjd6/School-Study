package After;
import java.util.*;

abstract class Book2 {
    protected String name;
    protected int page;

    public Book2(String name, int page) {
        this.name = name;
        this.page = page;
    }

    public void BookInfo() {
        System.out.println("책 제목 : " + name + "  페이지 수 : " + page);
    }
}

class GaBook2 extends Book2 {
    public GaBook2(String name, int page) {
        super(name, page);
    }
}

class NaBook2 extends Book2 {
    public NaBook2(String name, int page) {
        super(name, page);
    }
}

class DaBook2 extends Book2 {
    public DaBook2(String name, int page) {
        super(name, page);
    }
}

class RaBook2 extends Book2 {
    public RaBook2(String name, int page) {
        super(name, page);
    }
}

public class clas04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book2[] books = new Book2[10];
        int count = 0;

        while (count < books.length) {
            System.out.print("책 이름 : ");
            String name = sc.next();
            System.out.print("페이지 수 : ");
            int page = sc.nextInt();

            char firstChar = name.charAt(0);
            Book2 book = null;

            switch (firstChar) {
                case '가':
                    book = new GaBook2(name, page);
                    break;
                case '나':
                    book = new NaBook2(name, page);
                    break;
                case '다':
                    book = new DaBook2(name, page);
                    break;
                case '라':
                    book = new RaBook2(name, page);
                    break;
                default:
                    System.out.println("다시 입력");
                    continue;
            }

            books[count++] = book;
        }

        for (Book2 book : books) {
            book.BookInfo();
        }

        sc.close();
    }
}