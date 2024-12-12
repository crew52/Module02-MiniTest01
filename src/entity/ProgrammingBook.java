package entity;

public class ProgrammingBook extends Book {
    private String language;
    private String framework;
    private static final double DISCOUNT = 0.05;

    public ProgrammingBook(String bookCode, String name, int price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
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
                "language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                ", discount=" + getDiscount() + '\'' +
                ", price=" + getPrice() + '\'' +
                '}';
    }
}
