package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<Book> books = new ArrayList<>();
    private List<LoanRecord> records = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(String bookId, User user) {
        for (Book book : books) {
            if (book.getId().equals(bookId) && book.isAvailable()) {
                book.setAvailable(false);
                records.add(new LoanRecord(user, book, LocalDate.now()));
                System.out.println(user.getName() + " đã mượn sách: " + book.getTitle());
                return;
            }
        }
        System.out.println("Không thể mượn sách. Có thể sách không tồn tại hoặc đã được mượn.");
    }

    public void returnBook(String bookId) {
        for (LoanRecord record : records) {
            if (record.getBook().getId().equals(bookId) && !record.isReturned()) {
                record.returnBook(LocalDate.now());
                System.out.println("Đã trả sách: " + record.getBook().getTitle());
                return;
            }
        }
        System.out.println("Không tìm thấy bản ghi mượn phù hợp.");
    }

    public void showBorrowedBooks() {
        System.out.println("📕 Danh sách sách đang được mượn:");
        for (LoanRecord record : records) {
            if (!record.isReturned()) {
                System.out.println(record);
            }
        }
    }

    public void showReturnedBooks() {
        System.out.println("📗 Danh sách sách đã được trả:");
        for (LoanRecord record : records) {
            if (record.isReturned()) {
                System.out.println(record);
            }
        }
    }
}