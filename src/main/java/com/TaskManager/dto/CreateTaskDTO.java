package com.TaskManager.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateTaskDTO {
    String title;
    String description;
    String deadline;
}
