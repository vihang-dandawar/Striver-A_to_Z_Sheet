package StriverA2Z;

public class f01_maths {
    
     public static int  GCD(int num1,int num2)
    {
        int ans=0;
       for(int i=1;i<Math.min(num1,num2);i++)
       {
        if(num1%i==0 && num2%i==0)
        {
            ans=i;
        }
       }
        return ans;



    }


    public static boolean isArmStrong(int num)
    {
        int ans=0;
        int num2=num;
        while(num!=0)
        {
            int rem=num%10;
            num/=10;
            ans=ans+(rem*rem*rem);
        }
        if(num2==ans) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(GCD(22,10));
        System.out.println(isArmStrong(152));
    }
}
