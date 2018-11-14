package Regex1.DZ.DZ2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parse {
    private static List<String> list;//весь список


    static {
        try {
            list = IOStream.Input();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void q() {//считать данные (
        StringBuffer[] stringBuffer = new StringBuffer[4];
        for (int i = 0; i < 3; ) {
            if (i == 0)
                stringBuffer[i] = new StringBuffer();
            for (String s : list) {
                stringBuffer[i].append(s + "\n");
                if (s.contains("Конец")) {
                    if (i == 3) {
                        break;
                    }
                    i++;
                    stringBuffer[i] = new StringBuffer();
                }
            }
        }
        //есть 4 дня
     //   List<StringBuffer> stringBuffers = Arrays.asList(stringBuffer[0]);
        StringBuffer stringBuffer1 = new StringBuffer();
        String reg = "(\\d{2}\\:\\d{2}\\ )(\\D*)(\\d{2}\\:\\d{2}\\ )(\\D*)(\\d{2}\\:\\d{2}\\ )(\\D*)(\\d{2}\\:\\d{2}\\ )" +
                "(\\D*)(\\d{2}\\:\\d{2}\\ )(\\D*)(\\d{2}\\:\\d{2}\\ )(\\D*)(\\d{2}\\:\\d{2}\\ )(\\D*)(\\d{2}\\:\\d{2}\\ )" +
                "(\\D*)(\\d{2}\\:\\d{2}\\ )(\\D*)(\\d{2}\\:\\d{2}\\ )(\\D*)(\\d{2}\\:\\d{2}\\ )(\\D*)(\\d{2}\\:\\d{2}\\ )" +
                "(\\D*)";
        Pattern compile1 = Pattern.compile(reg);
        List<String>str=new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Matcher matcher1 = compile1.matcher(stringBuffer[i]);
            while (matcher1.find()) {//пока есть что искать
                matcher1.appendReplacement(stringBuffer1, "$1- $3 $2$3- $5 $4$5- $7 $6" +
                        "$7- $9 $8$9- $11 $10$11- $13 $12$13- $15 $14$15- $17 $16$17- $19 $18$19-" +
                        " $21 $20$21- $23 $22$23 --$24");
                // System.out.println(matcher1.group());
            }
            matcher1.appendTail(stringBuffer1);//добавили все что осталось в строке после номера в конце
        }
        String result=stringBuffer1.toString();
        for (String s : result.split("\n")) {
            str.add(s);
        }
        IOStream.write(str);
        //------------------------------------------------------------------------

        for (String s : str) {
            System.out.println(s);
        }
        /*
        2. В виде общего времени, потраченного на активности за день, и детализированного описания лекций:

        Лекции: 210 минут 22%
                Решения: 95 минут 9%
                Перерыв: 65 минут 6%
...

        Лекции:
        Введение:  23 минуты 2%
567
*/









//        List<String> stringBuffers = Arrays.asList(stringBuffer1.);

       // System.out.println(stringBuffers);

        //-------------------------------------------------------------
        //(\d{2}\:\d{2}\ )(\D*)(\x0a\D*\x0a)(\d{2}\:\d{2}\ )\-(\D*)(\d{2}\:\d{2}\ )
//        String reg2 = "\\x0a\\D*\\x0a";
//        String reg3 = "(\\d{2}\\:\\d{2}\\ )(\\D*)(\\x0a\\D*\\x0a)(\\d{2}\\:\\d{2}\\ )\\-(\\D*)(\\d{2}\\:\\d{2}\\ )";
//        Pattern compile2 = Pattern.compile(reg2);
//        Matcher matcher2 = compile2.matcher(stringBuffer1);
//        Pattern compile3 = Pattern.compile(reg3);
//        Matcher matcher3 = compile3.matcher(stringBuffer1);
//
//
//            while (matcher2.find()) {//пока есть что искать
//                while (matcher3.find()) {//пока есть что искать
//                    StringBuffer q1=new StringBuffer();
//                   // matcher3.appendReplacement(q1,"$1-$4");
//                    //System.out.println(matcher3.group());
//                    String group = matcher3.group("$1-$4");
//                    System.out.println(group);
//
//
//                }
//                StringBuffer q=new StringBuffer();
//                matcher2.appendReplacement(q, reg2);
//               //  System.out.println(matcher2.group());
//
//
//            }

       // System.out.println(stringBuffer1);


    }


    public static void q1() {


    }

    public static void q2() {


    }

    public static void q3() {


    }

    public static void q4() {


    }

    public static void q5() {


    }

    public static void q6() {


    }

    public static void q7() {


    }

    public static void q8() {


    }

    public static void q9() {


    }

    public static void q10() {


    }


}
