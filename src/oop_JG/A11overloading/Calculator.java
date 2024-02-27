package oop_JG.A11overloading;

public class Calculator {

    /*
     # 오버로딩 (중복): 하나의 클래스 내부에서 같은 이름을 가진 메서드나
      생성자를 여러 개 중복해서 선언할 수 있게 해주는 문법.

     - 오버로딩 적용 조건:
     1. 매개 변수의 데이터 타입이 다를 것! or
     2. 매개 변수의 전달 순서가 다를 것! or
     3. 매개 변수의 개수가 다를 것.
     */

    void inputData(){}
    //void inputDaya() {} //구분 안됨 : 메소드 중복은 가능한데 이렇게는 안됨(위 조건)
    void inputData(int a){} //구분됨

    void inputData(int a, int b){}
    //void inputData(int b, int a){} //둘 다 정수 받아서 구분 X : c.inputData(20,30);
    //int int 구분 不可

    void inputData(String s){}//type이 문자열이라 가능
    void inputData(int a, double d){}//type 가능
    void inputData(double d, int a){}//순서가 달라 가능
    //void inputData(int number){} //안됨 결국 int 값 입력 받음


    //요것과 //void inputData(int a){}와 구분XXXX
    //int inputData(int number){ //리턴 타입 다르다고 구분(영향)x
    //매개변수가 달라야 중복허용
    // 반환유형(return type)은 오버로딩에 영향 미치지 않음
    //return 0;




    int calcRectArea(int r) {
        return r * r;
    }

    int calcRectArea(int width, int height) {
        return width * height;
    }

    double calcRectArea(int ceil, int floor, int height) {
        return (ceil + floor) * height / 2.0;
    }




    //내가 작성
    /*
        static int Calculator(int a){ //@@static, void 붙이는거 차이?
            int total = 0;
            return total = a*a;
        }

        static int Calculator(int a, int b){
            int total = 0;
            return total = a*b;
        }

        double Calculator(int a, int b, int c){
            int total = 0;
            return total = (a+b)*c/2.0; //소숫점 나올 수도 있음
        }

     */
    }

