import java.util.ArrayList;

public class Impresora {
    public static enum Estado{
        APAGADO,
        ENCEDIDO
    }
    public class ColadeImpresion{
        ArrayList<String>ColadeImpresion = new ArrayList<String>(5);

        public void push(String elemento){
            ColadeImpresion.add(0,elemento);
        }

        public String pop(){
            return ColadeImpresion.remove(0);
        }

    }

    @Override
    public String toString() {

        return toString();
    }
}
