import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        List<Integer> resultAfterFilter = new ArrayList<>();

        Logger logger = Logger.getInstance();
        for (int i : source) {
            if (i > treshold) {
                logger.log("Элемент " + i + " проходит");
                resultAfterFilter.add(i);
            } else {
                logger.log("Элемент " + i + " не проходит");
            }
        }
        return resultAfterFilter;
    }
}
