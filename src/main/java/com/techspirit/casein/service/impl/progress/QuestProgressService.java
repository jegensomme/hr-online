package com.techspirit.casein.service.impl.progress;

import com.techspirit.casein.model.course.progress.QuestProgress;
import com.techspirit.casein.repository.api.progress.QuestProgressRepository;
import com.techspirit.casein.service.prototype.progress.ServiceQuestProgress;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class QuestProgressService implements ServiceQuestProgress {

    private final QuestProgressRepository repository;

    @Override
    public QuestProgress read(int id, int courseProgress) {
        return checkNotFoundWithId(repository.get(id, courseProgress), id);
    }
}
