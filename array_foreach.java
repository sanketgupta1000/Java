//arrays in java are first declared, and then memory is allocated for them
//an array variable is just a reference variable, as already seen

class MyArray
{
    //declaration, will happen when object of this class is created
    int arr[];

    MyArray(int n, int val)
    {
        //allocating memory for arr
        //declaration and allocation can be merged into one statement as well: int arr[] = new int[10];
        arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = val;
        }
    }

    void show()
    {
        //in java also, foreach loop exists, just like cpp
        for(int element: arr)
        {
            System.out.println(element);
            //element is just read only. Changing it does not change the actual array
            element+=1;
        }
    }
}

class Driver
{
    public static void main(String[] args)
    {
        MyArray arr = new MyArray(5, 6);
        arr.show();
        arr.show();

    }
}