import java.util.ArrayList;

public class f05_BinarySearch {

public static int LowerBound(int arr[],int key)
{

int st=0;
int end=arr.length-1;
int ans=0;
while(st<=end)
{
    int mid=(st+end)/2;
    if(mid==0) return 0;

    if(arr[mid]>=key ) // ans found at mid , so check  st to mid-1 if better ans exists 
    {
        ans=mid;
        end=mid-1;
       
    }
   
    else st=mid+1;// ans lies ahead of mid as mid value is lower
}



    return arr.length;
}


public static void ceil_Floor(int arr[],int target)
{
    int st=0;
int end=arr.length-1;
int ceil=0;
int floor=-1;
int ans=-1;
while(st<=end)
{
    int mid=(st+end)/2;
    if(arr[mid]==target){
        ceil=mid;
       floor=mid;
      System.out.println(arr[floor]+" "+ arr[ceil]);
       return;

    }
        


    if(arr[mid]>=target ) {
            ceil=mid;
         end=mid-1;
       
    }
   
    else {
        floor=mid;
        st=mid+1;// 
}
}

System.out.println(arr[floor]+" "+ arr[ceil]);
return;

}


public static int[] first_last_Occurance(int arr[],int key)
{
    int st=0;
    int end=arr.length-1;
    int ans[]={-1,-1};

    // first occurance
    while(st<=end)
{
    int mid=(st+end)/2;
    if(arr[mid]==key){
       end=mid-1;
       ans[0]=mid;
      

    }
        


     else if(arr[mid]>=key ) {
            
         end=mid-1;
         if(arr[end]==key) ans[1]=end;
       
    }
   
    else {
       
        st=mid+1;// 
        if(arr[st]==key) ans[0]=st;

}
}




// last occurance
st=0;
end=arr.length-1;

   while(st<=end)
{
    int mid=(st+end)/2;
    if(arr[mid]==key){
       st=mid+1;
       ans[1]=mid;
      

    }
        


     else if(arr[mid]>=key ) {
            
         end=mid-1;
        
       
    }
   
    else {
       
        st=mid+1;// 
      
}
}


return ans;

}





public static int find_All_Occurance(int arr[],int key)
{
    int st=0;
    int end=arr.length-1;
    int first=-1;
    int last=-1;

    // first occurance
    while(st<=end)
{
    int mid=(st+end)/2;
    if(arr[mid]==key){
       end=mid-1;
       first=mid;
      

    }
        


     else if(arr[mid]>=key ) {
            
         end=mid-1;
        
       
    }
   
    else {
       
        st=mid+1;// 
      
}
}




// last occurance
st=0;
end=arr.length-1;

   while(st<=end)
{
    int mid=(st+end)/2;
    if(arr[mid]==key){
       st=mid+1;
      last=mid;
      

    }
        


     else if(arr[mid]>=key ) {
            
         end=mid-1;
        
       
    }
   
    else {
       
        st=mid+1;// 
      
}
}


return last-first+1;

}


public static int SortedRotated(int arr[], int target)
    { 
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {


        int mid=(start+end)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
    
        //find which part is sorted
        //in SortedRotated Atleast one part is Sorted

        //check if  left is sorted
        
        if(arr[start]<=arr[mid])
        {
            if(arr[start]<=target && target<=arr[mid])// if target lies in sorted part
            {
                end=mid-1;//search in sorted left part 
            }
            else
            start=mid+1;// if not found in sorted left part search in unsorted right part

        }

        //else check for if  right is Sorted
        
            else 
            {
               if(arr[mid]<=target && target<=arr[end]) // if target lies in sorted part
               {
                start=mid+1;
               }
               end=mid-1; //if not found in sorted right part search in unsorted left part
            }
        





        
    }

    return -1;
} 



public int findMinInSortedRotated(int[] nums) {
      int st=0;
      int end=nums.length-1;
      while(st<=end)
      {
        int mid=(st+end)/2;

        if(nums[st]<=nums[end]) return nums[st];
         else if(nums[mid]>nums[end])
        {
            st=mid+1;
        }


        else 
        {
            end=mid;
        }


        

        
      }
      return nums[0];

    }





     public int findKRotation(ArrayList<Integer> nums) {
    int st=0;
    int end=nums.size()-1;
        while(st<=end)
            {
            int mid=(st+end)/2;
            if(nums.get(st)<=nums.get(end))
            {
                if(st-1<0) return 0;
                else return st-1;
            
            }
            else if(nums.get(mid)>nums.get(end))
            {
               if(nums.get(mid+1)>nums.get(mid))
               {
                   st=mid+1;
               }
                else return mid+1;
            }

            else end=mid;
            }

         return 0;
    }



    
    public int nthRoot(int n, int m) {
        if(m==1) return 1;
        if(n==0 || m==0) return 0;
         int st=1;
        int end=m;
        while(st<=end)
        {
            int mid=(st+end)/2;
            int multiply=(int) Math.pow(mid,n);
            if(multiply==m) return mid;
            else if(multiply>m) end=mid-1;
            else st=mid+1;


        }
        return -1;
    }


    public int smallestDivisor(int[] nums, int limit) {
        int max=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max) max=nums[i];
        }
       int st=1;
       int end=max;
       int candidates=max;
       while(st<=end)
       {
        int mid=(st+end)/2;
        int sum=division(mid,nums);

        if (sum>limit){
       
         st=mid+1;}

 
        else {
            candidates=Math.min(candidates,mid);
            end=mid-1;
       }
       }

       return candidates;
    }

     public int division(int mid,int nums[])
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=(int)Math.ceil((double)nums[i]/mid);
        }

        return sum;
    }
    
 
public int minEatingSpeed(int[] piles, int h) {
if(piles.length==1)
{
    
}


    int max=0;

        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]>max) max=piles[i];
        }
       int st=1;
       int end=max;
       int candidates=max;
       while(st<=end)
       {
        int mid=(st+end)/2;
        long sum=division(mid,piles);

        if (sum<=h){
            candidates=Math.min(candidates,mid);
       end=mid-1;
        }
         
         else st=mid+1;

 
        
       }

       return candidates;
    }

     public long division(int mid,int piles[])
    {
        long sum=0;
        for(int i=0;i<piles.length;i++)
        {
            sum+=(long)Math.ceil((double)piles[i]/mid);
        }

        return sum;
    }






























    public static void main(String[] args) {
        int Arr[]={3, 4, 4,7,8,10};
        //System.out.println(LowerBound(Arr,1));
      //  ceil_Floor(Arr, 4);
      int[] ans=first_last_Occurance(Arr, 4);
      System.out.println(ans[0]+" " +ans[1]);

      System.out.println("All Occurance of "+4+" are : "+find_All_Occurance(Arr, 4));

        
    }
}
 