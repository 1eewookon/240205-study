package com.ohgiraffers.test;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 메소드의 호출 흐름을 연습해보자 */
        System.out.println("main 프로그램이 시작됩니다...");

        Application01 app1 = new Application01();
        app1.testMethod1();

        System.out.println("main 프로그램이 모든 작업을 종료 후 없어집니다...");

    }

    public void testMethod1() {

        System.out.println("안녕 나는 testMethod1 이야 불렀니?");

        testMethod2();

        System.out.println("나는 내 용무를 마쳤으니 돌아가볼게");

    }

    public void testMethod2() {         //  void 실행 후 그냥 돌아감

        System.out.println("하이 나는 testMethod2 야 불렀니?");

//        System.out.println(testMethod3());    값 자체를 출력문에 넣어서 출력을 한 상태
        String hi = testMethod3();
//        System.out.println("hi = " + hi);     값을 변수 공간에 담아서 출력을 한 상태

        System.out.println("나도 용무 마쳤으니 돌아가볼게~~~~~");

//        return; 생략됨
    }

    public String testMethod3() {       // 자료형 가지고 돌아감


        return "안녕 불렀어?";
    }

}
