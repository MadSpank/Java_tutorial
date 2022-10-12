import java.util.*;

public class Main {
    public static int getSum(int ... nums) {
        int sum = 0;
        for (int x: nums) {
            sum += x;
        }
        return sum;
    }

    static List<Object> getRandomList() {
        String name = "Dimas";
        int age = 27;
        return Arrays.asList(name, age);
    }

    static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            int result = num * factorial(num - 1);
            return result;
        }
    }

    public static void print(String val) {
        System.out.println(val);
    }

    public static void main(String[] args) {
//        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
//        System.out.println("Parsing tuple of elements: " + getSum(1,2,3,4,5,6));
//        System.out.println("Parsing Array[]: " + getSum(arr1)); */
//        List<Object> randList = getRandomList();
//        System.out.println(randList);
        print("Factorial of 6 = " + factorial(6));
    }
}