package coll2.DZ_1;

public class Honda extends Car {

    public Honda(String marka, String model, int year) {
        super(marka, model, year);
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 17;
        result = (int) (prime * result + super.getYear());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Honda other = (Honda) obj;
        if (super.getMarka() != other.getMarka())
            return false;
        if (super.getModel() != other.getModel())
            return false;
        if (super.getYear() != other.getYear())
            return false;
        return true;
    }

    @Override
    public String toString() {
        String str="Marka "+super.getMarka()+ " Model "+super.getModel()+" год "+super.getYear();
        return str ;
    }
}
