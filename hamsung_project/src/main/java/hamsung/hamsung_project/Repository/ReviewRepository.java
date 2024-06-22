package hamsung.hamsung_project.Repository;

import hamsung.hamsung_project.Entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReviewRepository extends JpaRepository<Review, Long> {
}
