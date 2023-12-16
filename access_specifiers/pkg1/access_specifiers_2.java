package access_specifiers.pkg1;

//no need of import in same package

class Driver
{
    public static void main(String[] args)
    {
        //both visible to same package
        DefaultClass dc = new DefaultClass();
        PublicClass pc = new PublicClass();
    }
}
