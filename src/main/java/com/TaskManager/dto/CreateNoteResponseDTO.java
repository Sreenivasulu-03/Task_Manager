package com.TaskManager.dto;

import com.TaskManager.entity.NoteEntity;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class CreateNoteResponseDTO {
    private Integer taskId;
    private NoteEntity note;

}
