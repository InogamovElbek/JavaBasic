package org.example.task;

import lombok.*;
import org.example.step.Status;

import java.time.LocalDateTime;

@Setter
@Getter
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

