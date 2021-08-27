package project.ty.model;


import javax.persistence.*;



@Entity
@Table(name = "employee")
public class Employee{

    @Id
    @Column
    private Long id;
    @Column
    private String Firstname;
    @Column
    private String Lastname;
    @Column
    private int Age;
    @Column
    private String Org;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getOrg() {
        return Org;
    }

    public void setOrg(String org) {
        this.Org = org;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", Org='" + Org + '\'' +
                '}';
    }
}
