package com.JAVAPractice.chapter7.array;
import java.util.ArrayList;
public class DIYStudentArrayList {
    public static void main(String[] args) {
        ArrayList<DIYStudent> school = new ArrayList<DIYStudent>();

        school.add(new DIYStudent(1001,"James"));
        school.add(new DIYStudent(1002, "Tomas"));
        school.add(new DIYStudent(1003, "Edward"));

        for (int i = 0; i<school.size(); i++){
            DIYStudent student = school.get(i);
            student.showInfo();
        }

        System.out.println();

        System.out.println("=== 향상된 for문 사용");
        for (DIYStudent student : school){
            student.showInfo();
        }
    }
}
