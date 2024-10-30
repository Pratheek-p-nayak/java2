package rest1.java2.pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student/getAll")
    public List<StudentModel> getStudents() throws FileNotFoundException {
        File f1 = new File("C:\\coding\\java2\\students.txt");
        Scanner sc1 = new Scanner(f1);
        List<StudentModel> list1 = new ArrayList<>();
        while (sc1.hasNext()) {
            var line1 = sc1.nextLine();
            var arr1 = line1.split(",");
            var name = arr1[0];
            var course = arr1[1];
            var college = arr1[2];
            StudentModel student = new StudentModel();
            student.setName(name);
            student.setCourse(course);
            student.setCollege(college);
            list1.add(student);
        }
        return list1;
    }

}
