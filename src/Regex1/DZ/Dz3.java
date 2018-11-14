package Regex1.DZ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*. Написать программу, выполняющую поиск в строке всех тегов абзацев,
 в т.ч. тех, у которых есть параметры, например <p id ="p1">,
и замену их на простые теги абзацев <p>.
*/
public class Dz3 {
    public static void main(String[] args) {
        String s = "asdasd <p gfhgf> sdfsdfsdf sdfsdf sdf </p> sdfsdfsdfsdf <p id= dfsdf> sdf sdf </p> sdfsdf";
        String reg = "<p(.*?)>";//? что бы проверял каждый символ на не нашел первый и забрал все сразу(без учета <>
        Pattern compile1 = Pattern.compile(reg);
        Matcher matcher1 = compile1.matcher(s);
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(s);
        while (matcher1.find()){//пока есть что искать
            String sq="<p>";
            matcher1.appendReplacement(stringBuffer, sq);//вставили в стрингбаффер измененный номер---или поставить вместо строки "+375$2" ссылаемся на 2группу



        }
        matcher1.appendTail(stringBuffer);//то что не попало в рег выраж последние символы строки
        System.out.println("---------");
        System.out.println(stringBuffer);

    }
}
