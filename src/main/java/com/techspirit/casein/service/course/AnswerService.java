package com.techspirit.casein.service.course;

import com.techspirit.casein.model.course.Answer;
import com.techspirit.casein.repository.api.course.AnswerRepository;
import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class AnswerService {

    private final AnswerRepository repository;

    public Answer read(int id, int questionId) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id, questionId), id);
    }
}
