package com.TaskManager.entity;


import lombok.Data;

import java.security.PrivateKey;

@Data
public class NoteEntity {
    private int id;
    private String title;
    private String body;
}
