package com.techspirit.casein.service.impl.course;

import com.techspirit.casein.model.course.Answer;
import com.techspirit.casein.repository.course.AnswerRepository;
import com.techspirit.casein.service.prototype.course.ServiceAnswer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AnswerService implements ServiceAnswer {
    private final AnswerRepository answerRepository;

    @Override
    public Answer read(int id){
        return answerRepository.getOne(id);
    }
}
