package ru.sbrf.school.java.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Department {

    private String firstNameLead;
    private String lastNameLead;
    private String nameDepartment;

    public String getFirstNameLead() {
        return firstNameLead;
    }

    public void setFirstNameLead(String firstNameLead) {
        this.firstNameLead = firstNameLead;
    }

    public String getLastNameLead() {
        return lastNameLead;
    }

    public void setLastNameLead(String lastNameLead) {
        this.lastNameLead = lastNameLead;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartament) {
        this.nameDepartment = nameDepartament;
    }

    @Override
    public String toString() {
        return "Department{" +
                "firstNameLead='" + firstNameLead + '\'' +
                ", lastNameLead='" + lastNameLead + '\'' +
                ", nameDepartment='" + nameDepartment + '\'' +
                '}';
    }

//    public static void main(String[] args) throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//
//        Department department = new Department();
//        department =  mapper.readValue(new File("/Users/hballaba/Desktop/javaSchool/json/src/main/java/ru/sbrf/school/java/json/department.json"), Department.class);
//
//        System.out.println(department);
//    }
}
