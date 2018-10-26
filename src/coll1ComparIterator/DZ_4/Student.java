package coll1ComparIterator.DZ_4;

public class Student implements Comparable <Student>{
    private String firstName;
    private String lastName;
    private int ball;

    public Student(String firstName, String lastName, int ball) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ball = ball;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ball=" + ball ;
    }

    @Override
    public int compareTo(Student o) {
        return this.firstName.compareTo(o.firstName);
    }
}
