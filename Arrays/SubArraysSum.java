package Arrays;

public class SubArraysSum {
int current=0;
int max=Integer.MIN_VALUE;
        public static void subArray(int number[]){
            for(int i=0;i<number.length;i++){
                int start=i;
                for(int j=i;j<number.length;j++){
                    int end=j;
                    for(int k=start;k<=end;k++){
                        number[k]+=number[start];
                        System.out.print(number[k]+"");
                    
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            int number[]={2,4,6,8,10};
            subArray(number);
        }
    }
    
