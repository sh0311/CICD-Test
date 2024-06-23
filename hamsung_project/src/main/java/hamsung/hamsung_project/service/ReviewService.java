package hamsung.hamsung_project.service;

import hamsung.hamsung_project.dto.ReviewDto;
import hamsung.hamsung_project.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public ReviewDto createReview(Long studyId, Long userId, ReviewDto reviewDto) {
        /* userId로 해당하는 review찾기 -> reviewDto에서 get했을 떄 true면 review 필드 +1해주기 -> reviewRepository에 갱신된 review 저장(save)
        Review review=reviewRepository.findBy
        if(reviewDto.getNoLate().equals(true)){

        }
        */

        return reviewDto;
    }
}
