package main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Message {


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private int Id;
    @NotNull
    private String from;
    @NotNull
    private Date date;
    @NotNull
    private String body;


}
