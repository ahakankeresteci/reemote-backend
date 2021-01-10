package com.example.reemote.entityModel;

import java.sql.Date;

import javax.persistence.*;

import org.bson.types.ObjectId;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Document(collection = "jobads")
@Data //Lombok sayesinde getter ve setter'ları yazmamıza gerek kalmadı.
public class JobAdvertisement {

    
    @Indexed
    private String job_id = ObjectId.get().toString();
   
    @Id
    private String id = job_id;   //B

    private String title;

    private String category;

    private User author ;

    private String content;

    private String image_url;

    private int price;

    @CreatedDate
    private Date date_created ;

    
    @UpdateTimestamp
    private Date last_update;




}
