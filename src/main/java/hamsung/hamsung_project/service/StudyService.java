package hamsung.hamsung_project.service;

import hamsung.hamsung_project.entity.Study;
import hamsung.hamsung_project.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class StudyService {
    @Autowired
    StudyRepository studyRepository;

    public boolean endStudy(Long id){
        Study target=studyRepository.findById(id).orElse(null);
        if(target!=null){
            target.setStatus(false);
            target.setEndDate(LocalDate.now());
            studyRepository.save(target);
            return true;
        }
        return false;
    }

    public Study showStudy(Long id){
        return studyRepository.findById(id).orElse(null);
    }

    /* 로그인 한 userId 가져올 수 있게 시큐리티 구현 후 사용할 스터디 삭제 메소드(아래 껀 삭제하기)
    (스터디 주인의 id와 로그인한 유저의 id가 일치한다면 삭제)
    public boolean deleteStudy(Long id, Long userId){
        Study target=studyRepository.findById(id).orElse(null);

        if(target!=null){
            if(target.getLeader_id().equals(userId)){
                studyRepository.delete(target);
                return true;
            }
        }
        return false;
    }
    */
    public boolean deleteStudy(Long id){
        Study target=studyRepository.findById(id).orElse(null);
        if(target!=null){
            studyRepository.delete(target);
            return true;

        }
        return false;
    }
}
