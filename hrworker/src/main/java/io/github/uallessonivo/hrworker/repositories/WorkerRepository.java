package io.github.uallessonivo.hrworker.repositories;

import io.github.uallessonivo.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
