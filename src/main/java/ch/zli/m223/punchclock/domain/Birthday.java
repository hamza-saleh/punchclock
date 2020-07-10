package ch.zli.m223.punchclock.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Birthday {

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @Column(nullable = false)
    private LocalDateTime birthday;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public long getId() {
        return id;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public void setId(long id) {
        this.id = id;
    }
}
