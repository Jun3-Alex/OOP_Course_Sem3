package OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.service;

import OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.data.Student;
import OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.data.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataService {

    private List<User> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public List<User> getAll(){
        return this.users;
    }

    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (User user: this.users){
            if(user instanceof Student){
                if (((Student) user).getStudentId() > countMaxId){
                    countMaxId = ((Student) user).getStudentId();
                }
            }
        }
        countMaxId++;

        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        this.users.add(student);
    }
}
