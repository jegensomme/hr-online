package com.techspirit.casein.service.impl.course;

import com.techspirit.casein.model.course.Question;
import com.techspirit.casein.repository.api.course.QuestionRepository;
import com.techspirit.casein.service.prototype.course.ServiceQuestion;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class QuestionService implements ServiceQuestion {

    private final QuestionRepository questionRepository;

    @Override
    public Question read(int id, int questId) {
        return checkNotFoundWithId(questionRepository.get(id, questId), id);
    }
}
