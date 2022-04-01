public class Zapping {
        public static int cuantosClics(int origen, int destino){
            int res;
            if(origen==destino)
                res=0;
            else
                res=destino-origen;
            return res;
        }
}
