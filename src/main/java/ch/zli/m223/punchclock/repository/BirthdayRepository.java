package ch.zli.m223.punchclock.repository;

import ch.zli.m223.punchclock.domain.Birthday;
import ch.zli.m223.punchclock.domain.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BirthdayRepository extends JpaRepository<Birthday, Long> {
}

