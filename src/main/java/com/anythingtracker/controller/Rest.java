package com.anythingtracker.controller;

import com.anythingtracker.domain.Note;
import org.springframework.web.bind.annotation.*;

@RestController
public class Rest {

    public static final String GET_NOTE = "Hello";
    public static final String POST_NOTE = "New note posted";
    public static final String PUT_NOTE = "Note updated";
    public static final String DELETE_NOTE = "Note deleted";

    @GetMapping("/notes/{id}")
    public Note getNote(@PathVariable long id){
        Note result = new Note();
        result.setContent(GET_NOTE);
        return result;
    }

    @PostMapping("/notes/")
    public Note postNote(Note newNote){
        newNote.setContent(POST_NOTE);
        return newNote;
    }

    @PutMapping("/notes/")
    public Note putNote(Note updatedNote){
        updatedNote.setContent(PUT_NOTE);
        return updatedNote;
    }

    @DeleteMapping("/notes/{id}")
    public Note deleteNote(@PathVariable long id){
        Note noteToDelete = new Note();
        noteToDelete.setId(id);
        noteToDelete.setContent(DELETE_NOTE);
        return noteToDelete;
    }
}
