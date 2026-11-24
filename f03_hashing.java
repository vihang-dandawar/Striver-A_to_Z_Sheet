package StriverA2Z;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class f03_hashing
{

    public static void Hashing(int arr[],int X[])
    {
        int max=0;
        for(int x:X)
        {
            if(x>max) max=x;
        }

        int frequencyArr[]=new int[max+1];
        for(int i=0;i<X.length;i++)
        {
            
            frequencyArr[X[i]]++;
        }

       for(int x:frequencyArr)
       {
        System.out.print(x+" ");
       }

       
    }



    public static void charHashing(String str)
    {
         int []FreqArr=new int[26];
         for(int i=0;i<str.length();i++)
         {
            char ch=str.charAt(i);
            FreqArr[ch-'a']++;
         }
         for(int i=0;i<FreqArr.length;i++)
         {
            System.out.println((char)(i+'a')+"-> "+FreqArr[i]);
         }
        }

         public static void HighestLowestFrequency(int arr[])
         {
            HashMap<Integer,Integer> map=new HashMap<>();
            int value=0;
            for(int i=0;i<arr.length;i++)
            {
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            }
             int max=Collections.max(map.values());
             int min=Collections.min(map.values());
             int maxkey=0;
             int minKey=0;
             
             for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
        if (entry.getValue().equals(max)) {
            maxkey=entry.getKey();

        }

        if (entry.getValue().equals(min)) {
            minKey=entry.getKey();
            
        }
    }

    System.out.println("Highest frequency Element "+maxkey+" Frequency:"+max);
    System.out.println("Lowest frequency Element "+minKey+" Frequency:"+min);
   

         }
    
    public static void main(String[] args) {
        int arr[]={2,1,3,2,1,3,6,7,6};
      
        int QueryArr[]={2,7,8,4,6,7,1,3,7,8};// these no will be checked for frequncies in above arr
       // Hashing(arr,QueryArr);
        char ch='b';
        //System.out.println((int)ch-'a');
        charHashing("abacdabbey");
        HighestLowestFrequency(QueryArr);


       
    }
}