/*x, y 에 대해 다음 주석처리되어 있는 연산을 실시하여 출력하세요. 변수 사용자유, 원하는대로 구현하면됩니다.*/
package com.JAVAPractice.aloneproject;

public class calculation {
    public static void main(String[] args) {
        int x = 7;
        int y = 53;

        //덧셈
        int add = x+y;
        //나눗셈
        int div = y/x;
        //곱셈
        int mult = x*y;
        //뺄셈
        int sub = x-y;
        //나머지
        int mod = y%x;
        //부등식
        boolean inequality = (x>y);
        // 등식
        boolean equality = x == y;
        // x!=y
        //or, and
        //or
        boolean or = x<y || x>y;
        //and
        boolean and = x<y && 8*x>y;

        System.out.println(add);
        System.out.println(div);
        System.out.println(mult);
        System.out.println(sub);
        System.out.println(mod);
        System.out.println(inequality);
        System.out.println(equality);
        System.out.println(or);
        System.out.println(and);
    }
}
