public class Brackets {
    public boolean verify(String cadena){
        boolean verified=false;
        if(cadena.equals("")||cadena.equals("()")) {
            verified=true;
        }else if(cadena.charAt(0)=='(' && cadena.charAt(cadena.length()-1)==')'){
            verified=true;
        }
        return verified;
    }
}
