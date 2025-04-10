package MDS.Diagnostic_Pacient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Diagnostic_Pacient_Repository extends JpaRepository<Diagnostic_Pacient, Long> {
    List<Diagnostic_Pacient> findByPacientUserId(Long pacientId);
}