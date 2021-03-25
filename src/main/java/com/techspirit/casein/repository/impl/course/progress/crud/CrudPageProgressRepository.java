package com.techspirit.casein.repository.impl.course.progress.crud;

import com.techspirit.casein.model.course.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudPageProgressRepository extends JpaRepository<Page, Integer> {
}
