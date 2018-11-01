package Exepti;

import static java.lang.System.out;

public class Simpl2 {
    public static void main(String[] args) throws Exi {
       // si1();
        try {
            int velue=0;
            if(velue==0)
            throw new NullPointerException ("qwert");

        }catch (NullPointerException e){
            throw new Exi(e);
        }





    }
    public static class Exi extends Exception{
        public Exi(Throwable e){
            super(e);
        }
    }






    private static void si1() {
        int[] arr={1,2,3,4};
        try{
            out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
