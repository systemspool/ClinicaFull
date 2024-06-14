package med.voll.api.domain.direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {

    private String calle;
    private String numero;
    private String complemento;
    private String distrito;
    private String ciudad;

    public Direccion(DatosDireccion direccion) {
        this.calle = direccion.calle();
        this.numero = direccion.numero();
        this.distrito = direccion.distrito();
        this.complemento = direccion.complemento();
        this.ciudad = direccion.ciudad();

    }

    public Direccion(DatosDireccionPaciente datosDireccionPaciente){
        this.calle = datosDireccionPaciente.calle();
        this.numero = datosDireccionPaciente.numero();
        this.distrito = datosDireccionPaciente.distrito();
        this.complemento = datosDireccionPaciente.complemento();
        this.ciudad = datosDireccionPaciente.ciudad();
    }

    public Direccion actualizarDatos(DatosDireccion direccion) {
        this.calle = direccion.calle();
        this.numero = direccion.numero();
        this.distrito = direccion.distrito();
        this.complemento = direccion.complemento();
        this.ciudad = direccion.ciudad();
        return this;
    }

    public Direccion actualizarDatos(DatosDireccionPaciente datosDireccionPaciente) {
        this.calle = datosDireccionPaciente.calle();
        this.numero = datosDireccionPaciente.numero();
        this.distrito = datosDireccionPaciente.distrito();
        this.complemento = datosDireccionPaciente.complemento();
        this.ciudad = datosDireccionPaciente.ciudad();
        return this;
    }
}
