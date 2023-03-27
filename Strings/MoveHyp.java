package Strings;

public class MoveHyp {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String s="H-el-lo-world@213";
        String s1="";

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='-'){
                s+="-";


            }
            else{
                s1+=s.charAt(i);

            }
            System.out.println(s1+s);

        }
      
    }
}
