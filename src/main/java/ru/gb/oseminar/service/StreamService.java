package OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.service;

import OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.data.Stream;
import OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.data.StreamComparator;
import OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.data.StudentGroup;

import java.util.*;

public class StreamService{
//    private Stream stream;
//
//    public void createStream(List<StudentGroup> groups){
//        this.stream = new Stream(groups, numberOfGroup);
//    }
//
//    public Stream getStream(){
//        return stream;
//    }
//
//    public Stream getSortedStream(){
//        List<Stream> streams = new ArrayList<>()
//    }
private final Map<String, Stream> streamMap;

    public StreamService() {
        this.streamMap = new HashMap<>();
    }

    public Collection<Stream> getAll(){
        return this.streamMap.values();
    }

    public void addStream(String number, List<StudentGroup> groups) {
        if (!streamMap.containsKey(number))
            streamMap.put(number, new Stream(groups, number));
    }

    public List<Stream> getSortedStream(){
        List<Stream> streams = new ArrayList<>(streamMap.values());
        streams.sort(new StreamComparator());
        return streams;
    }

    public List<StudentGroup> getStudentGroups(String streamNumber) {
        var stream = streamMap.values().stream().filter(s -> Objects.equals(s.getNumber(), streamNumber)).findFirst();
        if (stream.isPresent())
            return stream.get().getGroups();

        return new ArrayList<>();
    }
}
