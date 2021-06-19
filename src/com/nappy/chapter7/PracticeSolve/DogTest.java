package com.nappy.chapter7.PracticeSolve;

public class DogTest {
    public static void main(String[] args) {
        Dog [] dogArray1 = new Dog[5];

            for (int i =0; i<dogArray1.length;i++){
                dogArray1[i] = new Dog();
            }


            dogArray1[0].setName("철수");
        dogArray1[0].setType("치와와");
        dogArray1[1].setName("영희");
        dogArray1[1].setType("허스키");
        dogArray1[2].setName("마루");
        dogArray1[2].setType("불독");
        dogArray1[3].setName("마룽");
        dogArray1[3].setType("요크셔테리어");
        dogArray1[4].setName("김씨");
        dogArray1[4].setType("도베르만");

            for(int i = 0; i< dogArray1.length; i++){
                System.out.println(dogArray1[i].showDogInfo());

        }
        System.out.println();

        System.out.println("====향상된 for문 사용=====");
        for(Dog dog : dogArray1){
            System.out.println(dog.showDogInfo());
        }
    }
}
