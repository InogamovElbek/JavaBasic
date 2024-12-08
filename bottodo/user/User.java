package com.company.user;

import lombok.*;

@Setter @Getter
@AllArgsConstructor
@ToString
@Builder
public class User {
    private long chatId;
    private Step step;
}
