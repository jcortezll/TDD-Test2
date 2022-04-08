public class Zapping {
        public static int cuantosClics(int origen, int destino){
            int res,cont1=0,cont2=0;
            if(origen==destino)
                res=0;
            else {
                for (int i = origen; i != destino; i++) {
                    if (i == 99) i = 0;
                    cont1++;
                }
                for (int i = origen; i != destino; i--) {
                    if(i==1) i=100;
                    cont2++;
                }
                System.out.println(cont1 + " " + cont2);
                res = Math.min(cont1, cont2);
            }
            return res;
        }
}
