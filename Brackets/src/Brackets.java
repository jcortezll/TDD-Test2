public class Brackets {
    public boolean verify(String cadena){
        boolean verified=false,seguir=true;
        int cont1=0,cont2=0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(') cont1++;
            if (cadena.charAt(i) == ')') cont2++;
            if(cont2>cont1){
                seguir=false;
                verified=false;
                break;
            }
        }
        if(seguir) {
            if (cont1 == cont2) {
                verified = true;
            }
        }
        return verified;
    }
}
