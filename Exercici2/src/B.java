import java.util.*;

public class B {
    public int getNumberDaysofMonth(int month){
        List<Integer> listaMeses = Arrays.asList(31,29,31,30,31,30,31,31,30,31,30,31);
        return listaMeses.get(month-1);
    }

}
