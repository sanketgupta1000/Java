//in java concept of jagged array is introduced
//a jagged array is a multi-dimensional array where every sub array of a multi-dimensional array can have different different dimensions

class JaggedArray
{
    int arr[][];

    JaggedArray(int n)
    {
        //here, I am creating n references to single dimensional arrays
        arr = new int[n][];

        //now allocating memory
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = new int[i+1];
            //assigning values
            for(int j = 0; j<arr[i].length; j++)
            {
                arr[i][j] = i+1;
            }
        }
    }

    void show()
    {
        for(int[]array:arr)
        {
            for(int element: array)
            {
                System.out.print(element);
            }
            System.err.println();
        }
    }
}

class Driver
{
    public static void main(String[] args) {
        JaggedArray ja = new JaggedArray(5);
        ja.show();
    }
}