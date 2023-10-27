package OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.data;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        int resultOfComparing = o1.getNumber().compareTo(o2.getNumber());
        if (resultOfComparing == 0) {
            resultOfComparing = Integer.compare(o1.getGroups().size(), o2.getGroups().size());
            return resultOfComparing;
        } else {
            return resultOfComparing;
        }
    }
}


