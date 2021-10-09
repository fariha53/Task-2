/*
name: Fariha Chowdhury
ID: 2012020053
Section: B
Email: cse_2012020053@lus.ac.bd
Date: 08/08/2021
*/
package fariha;
public class Student{
    String name;
    int id;
    static String universityName = "Leading University";

    Student(){
        this.name = "Fariha Chowdhury";
        this.id = 53;
        System.out.println(name+"'s ID is "+id);
    }

    Student(String name, int id){
        this.name = name;
        this.id = id;
        System.out.println(this.name+"'s ID is "+this.id);
    }

    Student(String name){
        System.out.println("Student name: " +name);
    }
    void display(){
        System.out.println("University name:"+universityName);
    }
}
