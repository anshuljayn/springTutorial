package uk.co.xyz.reportAPI.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.*;

public class Employee {

    @Id
    public ObjectId _id;

    @NotNull(message = "{user.field.notnull}")
    @Size(min = 3, max = 20, message = "{user.field.invalid}")
    public String firstName;

    @Size(min = 3, max = 20, message = "{user.field.invalid}")
    public String middleName;

    @NotNull(message = "{user.field.notnull}")
    @Size(min = 3, max = 20, message = "{user.field.invalid}")
    public String lastName;

    @NotNull(message = "{user.field.notnull}")
    @Min(value=16, message = "{user.field.invalid}")
    @Max(value=65, message = "{user.field.invalid}")
    public int age;

    @NotNull(message = "{user.field.notnull}")
    @Pattern(regexp = "^male|female$",message = "{user.field.invalid}")
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
