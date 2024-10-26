import java.util.*;


public class Hset{
    public static void main(String[] args){
        Set<Integer> st=new HashSet<Integer>();
        st.add(1);
        st.add(2);
        for(Integer i:st)
        {
            System.out.println(i);
        }

        //Contains
        System.out.println(st.contains(1));

        //Removing Elements
        st.remove(1);

        Iterator<Integer> itr=st.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}