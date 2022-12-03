package com.example.students.entity;




import javax.persistence.*;

@Entity
@Table(name = "students")
public class Students extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_Name")
    private String lastName;

    @Column(name = "class_No")
    private String classNo;

    @Column(name ="age" )
    private int age;

    @Column(name = "adress")
    private String adress;

    @Column(name = "email")
    private String email;

    public Students() {
    }

    public Students(Long id, String name, String lastName, String classNo, int age, String adress, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.classNo = classNo;
        this.age = age;
        this.adress = adress;
        this.email = email;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", classNo='" + classNo + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
