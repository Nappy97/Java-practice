package com.JAVAPractice.chapter8.polymorphism;

import java.util.ArrayList;

class Animal1 {

    public void move() {
        System.out.println("동물이 움직인다.");
    }
}

class Human1 extends Animal1 {
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다");
    }
}

class Tiger1 extends Animal1 {
    public void move() {
        System.out.println("호랑이가 네발로 뛰어온다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle1 extends Animal1 {
    public void move() {
        System.out.println("독수리가 날아온다.");
    }

    public void flying() {
        System.out.println("하을늘 날아올라갑니다.");
    }
}


public class AnimalTest {
    ArrayList<Animal1> aniList = new ArrayList<Animal1>();

    public static void main(String[] args) {
        AnimalTest atest = new AnimalTest();
        atest.addAnimal();
        System.out.println("원래 형으로 다운 캐스팅");
        atest.testCasting();
    }

    public void addAnimal() {
        aniList.add(new Human1());
        aniList.add(new Tiger1());
        aniList.add(new Eagle1());

        for(Animal1 ani : aniList){
            ani.move();
        }
    }

    public void testCasting(){
        for(int i = 0;  i < aniList.size(); i++){
            Animal1 ani = aniList.get(i);
            if(ani instanceof Human1){
                Human1 h = (Human1) ani;
                h.readBook();
            }

            else if(ani instanceof Tiger1){
                Tiger1 t = (Tiger1)  ani;
                t.hunting();
            }

            else if (ani instanceof Eagle1){
                Eagle1 e = (Eagle1)  ani;
                e.flying();
            }

            else {
                System.out.println(" 지원되지 않는 형입니다");
            }
        }
    }
}