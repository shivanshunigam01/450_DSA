package Arrays;

public class Rearrange_array {
    public static void rearrange(long arr[], int n){
        
        // Your code here
        int lastidx=n-1;
    	int firstidx=0;
    	long maxi=arr[n-1]+1; //7
    	for(int i=0;i<n;i++)
    	{
    	    if(i%2==0) //even
    	    {
    	        arr[i]+=(arr[lastidx]%maxi)*maxi;
    	       
    	        lastidx--; //43 
    	    }
    	    else //odd
    	    {
    	    arr[i]+=(arr[firstidx]%maxi)*maxi;
    	        firstidx++;
    	    }
    	}
    	for(int i=0;i<n;i++)
    	arr[i]/=maxi;
        
    }

    
    
    }
    



