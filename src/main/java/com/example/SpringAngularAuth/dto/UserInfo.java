package com.example.SpringAngularAuth.dto;

import jakarta.persistence.*;

@Entity
@SqlResultSetMapping(name = "UserInfo", classes = @ConstructorResult(targetClass = UserInfo.class, columns = { @ColumnResult(name = "id", type = String.class),
        @ColumnResult(name = "name", type = String.class) }))
public class UserInfo {
    @Id
    private String id;
    private String name;

    public UserInfo(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}