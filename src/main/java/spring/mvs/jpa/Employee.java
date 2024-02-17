package spring.mvs.jpa;

import jakarta.validation.constraints.*;
import spring.mvs.jpa.validation.CheckEmail;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min=2, max=20,message="Name must be between 2 and 20 characters")
    private String name;
    @NotEmpty(message = "Surname is required field")
    private String surname;
    @Min(value = 0, message = "Salary can't be less then 0")
    @Max(value = 3000, message = "The greatest salary in our company is 3000")
    private int salary;

    private String department;
    private Map<String,String> departments;
    private String carBrand;
    private String[] languages;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phone;
    @CheckEmail(value = "abc.com", message = "email must ends with abc.com")
    private String email;

    public Employee() {
    }

    public Employee(String name, String surname, int salary, String department, String carBrand) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
        this.carBrand = carBrand;
        departments = new HashMap<>();
        departments.put("IT", "IT");
        departments.put("HR", "HR");
        departments.put("Sales", "Sales");
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
