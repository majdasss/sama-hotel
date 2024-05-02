package com.emsi.bookingsystem.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "size")
    private long size;
    @Column(name="type")
    private String type;
    @Column(name = "upload_date")
    private Date uploadDate;
    @Lob
    @Column(name = "content", length = 1000000)
    private byte[] content;

}
