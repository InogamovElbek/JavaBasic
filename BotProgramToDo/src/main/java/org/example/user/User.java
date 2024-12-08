package org.example.user;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class User {
    private long chatId;
    private Step step;
}
