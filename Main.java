public class Main { //Hecho por Rojas Herrera Ricardo
    public static void main(String[]args){
        //length
        String s = "Hola";
        int x = s.length();//retorna: 4
        System.out.println(x);
        //isEmpty falso
        String s1 = "Hola1";
        boolean b1 = s1.isEmpty();//retorna: falso
        System.out.println(b1);
        //isEmpty verdadero
        String s2 = "";
        boolean b2 = s2.isEmpty();//retorna: verdadero
        System.out.println(b2);
        //equals
        String x1 = "Hola";
        String y2 = "Hola";
        if(x1.equals(y2)) //Compara sus contenidos, retorna true!
        {
            System.out.println("Si pasa por aqui!");
        }
        //indexOf y lastIndexOf
        String a = "Hola, como estas?";
        int p1 = a.indexOf('a');//retorna: 3
        int p2 = a.lastIndexOf('a');//retorna: 14
        System.out.println(p1);
        System.out.println(p2);
        //indexof y lastIndexOf 2
        String a1 = "Hola, cómo estas? Estas como querias?";
        int p3 = a1.indexOf("cómo");//retorna:6
        int p4 = a1.indexOf("estas");//retorna:11
        int p5 = s.lastIndexOf("como");//retorna:24
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        //upperCase
        String a2 = "Hola, como estas?";
        String may = a2.toUpperCase(); // retorna: HOLA, COMO ESTAS?
        String min = a2.toLowerCase(); // retorna : hola, como estas?
        System.out.println(may);
        System.out.println(min);
        //subString
        String a3 = "Hola, como estas?";
        String a4 = a3.substring(0,4); // retorna : Hola
        String a5 = a3.substring(6,10); // retorna : como
        String a6 = a3.substring(11); // retorna : estas?
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
        //parseInt y toString
        String a7 = "1234";
        int i = Integer.parseInt(a7); //retorna: 1234
        String a8 = Integer.toString(i); // retorna : "1234"
        System.out.println(i);
        System.out.println(a8);
        //parseInt y to String flotantes
        String a9 = "1234.56";
        double d = Double.parseDouble(a9); // retorna: 1234.56
        String a10 = Double.toString(d); // retorna: "1234.56"
        System.out.println(d);
        System.out.println(a10);
        //StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Hola, ");
        sb.append("Chau");
        System.out.println(sb);//Salida : Hola,chau
        //StringBuilder 2
        StringBuilder ab = new StringBuilder("Hola");
        ab.setCharAt(2,'X');
        System.out.println(ab); //Salida : Hoxa
    }

}
