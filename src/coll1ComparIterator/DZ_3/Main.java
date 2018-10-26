package coll1ComparIterator.DZ_3;

import java.util.LinkedList;
import java.util.List;

/* 1.	Написать метод markLength4, принимающий в качестве параметра список (List) строк и размещающий строку "****"
перед каждым четырёхсимвольным элементом. Оригинальные элементы должны остаться на месте.
          Например:

{"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}

->

{"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****", "Java", "programmer"}
*/
public class Main {
    public static void main(String[] args) {
        List<String> str =new LinkedList<>();
        str.add("qwerer  ");
        str.add("qwer");
        str.add("qw");
        str.add("qwere  ");
        str.add("qwer");
        str.add("qwe");
        str.add("qwer");
        str.add("qwerer  ");
        str.add("q");
        str.add("7833");
        for (String s : str) {
            System.out.println(s);
        }
        Iter(str);
        System.out.println("---------------------------");
        for (String s : str) {
            System.out.println(s);
        }
    }
    private static void Iter(List str){
        for (int i = 0; i <str.size() ; i++) {
            String q= (String) str.get(i);
            if(q.length()==4&&q!="****"){
                str.add(i, "****");
                i++;
                continue;
            }
        }
    }
}
