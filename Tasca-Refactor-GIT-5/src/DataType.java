import java.util.Arrays;
import java.util.List;

public class DataType {
    public static void main(String[] args) {
        System.out.println(DataType.gd(20));
        System.out.println(DataType.gd(702));
        System.out.println(DataType.gd(0));
    }
    public static String gd(int code){
        String tipoDato;
        if (isDate(code)) {

            tipoDato = "DATE";
        } else if (isNumeric(code)) {
            tipoDato = "NUMERIC";
        } else {
            tipoDato = "STRING";
        }
        return tipoDato;
    }

    public static boolean isDate(int code){
        List<Integer> nums = Arrays.asList(702,1082,1083,1114,1184,1266,12403);
        return nums.contains(code);
    }
    public static boolean isNumeric(int code){
        List<Integer> nums = Arrays.asList(20,21,23,24,26,700,701,790,1700,2202,2203,2204,2205,2206,3734,3769,12396);
        return nums.contains(code);
    }
}

