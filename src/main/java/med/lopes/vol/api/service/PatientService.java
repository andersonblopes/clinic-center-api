package med.lopes.vol.api.service;

import lombok.RequiredArgsConstructor;
import med.lopes.vol.api.domain.entities.Patient;
import med.lopes.vol.api.domain.repository.PatientRepository;
import med.lopes.vol.api.model.PatientModel;
import med.lopes.vol.api.model.input.PatientInput;
import med.lopes.vol.api.model.mapper.PatientMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * The type Patient service.
 */
@RequiredArgsConstructor
@Service
public class PatientService {

    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;

    /**
     * Create patient model.
     *
     * @param input the input
     * @return the patient model
     */
    @Transactional
    public PatientModel create(PatientInput input) {

        var entity = patientMapper.toEntity(input);
        patientRepository.save(entity);

        return patientMapper.toModel(entity);
    }

    /**
     * List set.
     *
     * @return the set
     */
    public Set<PatientModel> list() {
        List<Patient> patientList = patientRepository.findAll();

        return patientMapper.toSet(patientList);
    }
}
