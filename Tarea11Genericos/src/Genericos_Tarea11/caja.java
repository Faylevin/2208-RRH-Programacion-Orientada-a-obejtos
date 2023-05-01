package Genericos_Tarea11;

import java.util.Arrays;

public class caja<T> {
    public static final int CAPACIDAD = 10;
    private T[] content;

    public caja(){

    }

    public caja(T[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "caja{" +
                "content=" + Arrays.toString(content) +
                '}';
    }

    public void add(int pos, T objeto){
        content[pos] = objeto;
    }

    public T get(int pos){
        return content[pos];
    }
}



