package org.example;

import java.time.LocalDate;

public class LoanRecord {
    private User user;
    private Book book;
    private LocalDate loanDate;
    private LocalDate returnDate;

    public LoanRecord(User user, Book book, LocalDate loanDate) {
        this.user = user;
        this.book = book;
        this.loanDate = loanDate;
        this.returnDate = null;
    }

    public User getUser() { return user; }
    public Book getBook() { return book; }
    public LocalDate getLoanDate() { return loanDate; }
    public LocalDate getReturnDate() { return returnDate; }

    public void returnBook(LocalDate returnDate) {
        this.returnDate = returnDate;
        book.setAvailable(true);
    }

    public boolean isReturned() {
        return returnDate != null;
    }

    @Override
    public String toString() {
        return book.getTitle() + " | Người mượn: " + user.getName() +
                " | Ngày mượn: " + loanDate +
                (isReturned() ? " | Ngày trả: " + returnDate : " | Chưa trả");
    }
}