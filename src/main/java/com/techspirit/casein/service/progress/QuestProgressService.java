package com.techspirit.casein.service.progress;

import com.techspirit.casein.model.course.progress.QuestProgress;
import com.techspirit.casein.repository.api.progress.QuestProgressRepository;
import com.techspirit.casein.util.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.techspirit.casein.util.ValidationUtil.checkNotFoundWithId;

@Service
@AllArgsConstructor
public class QuestProgressService {

    private final QuestProgressRepository repository;

    public QuestProgress read(int id, int courseProgress) throws NotFoundException {
        return checkNotFoundWithId(repository.get(id, courseProgress), id);
    }
}
