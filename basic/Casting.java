package basic;

public class Casting {
    public  static  void main(String[] args) {

        double a = 1.1;
        double b =1;
        System.out.println(b);

//        int c = 1.1;    // 실수를 정수로 넣을 수 없음
        double d = 1.1;
        int e = (int) 1.1;  // 강제로 int로 변경함으로써 .1이 없어짐
        System.out.println(e);

//    1 to String
        String f = Integer.toString(1);
        System.out.println(f.getClass());



    }
}
