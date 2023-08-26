package com.example.blog.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.w3c.dom.Text;

import java.util.UUID;

public class Post {

    private final UUID id;
    private final String title;
    private final Text body;

    public Post( )
    {

    }

    public UUID getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public Text getBody(){
        return body;
    }
}
