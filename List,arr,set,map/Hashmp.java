import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;


class Hashmp{
    public static void main(String[] args){
        HashMap<String,Integer> hmap=new HashMap<String,Integer>();
        hmap.put("arshad",1);

        Map<String,Integer> hmap1=new HashMap<String,Integer>(){{
            put("arshad",1);put("abi",2);
        }};


        Map<String,Integer> hmap4=new HashMap<String,Integer>()
        {{
            put("Hi",1);}{put("Hello",2);
        }};

        Map<String,Integer> hmap2=new LinkedHashMap<String,Integer>();

        Map<String,Integer> hmap3=new TreeMap<String,Integer>();


        for(Entry<String,Integer> i:hmap1.entrySet()){
            System.out.println(i.getKey());
            System.out.println(i.getValue());   
        }

        hmap.remove("arshad");
    }
}