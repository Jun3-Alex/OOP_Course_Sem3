package OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.data;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    private int counter;

    private final List<StudentGroup> groups;
    public StreamIterator(Stream groups) {
        this.groups = groups.getGroups();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < groups.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            return null;
        }
        return groups.get(counter++);
    }

}
