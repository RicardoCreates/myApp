package de.ricardo.backend;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record Diary (
        String id,
        String name,
        String description
) {

    Diary(
            String name,
            String description
    ){
        this(null, name, description);
    }

    public Diary(String id) {return new Diary(id, name, description);}
}
