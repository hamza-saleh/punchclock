package ch.zli.m223.punchclock.domain;

import java.time.LocalDateTime;

public class Birthday {
    private LocalDateTime birthday;
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
