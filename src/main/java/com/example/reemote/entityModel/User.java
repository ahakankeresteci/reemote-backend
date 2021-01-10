package com.example.reemote.entityModel;

import java.util.Collection;

import javax.persistence.*;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;


@Document(collection = "users")
@Getter
@Setter
public class User {
    
    @Indexed
    private String user_id = ObjectId.get().toString();

    @Id
    private String id = user_id;
    
    @Indexed
    private String user_name;

    private String first_name;

    private String last_name;

    private String email;

    private String profile_picture;

    @DBRef
    private Collection<JobAdvertisement> job_advertisements;




}
