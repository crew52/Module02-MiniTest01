package service;

import entity.FictionBook;

public class ServiceFictionBook {
    public static int countCategory(FictionBook[] arr, String category) {
        int count = 0;
        for (FictionBook fictionBook : arr) {
            if (fictionBook.getCategory().equals(category)) {
                count++;
            }
        }
        return count;
    }
}
