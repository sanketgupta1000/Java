import java.util.Scanner;

class ExceptionExample
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.println("Enter size of string buffer you want to create: ");
            //try to enter anything other than integer
            int strbufsize = scan.nextInt();
            System.out.println("Enter the string: ");
            String str = scan.next();
            //try to enter larger string than entered size
            if(str.length()>strbufsize)
            {
                throw new RuntimeException("Size too large");
            }
            StringBuffer strBuf = new StringBuffer(str);
            System.out.println("Your string buffer: "+strBuf);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            scan.close();
        }

    }
}