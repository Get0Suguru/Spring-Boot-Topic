package com.learning.audit.learning_audit_project.Repo;

import com.learning.audit.learning_audit_project.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends JpaRepository<Task, Long> {
}
