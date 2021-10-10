package com.anythingtracker.storage;

import com.anythingtracker.config.ApplicationConfig;
import com.anythingtracker.domain.Note;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultInternalStorage implements StorageAPI{
    private final ApplicationConfig config;

    //one commit per method
    @Override
    public Note create(Note note) {
        //how java works with files
        //create text file in Linux
        //come up with file naming convention id.txt
        //how to structure folders
        //specify root folder
        return null;
    }

    @Override
    public Note read(long id) {
        Note note = new Note();
        note.setContent(config.getStorageRoot());
        return note;
    }

    @Override
    public Note update(Note note) {
        return null;
    }

    @Override
    public Note delete(long id) {
        return null;
    }
}
