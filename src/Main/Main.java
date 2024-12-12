package Main;

import entity.FictionBook;
import entity.ProgrammingBook;
import service.ServiceBook;
import service.ServiceFictionBook;
import service.ServiceProgrammingBook;

public class Main {
    public static void main(String[] args) {
        ProgrammingBook pb01= new ProgrammingBook("PB01","PB001", 200, "Dung", "Java", "A");
        ProgrammingBook pb02= new ProgrammingBook("PB02","PB001", 300, "Dung", "Vietnam", "B");
        ProgrammingBook pb03= new ProgrammingBook("PB03","PB001", 100, "Dung", "Java", "C");

        FictionBook fb01 = new FictionBook("FP01", "F001", 150, "Son", "History");
        FictionBook fb02 = new FictionBook("FP02", "F002", 100, "Son", "Viễn tưởng 1");
        FictionBook fb03 = new FictionBook("FP01", "F003", 200, "Son", "Horror");

        System.out.println("Total Amount: " + ServiceBook.totalAmount(pb01, pb02, pb03, fb01, fb02, fb03));

        ProgrammingBook[] arrPB = {pb01, pb02, pb03};
        System.out.println("Count Language: " + ServiceProgrammingBook.countLanguage(arrPB, "Java"));

        FictionBook[] arrFb = {fb01,fb02,fb03};
        System.out.println("Count Category: " + ServiceFictionBook.countCategory(arrFb, "Viễn tưởng 1"));

        System.out.println("CountBooks By Price: " + ServiceBook.countBooksByPrice(arrFb, 93));
    }
}
