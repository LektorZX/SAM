package coll2.DZ_1;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
    garage.see();
        Bmw q = new Bmw("бмв", "303", 1988);
        garage.out(q);
        garage.see();
        garage.in(q);
        garage.see();
        garage.seach(q);
        garage.see();

    }
}
