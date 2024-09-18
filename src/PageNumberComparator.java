import java.util.Comparator;

public class PageNumberComparator  implements Comparator<Books> {
    @Override
    public int compare(Books o1, Books o2) {
        return Integer.compare(o1.getPageNumber(),o2.getPageNumber());
    }
}
