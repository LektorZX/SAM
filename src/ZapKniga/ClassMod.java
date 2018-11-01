package ZapKniga;

import java.util.Objects;

public class ClassMod implements Comparable<ClassMod>{
    private String name;
    private String lastName;
    private int number;

    public ClassMod(String name, String lastName, int number) {
        this.name = name;
        this.lastName = lastName;
        this.number = number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassMod classMod = (ClassMod) o;
        return number == classMod.number &&
                Objects.equals(name, classMod.name) &&
                Objects.equals(lastName, classMod.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, lastName, number);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number=" + number;
    }

    @Override
    public int compareTo(ClassMod o) {
        return this.name.compareTo(o.getName());
    }
}
