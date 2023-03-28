//Convert the first letter of each word to uppercase
package Strings;


public class Uppercase {

    public static String toUppercase(String str){
        SrtingBuilder sb=new SrtingBuilder();
        char ch=Character.toUpperCase(str.charAt(0));
        for( ch=1;ch<str.length();ch++){
            if(str.charAt(ch)==' '){
                ch=str.charAt(ch);
                ch++;
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str="hello my name is shiva";
        System.out.println(toUppercase(str));

    }
}
