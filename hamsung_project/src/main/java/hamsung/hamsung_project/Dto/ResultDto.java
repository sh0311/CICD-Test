package hamsung.hamsung_project.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@Builder
public class ResultDto<T> {
    private String status;
    private T message;

    public static <T> ResultDto<T> res(final String status, final T t){
        return ResultDto.<T>builder()
                .status(status)
                .message(t)
                .build();
    }
}
