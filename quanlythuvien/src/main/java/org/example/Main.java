package org.example;

public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        Book b1 = new Book("B001", "Lập trình Java", "Nguyễn Văn A");
        Book b2 = new Book("B002", "Cấu trúc dữ liệu", "Trần Thị B");

        manager.addBook(b1);
        manager.addBook(b2);

        User u1 = new User("U001", "Học sinh A");
        User u2 = new User("U002", "Sinh viên B");

        manager.borrowBook("B001", u1);
        manager.borrowBook("B002", u2);
        manager.borrowBook("B001", u2); // mượn lại sách đã mượn

        manager.showBorrowedBooks();

        manager.returnBook("B001");
        manager.showReturnedBooks();
        manager.showBorrowedBooks();

    }
}