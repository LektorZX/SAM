package Regex1.DZ;

import java.util.regex.Pattern;

/*Написать программу, проверяющую, является ли введённая строка адресом почтового ящика.
В названии почтового ящика разрешить использование только букв, цифр
 и нижних подчёркиваний, при этом оно должно начинаться с буквы.
Возможные домены верхнего уровня: .org .com
*/
public class Dz1 {
    public static void main(String[] args) {

        String alph = "алфавиТ";
        System.out.println(Pattern.matches("[а-яА-Я]+",alph ));

          //         перв буква,знаки
        String reg="^[a-zA-Z]\\w*@\\w+\\.(org|com)$";
        String mail="Tr_ue99@mail.com";
        System.out.println(Pattern.matches(reg,mail ));




    }
}
