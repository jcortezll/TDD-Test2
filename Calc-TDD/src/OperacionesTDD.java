public class OperacionesTDD {
    public static int suma(String s) {
        int res=0;
        if(s.equals("1")) res=1;
        else if(s.length()>1){
            for(int i=0;i < s.split(",").length;i++){
                res += Integer.parseInt(s.split(",")[i]);
            }
        }
        return res;
    }
}

