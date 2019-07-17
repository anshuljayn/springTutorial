package uk.co.xyz.reportAPI.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class Employee {

    @Id
    public ObjectId _id;

    @NotNull(message = "{user.firstName.notNull}")
    @Size(min = 1, max = 60, message = "{user.firstName.size}")
    public String firstName;

    @NotNull
    public String middleName;

    @NotNull
    public String lastName;

    @Positive
    public int age;


    public String gender;

    public Employee() {    }

    public Employee(ObjectId _id, String firstName, String middleName, String lastName, int age, String gender) {
        this._id = _id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
