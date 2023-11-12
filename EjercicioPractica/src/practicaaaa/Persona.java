package practicaaaa;
import java.util.*;

public abstract class Persona {
	public static List<Persona> listaPersona = new ArrayList<>();
	
	private int id;
	private int dni;
	private String nombres;
	private String apellido;
	private String direccion;
	private String telefono;
	private TipoPersona tipo;
	private int codigoTipo; 
	
	
	
	public Persona(int id, int dni, String nombres, String apellido, String direccion, String telefono)
	{
		this.id = id;
		this.dni = dni;
		this.nombres = nombres;
		this.apellido = apellido;
		this.telefono = telefono;

	}
	
	
	public static void altaPersona()
	{
		
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public TipoPersona getTipo() {
		return tipo;
	}


	public void setTipo(TipoPersona tipo) {
		this.tipo = tipo;
	}


	public int getCodigoTipo() {
		return codigoTipo;
	}


	public void setCodigoTipo(int codigoTipo) {
		this.codigoTipo = codigoTipo;
	}


	public static void modificarPersona()
	{
		
	}
	
	public static void buscarPersona()
	{
		
	}
	
	
	class Estudiante extends Persona {
		private int legajo;
		
		public Estudiante(int id, int dni, String nombres, String apellido, String direccion, String telefono, int legajo)
		{
			super(id, dni, nombres, apellido, direccion, telefono);
			this.legajo = legajo;
			setTipo(TipoPersona.ESTUDIANTE);
			setCodigoTipo(TipoPersona.ESTUDIANTE.getCodigo());
		}
		
		
		public int getLegajo() {
			return legajo;
		}

		public void setLegajo(int legajo) {
			this.legajo = legajo;
		}


		public static void altaEstudiante()
		{
			
		}
		
		public static void modificarEstudiante()
		{
			
		}
}
	
	 class Docente extends Persona{
		private int matricula;
		
		public Docente(int id, int dni, String nombres, String apellido, String direccion, String telefono, int matricula)
		{
			super(id, dni, nombres, apellido, direccion, telefono);
			setTipo(TipoPersona.DOCENTE);
			setCodigoTipo(TipoPersona.DOCENTE.getCodigo());
			this.matricula= matricula;
		}
		
		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}

		public void altaDocente()
		{
			
		}
		
		public void modificarDocente()
		{
			
		}
	}
	
	 class Cliente extends Persona
	{
		public Cliente(int id, int dni, String nombres, String apellido, String direccion, String telefono)
		{
			super(id, dni, nombres, apellido, direccion, telefono);
			setTipo(TipoPersona.CLIENTE);
			setCodigoTipo(TipoPersona.CLIENTE.getCodigo());
		}
	}
	}

	
