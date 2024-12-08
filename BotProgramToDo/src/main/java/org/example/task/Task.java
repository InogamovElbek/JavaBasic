package org.example.task;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString
public class Task {
    private int id;
    private String title;
    private String description;
    private LocalDateTime deadLine;
    private Status status;
    private Long chatId;
}
