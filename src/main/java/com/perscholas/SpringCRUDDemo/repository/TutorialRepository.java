package com.perscholas.SpringCRUDDemo.repository;


import com.perscholas.SpringCRUDDemo.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long>
{
    List<Tutorial> findByPublished(boolean published);
}
