
public class PerfectNumber {
    
    public static void checkPerfect(int n)
    {
        System.out.println("Number "+n+" is perfect? ");
        if(n==1)
        {
            System.out.println("false");
        }

        int sum = 1;
        for(int i=2; i<n; i++)
        {
            if(n % i == 0)
            {
                sum+=i;
            }
        }

        if(sum == n)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }

    public static void main(String[] args) 
    {
        checkPerfect(6);
        System.out.println("\n");
        checkPerfect(28);
        System.out.println("\n");
        checkPerfect(496);
        System.out.println("\n");
        checkPerfect(12);
        System.out.println("\n");
        checkPerfect(97);
        
    }
}
