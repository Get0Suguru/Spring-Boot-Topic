package com.learning.audit.learning_audit_project;

import com.learning.audit.learning_audit_project.Model.RemasteredTask;
import com.learning.audit.learning_audit_project.Model.Task;
import com.learning.audit.learning_audit_project.Repo.RemasteredTaskRepo;
import com.learning.audit.learning_audit_project.Repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LearningAuditProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningAuditProjectApplication.class, args);

	}


// Approach 1 of auditing  (just getting the last update)
//	@Bean			// now it won't work coz bean commented
	public ApplicationRunner runner(TaskRepo taskRepo){
		return args -> {

			// early populate the database			to check the audit workings
			System.out.println("------------------Inserting new");
			Task task = new Task();
			task.setTitle("Task 1");

			taskRepo.save(task);

			Thread.sleep(3*1000);
			System.out.println("---------------------Updating value");
			task.setTitle("Task 2");
			taskRepo.save(task);


		};
	}

// Approach 2 of auditing
//								(use hibernate dialect -> which keeps all the updates ||  save them in separate table)

	@Bean
	public ApplicationRunner runner2(RemasteredTaskRepo repo){
		return args -> {

			// early populate the database			to check the audit workings
			System.out.println("------------------Inserting new");
			RemasteredTask task = new RemasteredTask();
			task.setTitle("Task 1");
			repo.save(task);

			// updaing the task
			Thread.sleep(3*1000);
			System.out.println("---------------------Updating value");
			task.setTitle("Task 2");

			repo.save(task);
		};
	}
}
