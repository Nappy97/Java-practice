package com.nappy.Chapter7.array;

public class DIYStudent {
    private int studentID;
    private String name;

    public DIYStudent(int studentID, String name){
        this.studentID = studentID;
        this.name = name;
    }
    public int getStudentID(){
        return studentID;
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public String getName(){
        return  name;
    }
    public void  setName(String name){
        this.name = name;
    }
    public void showInfo(){
        System.out.println(studentID + "," + name);
    }
}
