import java.util.Date;

public class Books implements Comparable<Books> {

    String bookName ;
    Integer pageNumber;
    String authorName;
    Integer publicationDate;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublicationDate(Integer publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getBookName() {
        return bookName;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Integer getPublicationDate() {
        return publicationDate;
    }

    public Books(String bookName, Integer pageNumber, String authorName, Integer publicationDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    @Override
    public int compareTo(Books o) {

        return this.bookName.compareTo(o.bookName);
    }




    @Override
    public String toString() {
        return bookName + " " + pageNumber + " " + authorName + " " + publicationDate +" ";
    }
}
