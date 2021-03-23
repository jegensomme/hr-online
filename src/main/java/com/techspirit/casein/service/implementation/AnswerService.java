package com.techspirit.casein.service.implementation;

import com.techspirit.casein.model.Answer;
import com.techspirit.casein.repository.AnswerRepository;
import com.techspirit.casein.service.prototype.ServiceAnswer;
import org.springframework.stereotype.Service;

@Service
public class AnswerService implements ServiceAnswer {
    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @Override
    public Answer read(int id){
        return answerRepository.getOne(id);
    }

    @Override
    public boolean update(int id)
    {
        if(answerRepository.existsById(id)) {
            answerRepository.getOne(id).setCorrect(true);
            return true;
        }
        return false;
    }

}
