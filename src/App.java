public class App {
    public static void main(String[] args) throws Exception {
        //                      --BASICOS--        
        System.out.println("Hola mundo!");
        
        /* 
        int entero = 5;
        float decimalF = 5.123456f;
        double decimalD = 5.1235012309d;

        System.out.println(entero);
        System.out.println(decimalF);
        System.out.println(decimalD);

        */

        //                  --STRING--

        String texto = "Esto es una cadena de caracteres lista para imprimir.";
        String textoTrim = "    Esto es una cadena de caracteres lista para imprimir.";
        System.out.println(texto);

        int longitud = texto.length();
        System.out.println(longitud); // LONGITUD DE STRING

        char caracter = texto.charAt(9);
        System.out.println(caracter); //LETRA DEL INDICE DADO

        String subcadena = texto.substring(12, 32);
        System.out.println(subcadena); //SUBCADENA DE STRING

        String minuscula = texto.toLowerCase(); //String en minusculas
        System.out.println(minuscula);

        String mayuscula = texto.toUpperCase(); //String en mayusculas
        System.out.println(mayuscula);

        int indice = texto.indexOf("lista"); //Indice de la primera letra del string dado
        System.out.println(indice);

        String reemplazado = texto.replace("lista", "preparada"); //Subcadena reemplazada por otra
        System.out.println(reemplazado);

        boolean contiene = texto.contains("imprimir"); //Booleano que devuelve true o false si contiene o no la subcadena
        System.out.println("Tiene la palabra asignada?: " + contiene);

        String sinEspacios = textoTrim.trim(); //Devuelve el string sin espacios
        System.out.println(sinEspacios);
    }
}

