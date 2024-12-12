package service;

import entity.Book;

public class ServiceBook {
    public static double totalAmount(Book ... books) {
        double sum = 0;
        for (Book book : books) {
            sum += book.getPrice();
        }
        return sum;
    }

    public static int countBooksByPrice(Book[] books, int price) {
        int count = 0;
        for (Book book : books) {
            if (book.getPrice() < price) {
                count++;
            }
        }
        return count;
    }
}
