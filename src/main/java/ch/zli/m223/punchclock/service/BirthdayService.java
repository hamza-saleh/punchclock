package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Birthday;
import ch.zli.m223.punchclock.repository.BirthdayRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BirthdayService {
    private BirthdayRepository birthdayRepository;

    public BirthdayService(BirthdayRepository birthdayRepository) {
        this.birthdayRepository = birthdayRepository;
    }

    public Birthday createBirthday(Birthday birthday) {
        return birthdayRepository.saveAndFlush(birthday);
    }

    public List<Birthday> findAllBirthday() {
        return birthdayRepository.findAll();
    }

    public void deleteBirthday(long id){birthdayRepository.deleteById(id);}

    public void  updateEntry(Birthday birthday) {
        birthdayRepository.save(birthday);
    }
}