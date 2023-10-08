public class Student extends User {
    private Integer numberOfGroup;

    public Student(String firstName, String lastName, Integer numberOfGroup) {
        super(firstName, lastName);
        this.numberOfGroup = numberOfGroup;
    }

    public Student(String firstName, String lastName) {
        this(firstName, lastName, null);
    }

    public Student(String firstName) {
        this(firstName,firstName, null);
    }

    public Integer getStudentId() {
        return super.getUserId();
    }

    public void setStudentId(Integer studentId) {
        super.setUserId(studentId);;
    }

    public Integer getNumberOfGroup() {
        return this.numberOfGroup;
    }

    public void setNumberOfGroup(Integer numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

   
    @Override
    public String toString() {
        return "{" +
            " name='" + getLastName() + " " + getFirstName() +
            " ' , numberOfGroup='" + getNumberOfGroup() + "'" +
            ", id='" + getStudentId() + "'" +
            "}";
    }
}
