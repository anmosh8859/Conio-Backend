package com.expanse.Coino.models;

// Group.java
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "groups")
public class Group {

    @Id
    private String id;
    private String groupName;
    private List<String> memberIds; // List of userIds in this group
    private List<String> expenseIds; // List of expenseIds belonging to this group
    private String createdBy; // The user who created the group
    private String createdAt;
}