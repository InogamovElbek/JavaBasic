package com.company.task;

import com.company.MyBot;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private MyBot myBot;
    private List<Task> taskList = new ArrayList<>();

    public TaskService(MyBot myBot) {
        this.myBot = myBot;
    }

    public boolean create(Long chatId, String text) {
        String[] words = text.split(",");
        String title = words[0];
        LocalDateTime deadLine = LocalDateTime.now();
        String description = words[2];

        Task task = Task.builder()
                .title(title)
                .deadLine(deadLine)
                .description(description)
                .chatId(chatId)
                .build();
        taskList.add(task);

        System.out.println(taskList);

        return true;
    }
}
