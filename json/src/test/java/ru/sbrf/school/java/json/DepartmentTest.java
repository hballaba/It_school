package ru.sbrf.school.java.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    @Test
    @DisplayName("Check read json")
    public void test1() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        File file = new File("src/test/java/ru/sbrf/school/java/json/department.json");
        if (file.exists()) {

            File file2 = new File("src/test/java/ru/sbrf/school/java/json/department2.json");
            String origin = "Department{firstNameLead='Вася', lastNameLead='Пупкин', nameDepartment='Major'}";

            Department department1 = mapper.readValue(file, Department.class);
            mapper.writeValue(file2, department1);

            Assertions.assertEquals(origin, department1.toString());
            System.out.println(department1.toString());

            JsonNode item1 = mapper.readTree(file);
            JsonNode item2 = mapper.readTree(file2);
            boolean equals = item1.equals(item2);
            System.out.println("The comparison was successful =  " + equals);
        }
    }

}
