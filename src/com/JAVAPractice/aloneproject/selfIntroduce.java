//그의 나이는 '20'세입니다.
//그의 키는 '180.15'cm 입니다.
//그는 집이 '없습'니다.
//그는 차가 '있습'니다.
//그의 총 자산은 '2290000000' 원입니다.
//그를 대표하는 이니셜 문자는 'S' 입니다.
//그가 입에 달고사는 말은 '안돼요 싫어요 이러지마세요' 입니다.
//다음을 알맞는 변수에 할당하여 출력하세요

package com.JAVAPractice.aloneproject;

public class selfIntroduce {
    int age;
    double tall;
    boolean home;
    boolean car;
    long assets;
    String signature;
    String usualComment;

    public int getAge() {
        return age;
    }

    public double getTall() {
        return tall;
    }

    public boolean isHome() {
        return home;
    }

    public boolean isCar() {
        return car;
    }

    public String getSignature() {
        return signature;
    }

    public String getUsualComment() {
        return usualComment;
    }

    public static void main(String[] args) {
        selfIntroduce man1 = new selfIntroduce();
        man1.age = 20;
        man1.tall = 180.15;
        man1.home = false;
        man1.car = true;
        man1.assets = 2290000000L;
        man1.usualComment = "안돼요 싫어요 이러지마세요";

        System.out.println("그의 나이는 " + man1.age + "이며, 그의 키는 " + man1.tall + "cm이며, 그는 집은" + man1.home + "차는 " + man1.car + "입니다. 그의 자산은 " + man1.assets + "이며, 자주 하는말은 " + man1.usualComment + "입니다");
    }
}
