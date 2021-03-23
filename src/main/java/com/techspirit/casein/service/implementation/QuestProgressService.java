package com.techspirit.casein.service.implementation;



import com.techspirit.casein.model.QuestProgress;
import com.techspirit.casein.repository.QuestProgressRepository;
import com.techspirit.casein.service.prototype.ServiceQuestProgress;
import org.springframework.stereotype.Service;

@Service
public class QuestProgressService implements ServiceQuestProgress {
    private final QuestProgressRepository questProgressRepository;

    public QuestProgressService(QuestProgressRepository questProgressRepository) {
        this.questProgressRepository = questProgressRepository;
    }

    @Override
    public QuestProgress read(int id){
        return questProgressRepository.getOne(id);
    }
}
