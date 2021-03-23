package com.techspirit.casein.service.implementation;

import com.techspirit.casein.model.Quest;
import com.techspirit.casein.repository.QuestRepository;
import com.techspirit.casein.service.prototype.ServiceQuest;
import org.springframework.stereotype.Service;

@Service
public class QuestService implements ServiceQuest {
    private final QuestRepository questRepository;

    public QuestService(QuestRepository questRepository) {
        this.questRepository = questRepository;
    }

    @Override
    public Quest read(int id){
        return questRepository.getOne(id);
    }
}
