package med.lopes.clinic.center.api.model.input;

/**
 * The type Doctor update input.
 */
public record DoctorUpdateInput(
        String name,
        String phone,
        AddressInput address) {
}
