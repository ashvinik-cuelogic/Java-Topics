class Array
{
    public static void main (String[] args)
    {
        // int[] arr_no;
        // arr_no = new int[]{11,12,13,14,15};

        int[] arr_no = new int[]{1,2,3,4,5};


        // arr_no[0] = 11;
        // arr_no[1] = 12;
        // arr_no[2] = 13;
        // arr_no[3] = 14;
        // arr_no[4] = 15;

        for(int i=0; i< arr_no.length; i++){
            System.out.println("Number "+ i + " --- " + arr_no[i]);
        }
    }
}