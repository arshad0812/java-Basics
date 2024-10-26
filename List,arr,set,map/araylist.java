import java.util.*;

public class araylist{

    public static void main(String[] args){
        
        //With Value at intialization
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3));
        arr.add(4);
        arr.add(5);
        arr.add(0, 0);

        //Inserting Value after intialization
        ArrayList<Integer> brr=new ArrayList<Integer>();
        brr.add(1);

        

        //itertor
        Iterator<Integer> itr=arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //Accessing element
        System.out.println(arr.get(1));

        //check element exits
        System.out.println("Arr contains 0 : "+arr.contains(0));

        //Setting value at position
        arr.set(1,10);
        for(Integer i:arr)
        {
            System.out.println(i);
        }

        //Removing value at position
        arr.remove(3);

        //Searching for value at position
        System.out.println("Index of 10 : "+arr.indexOf(10));

        arr.forEach(i->{
            System.out.println(i);
        });
    }
}