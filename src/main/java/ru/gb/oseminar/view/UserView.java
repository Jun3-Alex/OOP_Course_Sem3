package OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.view;

import OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.data.Student;
import OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.data.StudentGroup;
import OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.data.User;

import java.util.List;
import java.util.logging.Logger;

public class UserView {

    Logger logger = Logger.getLogger(UserView.class.getName());

    public void sendOnConsole(List<User> userList){
        for(User user: userList){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

    public void sendOnConsoleListStudent(List<Student> students){
        logger.info(students.toString());
    }

}
