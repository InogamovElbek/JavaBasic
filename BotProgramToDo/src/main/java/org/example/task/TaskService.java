package org.example.task;

import org.example.MyBot;

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
        if (words.length < 3) return false; // Ensure all required parts are present

        String title = words[0].trim();
        LocalDateTime deadLine = LocalDateTime.parse(words[1].trim());
        String description = words[2].trim();

        Task task = Task.builder()
                .title(title)
                .deadLine(deadLine)
                .description(description)
                .chatId(chatId)
                .status(Status.UNFINISHED)
                .build();
        taskList.add(task);

        System.out.println(taskList);
        return true;
    }
}
