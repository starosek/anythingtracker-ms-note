package com.anythingtracker.storage;

import com.anythingtracker.domain.Note;

public interface StorageAPI {
    Note create(Note note);
    Note read(long id);
    Note update(Note note);
    Note delete(long id);
}
