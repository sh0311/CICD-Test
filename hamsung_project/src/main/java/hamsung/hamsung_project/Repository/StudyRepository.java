package hamsung.hamsung_project.Repository;

import hamsung.hamsung_project.Entity.Study;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyRepository extends JpaRepository<Study, Long> {
}
