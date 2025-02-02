package com.expanse.Coino.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "groups")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Group {

    @Id
    private String id;
    private String groupName;

    private List<String> memberIds;
    private List<String> expenseIds;

    private String updatedBy;
    private String updatedAt;

    @NonNull
    private String createdBy;
    private String createdAt;

//    @Override
//    public String toString() {
//        return "Group{" +
//                "id='" + id + '\'' +
//                ", groupName='" + groupName + '\'' +
//                ", memberIds=" + memberIds +
//                ", expenseIds=" + expenseIds +
//                ", updatedBy='" + updatedBy + '\'' +
//                ", updatedAt='" + updatedAt + '\'' +
//                ", createdBy='" + createdBy + '\'' +
//                ", createdAt='" + createdAt + '\'' +
//                '}';
//    }
}