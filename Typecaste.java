public class Typecaste{
    public static void main(String[] args) {
        //int to float
        int a=10;
        float b=a;
        System.out.println(b);

        //float into int
        double fval=3.12;
        int val2=(int)fval;
        System.out.println(val2);




        //int to str
        int number=123;
        String val=Integer.toString(number);
        
        //str to int
        String wrd="123";
        int val1=Integer.parseInt(wrd);
        System.out.println(val+" "+val1);
    }
}