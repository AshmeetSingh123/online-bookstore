package com.books.OnlineBookstore.models.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserBean {

    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private int age;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("role")
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
