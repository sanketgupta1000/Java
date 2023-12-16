package access_specifiers.pkg2;

//importing class from pkg1 subpackage

// gives error
// import access_specifiers.pkg1.DefaultClass;

import access_specifiers.pkg1.PublicClass;

class Driver
{
    public static void main(String[] args)
    {
        PublicClass pc = new PublicClass();
    }
}
