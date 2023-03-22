public class Duplicate {
  public static void main(String[] args) {
    String s[]={"aman","divij","param","param"};
boolean flag=true;
    for(int i=0;i<s.length;i++){
        for(int j=i+1;j<s.length;j++){
            if(s[i]==s[j]){
                System.out.print("Elements found!");
                flag =true;
            }
            if(flag==false)
            {
                System.out.print("Not found a similar element!");
            }
        }
    }
  }
}

