package org.example.user;

import lombok.*;
import org.example.step.Step;

import java.util.List;

@Setter @Getter
@AllArgsConstructor
@ToString
@Builder
public class User {
    private long chatId;
    private String firstName;
    private String lastName;
    private String username;
    private String phone;
    private Step step;
    private List<String> toDoList;
}
