public class FizzBuzz {

    public static String genera(int i) {
        if(i==5) return "Buzz";
        if(i%3==0) return "Fizz";
        return i + "";
    }
}
