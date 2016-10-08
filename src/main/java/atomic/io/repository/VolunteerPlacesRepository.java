package atomic.io.repository;

import atomic.io.models.VolunteerResponse;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nazhirjackson on 10/7/16.
 */
public interface VolunteerPlacesRepository extends JpaRepository<VolunteerResponse, Long> {
}
