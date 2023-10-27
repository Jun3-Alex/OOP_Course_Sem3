package OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.controller;

import OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.data.*;
import OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.service.DataService;
import OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.service.StreamService;
import OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.service.StudentGroupService;
import OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.view.UserView;

import java.time.LocalDate;
import java.util.List;

public class UserController {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView = new UserView();
    private final StreamService streamService = new StreamService();

    public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }

    public void addStream(String number, List<StudentGroup> groups){
        streamService.addStream(number, groups);
    }

    public List<Stream> getSortedStream(){
        return streamService.getSortedStream();
    }

    public List<StudentGroup> getStudentGroups(String streamNumber){
        return streamService.getStudentGroups(streamNumber);
    }
}
