package Regex1.DZ;
/*Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам Java,
с помощью регулярных выражений и выводящую их на страницу.
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dz2 {
    public static void main(String[] args) {



        String alph = "алфа 0Xff виТ dfgdfg 0x8 ";
        String reg="0[xX][\\dA-Fa-f]+";
        Pattern pattern=Pattern.compile(reg);
        Matcher matcher = pattern.matcher(alph);
        while (matcher.find()){
            System.out.println(matcher.group());
        }


        }
}
