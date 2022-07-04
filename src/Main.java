import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        int[] A = {3,5,1};
        // write your code in Java SE 8
        int number = 0;
        for(int i = 0; i < A.length; i++){
            number += A[i]*17*(Math.pow(10,i));
            System.out.println(10^i);
        }
        System.out.println(number);
        String[] digits = String.valueOf(number).split("");
        System.out.println(digits);
        int result = 0;
        for(String digit: digits){
            result += Integer.parseInt(digit);
        }
        System.out.println("result = "+ result);

        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");




        final String  x="a";
        Runnable r = () -> System.out.println(x);
        //x="b";
        r.run();
        //String s = "Hello, World!";
        //s = s.replaceAll("(.{0,2}?),","Q,");
        //s = s.replaceAll("lo\\,","Q,");
        //System.out.println(s);
        //int[] A = {1, 3, 6, 4, 1, 2};


        /*System.out.println(solution2(null));
        System.out.println("FooBar123! " + solution2("FooBar123!"));
        System.out.println(solution2("foobar123!"));
        System.out.println(solution2("FooBar123"));
        System.out.println(solution2("F0bar! F0bar!"));
        System.out.println(solution2("Fo0"));*/

        int[] arr = {1,2,1};
        System.out.println(solution3(arr));


        //System.out.println(solution("Wed",2));
        //System.out.println(solution("Sat",23));
    }

    public static boolean solution3(int[] A) {
        // write your code in Java SE 11
        Map<Integer, Long> digitCounter = Arrays.stream(A).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(Long values : digitCounter.values()){
            if(values%2 == 1)
                return false;
        }
        return true;
    }
    public static boolean solution2(String S) {
        // write your code in Java SE 11
        if(S == null)
            return false;
        String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_])(?=\\S+$).{6,}$";
        return S.matches(passwordPattern);
    }
    public static String solution(String S, int K) {
        // write your code in Java SE 8
        Map<String, Integer> map = Map.of("Mon",0, "Tue", 1,"Wed",2,"Thu",3,"Fri",4,"Sat",5,"Sun",6);
        String[] days = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        Collection<Integer> lis = map.values();

        return days[(map.get(S)+(K%7))%7];
    }

    /*public static int solution(int[] A) {
        Set<Integer> map = Arrays.stream(A).boxed().collect(Collectors.toSet());
        int res = A.length;
        for(int i = 1; i < A.length;i++){
            if(!map.contains(i))
                return i;
        }
        // write your code in Java SE 11
        return res;
    }*/
}
