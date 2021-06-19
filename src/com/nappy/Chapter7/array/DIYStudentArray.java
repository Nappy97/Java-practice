package com.nappy.Chapter7.array;

public class DIYStudentArray {
    public static void main(String[] args) {
        DIYStudent[] school = new DIYStudent[3];

        school[0] = new DIYStudent(1001, "James");
        school[1] = new DIYStudent(1002, "Tomas");
        school[2] = new DIYStudent(1003, "Edward");

        for (int i=0; i< school.length; i++){
            school[i].showInfo();
        }
    }
}
