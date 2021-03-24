package com.techspirit.casein.service.impl.course;

import com.techspirit.casein.model.course.Question;
import com.techspirit.casein.repository.course.QuestionRepository;
import com.techspirit.casein.service.prototype.course.ServiceQuestion;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class QuestionService implements ServiceQuestion {

    private final QuestionRepository questionRepository;

    @Override
    public Question read(int id) {
        return questionRepository.getOne(id);
    }
}
