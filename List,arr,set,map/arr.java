class arr{
    public static void main(String[] args) {

        //Array
        //Creating with data
        int[] arr11=new int[]{1,2,3};
        for(int i:arr11)
        {
            System.out.println(i);
        }

        //Intiliazing value after creation
        int[] arr12={1,2,3,4,5};

        for(int i=0;i<5;i++)
        {
            
            System.out.println(arr12[i]);
        }


        //2d Array
        System.out.println("2D Array");
        
        int arr2[][]=new int[][]{{1,2,3,},{4,5,6},{7,8,9}};

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }






    }
}
