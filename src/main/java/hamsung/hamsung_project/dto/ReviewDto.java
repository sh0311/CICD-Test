package hamsung.hamsung_project.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDto {
    private Long id;
    @JsonProperty("no_late")
    private Boolean noLate;

    private Boolean faithful;

    private Boolean kind;

    private Boolean unkind;
    @JsonProperty("fast_answer")
    private Boolean fastAnswer;
    @JsonProperty("slow_answer")
    private Boolean slowAnswer;

    private Boolean passive;

    private Boolean absent;
    @JsonProperty("user_id")
    private Long userId;
}
