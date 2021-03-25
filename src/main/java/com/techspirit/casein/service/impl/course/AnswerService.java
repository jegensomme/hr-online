package com.techspirit.casein.service.impl.course;

import com.techspirit.casein.model.course.Answer;
import com.techspirit.casein.repository.api.course.AnswerRepository;
import com.techspirit.casein.service.prototype.course.ServiceAnswer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class AnswerService implements ServiceAnswer {

    private final AnswerRepository repository;

    @Override
    public Answer read(int id, int questionId){
        return checkNotFoundWithId(repository.get(id, questionId), id);
    }
}
