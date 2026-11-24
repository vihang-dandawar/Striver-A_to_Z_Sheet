package StriverA2Z;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class f02_Recursion {
    
static String digits[]={"zero ","one ","two "};

 public static void PrintInc(int n)
 {
    if(n==1)
    {
        System.out.println(n+" ");
        return;
    }
    PrintInc(n-1);
    System.out.println(n+" ");
 }


 public static int  Factorial(int n)
 {
    if(n==0)//base case
    {
        return 1;
    }
    return  n*Factorial(n-1);
  
   
 }

 public static int fibonacci(int n)
 {
    if(n==0 || n==1)
    {
        return n;
    }
   int a= fibonacci(n-1);
   int b=fibonacci(n-2);
   return a+b;
 } 

static boolean isSorted(int arr[],int i)
{
    if(i==arr.length-1)
    {
        return true;
    }

    if(arr[i]>arr[i+1])
    {
        return false;
    }
     return isSorted(arr,i+1);
}

public static int firstOccurence(int A[],int no,int i)
{
    if(i==A.length-1)
    { 
        return -1;
    }
    if(no==A[i])
    {
        return  i;
    }
    return firstOccurence(A, no, i+1);

}

public static int power(int n,int a)
{
    if(a==0)
    {
        return 1;

    }
    return n*power(n, a-1);
}

public static void findAllOccurrences(int[] arr, int key, int index) {
    if (index >= arr.length) {
        return; // Base case: reached end of array
    }
    if (arr[index] == key) {
        System.out.println("Key " + key + " found at index " + index);
    }
    findAllOccurrences(arr, key, index + 1); // Recursive call for next index
}

public static int OptimizedPower(int n,int a)
{
   
        if(a==0)
        {
            return 1;
        }

        if(a%2==0)
        {
            return OptimizedPower(n,a/2)*OptimizedPower(n,a/2); 
        }
        else{
           return  OptimizedPower(n,a/2)*OptimizedPower(n,a/2)*n;
        }
    
    
}

public static void RemoveDuplicates(String str,int CurrIdx,StringBuilder NewStr,boolean map[])
{
    if(CurrIdx==str.length())//string is completely traversed
    {
        System.out.println(NewStr);
        return;
    }

    char CurrChar=str.charAt(CurrIdx);
    if(map[CurrChar-'a']==true)
    {
        RemoveDuplicates(str, CurrIdx+1, NewStr, map);//char already present
    }
    else{
        //if its a new char first make map ==true
        map[CurrChar-'a']=true;
        RemoveDuplicates(str, CurrIdx+1, NewStr.append(CurrChar), map);
    }
 
}
public static void BinaryString(int n, int LP, String str) {
    // Base case: If no more characters to add
    if (n == 0) {
        System.out.println(str);
        return;
    }

    // Add '0' to the string and recurse
    BinaryString(n - 1, 0, str + "0");//everytime even if  last place is 0/1 add 0

    // If the last placed character was '0', also add '1' and recurse
    if (LP == 0) {
        BinaryString(n - 1, 1, str + "1");//if LP==0 add 0 make LP=1 go to above 
    }
}

public static int SumOFNumbers(int n)
{
    if(n==1)
    {
        return 1;

    }
    return (n+SumOFNumbers(n-1));
}

public static void No_inWords(int n)
{
    String str="";
int digit=n%10;
No_inWords(n/10);
System.out.println(str+digits[digit]);



}


 public static void removeMidddleFromStack( Stack<Integer> stack,int k)
{
    if(k==1)
    {
        stack.pop();
        return;
    }
    int last=stack.peek();
    stack.pop();
    removeMidddleFromStack(stack, k-1);
    stack.push(last);
}



public  static  void print10(int n)
{
    if(n==11) return;
     System.out.println(n);
    print10(n+1);
    
}



public static void reverse(ArrayList<Integer> list)
{
 if (list == null || list.size() <= 1) {
            return; 
        }
int num=list.removeFirst();
reverse(list);
list.add(num);
}



public static boolean ispalindrome(String str)
{
    int st=0;
    int end=str.length()-1;
    return Helper(str,st,end);
}

public static boolean Helper(String str,int st,int end)
{
    if(str.charAt(st)!=str.charAt(end)) return false;
    if(st>=end) return true;
     return Helper(str,st+1,end-1);
}
    





// Usage example:
public static void main(String[] args) {
    PrintInc(10); 
    // print10(2);
    int[] myArray = { 2, 0, 3, 7, 6, 11, 1, 2 };
    int keyToSearch = 2;
   // System.out.println("Occurrences of " + keyToSearch + ":");
    //findAllOccurrences(myArray, keyToSearch, 0);
   //System.out.println(power(5,3));
  // System.out.println(OptimizedPower(2,5));
// String str="aabbcccdeefg";
//   RemoveDuplicates(str, 0, new StringBuilder(), new boolean[26]);
String str="";
 // BinaryString(3, 0, str);

 //System.out.println(SumOFNumbers(6));

 //No_inWords(012);



 //System.out.println(Factorial(4));


 Stack<Integer> s=new Stack<>();
 s.push(1);
  s.push(2);
   s.push(3);
    s.push(4);
     s.push(5);
     removeMidddleFromStack(s, 3);
     //System.out.println(s);

 ArrayList<Integer>  list=new ArrayList<>(List.of(5,4,3,2,1));
 reverse(list);
 System.out.println(list);

 System.out.println(ispalindrome("abbaba"));
    
 
}

 
}
