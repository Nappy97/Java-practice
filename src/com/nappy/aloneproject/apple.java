/*사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드. 만일 사과의 수가 123 개 이고 하나의 바구니에는 10 개의 사과를 담을 수 있다면, 13 개의 바구니가 필요할 것.
        ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ표시된 부분에 알맞은 코드를 넣으세요. 삼항연산자*/
package com.nappy.aloneproject;

public class apple {
    public static void main(String[] args) {
        int numOfApples = 123;
        int sizeOfBucket = 10;
        int numOfBucket = (int) Math.ceil((double) numOfApples / sizeOfBucket);
//double을 사용하면 무조건 실수형태로 소숫점형태로 나오게된다. 하지만 앞에 인트형과 math.ceil(소숫점자리올림기능)으로 올림처리가된다.//
        System.out.println("필요한 바구니의 수 : " + numOfBucket);
    }
}
