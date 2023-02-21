public class Tarea2 {
    public static void main (String[]args){
        String s = "Karl Cientifico Suecia";
        String may = s.toUpperCase();
        String a = "Nombre:";
        String b = "Profesión:";
        String c = "Pais:";
        String s1 = may.substring(0,4);
        String s2 = may.substring(5,15);
        String s3 = may.substring(15,22);
        System.out.println(a+s1);
        System.out.println(b+s2);
        System.out.println(c+s3);

    }
}
