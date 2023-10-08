public class Teacher extends User {
    private Integer numbersOfGroup;

    public Teacher(String firstName, String lastName, Integer numberOfGroup) {
        super(firstName, lastName);
        this.numbersOfGroup = numberOfGroup;
    }

    public Integer getNumbersOfGroup() {
        return this.numbersOfGroup;
    }

    public void setNumbersOfGroup(Integer numbersOfGroup) {
        this.numbersOfGroup = numbersOfGroup;
    }


    @Override
    public String toString() {
        return "{" +
            " Teacher = '" + super.getFirstName() + " " + super.getLastName()
            + " | " + getNumbersOfGroup() + " group curator'" +
            "}";
    }
    
}
