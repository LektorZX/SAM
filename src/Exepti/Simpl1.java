package Exepti;

public class Simpl1 {
    public static void main(String[] args) {
        String str=null;
        try {
            String str2=str.toLowerCase();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
