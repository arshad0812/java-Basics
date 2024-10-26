import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class function {    


    static int function1(int num){
        return num+1;
    } 

    static int[] function2(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
        return arr;
    }

    static ArrayList<Integer> function3(ArrayList<Integer> arr){
        arr.add(4);
        return arr; 
    }

    static Map<String,Integer>function4(Map<String,Integer> hmap){
        hmap.put("aashish", 3);
        return hmap;
    }



    public static void main(String args[]){

        int num=5;
        num=function1(num);
        System.out.println("The value of num is: "+num);

        int arr[]={1,2,3};
        arr=function2(arr);
        for(int i:arr){
            System.out.println(i+" ");
        }

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
        list=function3(list);
        System.out.println("The new array list is: "+list);

        Map<String,Integer> hmap=new HashMap<String,Integer>(){{put("arshad",1);put("abi",2);}};
        hmap=function4(hmap);
        for(Entry<String,Integer> i:hmap.entrySet())
        {
            System.out.println(i.getKey()+" "+i.getValue());
        }

 
    }
}
