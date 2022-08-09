
public class QuadraticRoot{

    public static void quadraticEquation(int a, int b, int c){

        double d = b * b - 4 * a * c;
        double sqrt = Math.sqrt(d);

        double root1, root2;

        if(d > 0)
        {
            System.out.println("Roots are real and distinct if a: "+a+" ,b: "+b+" ,c: "+c);
            root1 = (-b + sqrt) / (2 * a);
            //root2 = (-b - sqrt) / (2 * a);
            System.out.format("Root is: %.0f ", root1);
        }

        else if(d == 0)
        {
            System.out.println("Roots are real and equal if a: "+a+" ,b: "+b+" ,c: "+c);
            root1 = root2 = -b / (2 * a);
            System.out.format("Root is: %.0f ", root1);
        }

        else
        {
            System.out.println("Roots are complex and distinct if a: "+a+" ,b: "+b+" ,c: "+c);
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-d) / (2 * a);
            System.out.format("Root is: %.0f+%.0fi", real, imaginary);
            //System.out.format("\nRoot 2 = %.2f-%.2fi", real, imaginary);
        }
    }

    public static void main(String[] args) 
    {
        quadraticEquation(1,2,-3);
        System.out.println("\n");
        quadraticEquation(2, -7, 3);
        System.out.println("\n");
        quadraticEquation(1, -12, -28);
        
    }
}