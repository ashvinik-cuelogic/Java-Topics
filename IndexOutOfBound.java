class IndexOutOfBound 
{
    public static void main (String[] args)
    {
        int[]  arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        for( int i=0; i<=arr.length;  i++){
            System.out.println(arr[i]);
        }
    }
}