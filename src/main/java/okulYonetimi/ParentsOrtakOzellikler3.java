package okulYonetimi;

public class ParentsOrtakOzellikler3 {
    private String firstName;
    private String lastName;
    private String id;
    private int age;

    public ParentsOrtakOzellikler3(String firstName, String lastName, String id, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    public ParentsOrtakOzellikler3() {

    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName(String lastName) {
        return this.lastName;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ParentsOrtakOzellikler{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
