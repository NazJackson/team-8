package atomic.io.repository;

import atomic.io.models.LoginResponse;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nazhirjackson on 10/7/16.
 */
public interface LoginResponseRepository extends JpaRepository<LoginResponse, Long>{
}
