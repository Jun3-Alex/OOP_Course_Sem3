package OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.data;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private List<StudentGroup> groups;
    private String number;

    public Stream(List<StudentGroup> groups, String number) {
        this.groups = groups;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }


    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Stream{\n" +
                "groups=\n" + groups +
                ", number=" + number +
                "}\n";
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }
}
