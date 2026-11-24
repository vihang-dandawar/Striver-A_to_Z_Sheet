package StriverA2Z;
import java.util.ArrayList;
public class f04_Arrays
{
    public boolean isArraySortedRotated(int arr[])
    {

        //Refer Leetcode 1752
    return true;
    }

    public static int FindMissingNumber(int arr[])
    {
        // No are between 1-n :
        // Array Size: n-1, so actual n is size + 1
        // ex: [8,2,4,5,3,7,1] o/p:6

        //Approach sum  of  first n terms:  1+2+3+....n=(n*(n-1))/2
        int n=arr.length+1;
        int currSum=0;
        int ExpectedSum=0;
        for(int x:arr)
        {
            currSum+=x;
        }

        ExpectedSum=(n*(n+1))/2;

        return ExpectedSum-currSum;
    }


    public static int LongestSubArrWithSumK(int arr[],int k)
    {
        int ans=0;
        int i=0;
        int j=0;

        int currSum=arr[0];
        while(j<arr.length-1)
        {
           
            j++;
          currSum+=arr[j];
            




             if(currSum==k)
          {
            ans=Math.max(ans,j-i+1);
           

          }
         

         

         
         
          // if currSum > k remove element from start of window
             while(currSum>k)
          {
            currSum-=arr[i];
            i++;
          }

          
        }
        


           
            

        

         return ans;
    }


    public static  void LeaderArr(int arr[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        int max=arr[arr.length-1];
        list.addFirst(max);
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>max)
            {
                list.addFirst(arr[i]);
                max=arr[i];
            }
        }

        System.out.println(list);
    }


    



    public static void main(String[] args) {
        // int Arr[]={8,2,4,5,3,7,1};
        // System.out.println(FindMissingNumber(Arr));


        // int nums[]={4,1,1,1,2,3,5};
        // System.out.println(LongestSubArrWithSumK(nums,5));


        int nums1[]={10,22,12,3,0,6};
        LeaderArr(nums1);
    }
}