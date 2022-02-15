package ec.edu.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {

	@Id
	@Column(name = "paci_id")
	private Integer id;
	@Column(name = "paci_cedula")
	private String cedula;
	@Column(name = "paci_nombre")
	private String nombre;
	@Column(name = "paci_apellido")
	private String apellido;
	@Column(name = "paci_fecha_nacimiento")
	private LocalDateTime fecha;
	@Column(name = "paci_codigo_seguro")
	private String codigoSeguro;
	@Column(name = "paci_estatura")
	private Double estatura;
	@Column(name = "paci_peso")
	private Double peso;
	@Column(name = "paci_genero")
	private String genero;
	
	@OneToMany(mappedBy = "paciente")
	private List<CitaMedica> citas;
	
	
	
	
	public List<CitaMedica> getCitas() {
		return citas;
	}
	public void setCitas(List<CitaMedica> citas) {
		this.citas = citas;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public String getCodigoSeguro() {
		return codigoSeguro;
	}
	public void setCodigoSeguro(String codigoSeguro) {
		this.codigoSeguro = codigoSeguro;
	}
	public Double getEstatura() {
		return estatura;
	}
	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
	
	
}
