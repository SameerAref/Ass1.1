package Ass1 ;

import java.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

/**
 *
 * @author Sameer Aref
 */
public class Ass1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Student s1 = new ItStudent(1, "ahmad", "Twf", 25, 20, 30);
        Student s2 = new ItStudent(2, "MOHD", "Twf", 30, 15, 40);

        Student s4 = new ArtStudent(4, "salah", "Twf", 12.5, 15, 35);
        Student s3 = new ArtStudent(3, "Sami", "Twf", 10, 25, 20);
        Student[] s = {s1, s2, s3, s4};

//        way 1
        List<Student> studentList = Arrays.asList(s);      
//        studentList=studentList.stream().sorted(Comparator.comparing(Student :: getGrade)).collect(Collectors.toList());
//       for(Student d:studentList){
//            System.out.println(d);}
 PrintWriter output = new PrintWriter(new File("C:\\Users\\SameerAref\\Downloads\\Documents\\sameer"));
//            for(Student d:studentList){
//           output.println(d);}
//       output.close();
      

        // way 2
       /* Student temp;
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].getGrade() < s[j].getGrade()) {
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        for (Student d : s) {
            System.out.println(d);
        }
          for(Student d:s){
            output.println(d);}
        output.close();
        */

     
    }
}