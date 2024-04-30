public class metodosString {

    public static void main(String[] args) {
        String texto_1 = "texto1x";
        String texto_2 = "texto1";

        // lengh
        System.out.println("lengh: " + texto_1.length());

        // IndexOf
        System.out.println("IndexOf: " + texto_1.indexOf("x"));
        
        // lastIndexOf
        System.out.println("lastIndexOf: " + texto_1.lastIndexOf("x"));
        
        // substring
        System.out.println("substring: " + texto_1.substring(1,3));
        
        // toLowerCase
        System.out.println("toLowerCase: " + texto_1.toLowerCase());
        
        // toUpperCase
        System.out.println("toUpperCase: " + texto_1.toUpperCase());

        // charAt
        System.out.println("charAt: " + texto_1.charAt(2));
        
        // equals
        System.out.println("equals: " + texto_1.equals(texto_2));
        System.out.println("equalsIgnoreCase: " + texto_1.equalsIgnoreCase(texto_2));
        
        // valueOf
        
    }
}