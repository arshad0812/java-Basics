import java.util.Vector;
import java.util.Arrays;
import java.util.Iterator;


public class Vectorr{

    public static void main(String[] args){
        Vector<Integer> vtr=new Vector<Integer>(Arrays.asList(1,2));
        vtr.add(3);
        vtr.add(4);

        //itertor
        Iterator<Integer> itr=vtr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //Accessing element
        System.out.println(vtr.get(1));

        //check element exits
        System.out.println("vtr contains 0 : "+vtr.contains(0));

        //Setting value at position
        vtr.set(1,10);
        for(Integer i:vtr)
        {
            System.out.println(i);
        }

        //Removing value at position
        vtr.remove(3);

        //Searching for value at position
        System.out.println("Index of 10 : "+vtr.indexOf(10));
        vtr.forEach(i->{
            System.out.println(i);
        });
}
}