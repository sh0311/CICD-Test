package hamsung.hamsung_project.repository;

import hamsung.hamsung_project.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReviewRepository extends JpaRepository<Review, Long> {
}
