package Arrays;
import java.util.*;
class TrappingraingWater{
public static int Trapping(int height[]) {
    int n= height.length-1;

//For left max boundary

int leftMax[]=new int[n];
leftMax[0]=height[0];
for(int i=0;i<n;i++){
    leftMax[i]=Math.max(height[i],leftMax[i]);

}
int rightMax[]=new int[n];
rightMax[0]=height[0];
for(int i=n-2;i>0;i--){
    rightMax[i]=Math.max(height[i],leftMax[i+1]);
}

int trappedWater=0;
//loop
for(int i=0;i<n;i++){
int waterlevel=Math.min(leftMax[i],rightMax[i]);
trappedWater+=waterlevel-height[i];

}
return trappedWater;
}
public static void main(String[] args) {
    int height[]={4,2,0,6,2,5};
    Trapping(height);
    System.out.println(Trapping(height));

}
    
}
