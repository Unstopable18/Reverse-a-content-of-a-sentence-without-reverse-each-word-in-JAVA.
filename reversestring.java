import java.util.Scanner;
public class reversestring
{
    public static String reverse(String s1)
    {
        String[] words = s1.split("\\s");
        String s2 = "";
        for (int i = words.length-1; i >= 0; i--)
        {
            s2 = s2 + words[i] + " ";
        }
        return s2;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n*******************************");  
        System.out.println("Enter Default String :");
        String s1 = sc.nextLine();
        String s2 = reverse(s1); 
        System.out.println("\n\n*******************************");  
        System.out.println("Default String  : \n"+s1);
        System.out.println("\n*******************************");  
        System.out.println("Reversed String  : \n"+s2);
        System.out.println("\n*******************************");  
        sc.close();
    }
}