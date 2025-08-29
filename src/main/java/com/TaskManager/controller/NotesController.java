package com.TaskManager.controller;

import com.TaskManager.dto.CreateNoteDTO;
import com.TaskManager.dto.CreateNoteResponseDTO;
import com.TaskManager.entity.NoteEntity;
import com.TaskManager.service.NoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks/{taskId}/notes")
public class NotesController {

    private NoteService noteService;

    public NotesController(NoteService noteService) {
        this.noteService = noteService;
    }


    @GetMapping("")
    public ResponseEntity<List<NoteEntity>> getNotes(@PathVariable("taskId") Integer taskId){
        var notes = noteService.getNotesForTask(taskId);
        return ResponseEntity.ok(notes);
    }

    @PostMapping("")
    public ResponseEntity<CreateNoteResponseDTO> addNote(@PathVariable("taskId")Integer taskId,@RequestBody CreateNoteDTO body){
        var note = noteService.addNoteforTask(taskId,body.getTitle(), body.getBody());

        return ResponseEntity.ok(new CreateNoteResponseDTO(taskId,note));
    }

}
