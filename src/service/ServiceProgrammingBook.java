package service;

import entity.FictionBook;
import entity.ProgrammingBook;

public class ServiceProgrammingBook {
    public static int countLanguage(ProgrammingBook[] arr, String language) {
        int count = 0;
        for (ProgrammingBook programmingBook : arr) {
            if (programmingBook.getLanguage().equals(language)) {
                count++;
            }
        }
        return count;
    }
}
