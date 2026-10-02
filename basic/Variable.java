package basic;

public class Variable {
    public static void main(String[] args) {
        System.out.println(100 * 12);
        System.out.println(100*12-300);

        int price = 100;
        int count = 12;
        int discount = 300;

        System.out.println(price * count);
        System.out.println(price * count * discount);

        int a = 1;
        a = 2;
        System.out.println(a);
        // a = "Hello"; -> 에러(정수 자리에 문자열)

        
    }
}