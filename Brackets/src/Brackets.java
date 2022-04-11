public class Brackets {
    public boolean verify(String cadena){
        boolean verified=false;
        if(cadena.equals("")||cadena.equals("()")) {
            verified = true;
        }
        return verified;
    }
}
