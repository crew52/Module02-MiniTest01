package entity;

public class FictionBook extends Book {
    private String category;
    private static final double DISCOUNT = 0.07;

    public FictionBook(String bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public FictionBook(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getDiscount(){
        return super.getPrice() *  DISCOUNT ;
    }

    @Override
    public double getPrice() {
        return super.getPrice() - this.getDiscount();
    }

    @Override
    public String toString() {
        return super.toString() +
                "category='" + category + '\'' +
                ", discount=" + getDiscount() + '\'' +
                ", price=" + getPrice() + '\'' +
                '}';
    }
}
