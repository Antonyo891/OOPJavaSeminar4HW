public class User implements Comparable<User> {
    private Integer UserId;
    private String firstName, lastName;
    protected static Integer id=0;
    
    private Integer GenerateId(){
        this.UserId=this.id+1;
        this.id=this.UserId;
        return this.UserId;
    }

    public User(String firstName, String lastName) {
        this.UserId = GenerateId();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName) {
        this(firstName,firstName);
    }

    public Integer getUserId() {
        return this.UserId;
    }

    public void setUserId(Integer UserId) {
        this.UserId = UserId;
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

    @Override
    public int compareTo(User o) {
        return this.UserId.compareTo(o.getUserId());
    }




}
