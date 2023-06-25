package HomeWork.Hw_003.dataFiles;

public class BookList {
    private String bookName;
    private String bookAutor;
    private Integer bookPrice;
    private Integer bookYearPublishing;
    private Integer bookPages;

    @Override
    public String toString() {
        return "BookList [bookName=" + bookName + ", bookAutor=" + bookAutor + ", bookPrice=" + bookPrice
                + ", bookYearPublishing=" + bookYearPublishing + ", bookPages=" + bookPages + "]";
    }

    public BookList(String bookName, String bookAutor, Integer bookPrice, Integer bookYearPublishing,
            Integer bookPages) {
        this.bookName = bookName;
        this.bookAutor = bookAutor;
        this.bookPrice = bookPrice;
        this.bookYearPublishing = bookYearPublishing;
        this.bookPages = bookPages;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAutor() {
        return bookAutor;
    }

    public void setBookAutor(String bookAutor) {
        this.bookAutor = bookAutor;
    }

    public Integer getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Integer bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Integer getBookYearPublishing() {
        return bookYearPublishing;
    }

    public void setBookYearPublishing(Integer bookYearPublishing) {
        this.bookYearPublishing = bookYearPublishing;
    }

    public Integer getBookPages() {
        return bookPages;
    }

    public void setBookPages(Integer bookPages) {
        this.bookPages = bookPages;
    }
}
