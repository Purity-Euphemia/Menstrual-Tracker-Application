package repository;

import model.UserCycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCycleRepository extends JpaRepository<UserCycle, Long> {
}
