package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Birthday;
import ch.zli.m223.punchclock.service.BirthdayService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/birthday")
public class BirthdayController {
    private BirthdayService birthdayService;

    public BirthdayController(BirthdayService birthdayService) {
        this.birthdayService = birthdayService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Birthday> getBirthday() {
        return birthdayService.findAllBirthday();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Birthday createBirthday(@Valid @RequestBody Birthday birthday) {
        return birthdayService.createBirthday(birthday);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEntry(@PathVariable long id) {
        birthdayService.deleteBirthday(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void updateEntry(@Valid @RequestBody Birthday birthday) {
        birthdayService.updateBirthday(birthday);
    }
}

