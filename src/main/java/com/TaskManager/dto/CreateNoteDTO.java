package com.TaskManager.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateNoteDTO {
    private String title;
    private String body;
}
