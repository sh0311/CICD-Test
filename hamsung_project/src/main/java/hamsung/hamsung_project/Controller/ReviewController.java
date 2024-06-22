package hamsung.hamsung_project.Controller;

import hamsung.hamsung_project.Dto.ResultDto;
import hamsung.hamsung_project.Dto.ReviewDto;
import hamsung.hamsung_project.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping("/review/{studyId}/{userId}")
    public ResponseEntity<ResultDto<String>> createReview(@PathVariable Long studyId, @PathVariable Long userId, @RequestBody ReviewDto dto) {
        ReviewDto createdDto=reviewService.createReview(studyId, userId, dto);
        return ResponseEntity.status(HttpStatus.OK).body(ResultDto.res(HttpStatus.OK.toString(),"리뷰등록 성공!"));
    }

}
