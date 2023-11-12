package practicaaaa;
import java.time.LocalDate;
import java.util.*;


public class Pedido {
	public static List<Pedido> listaPedidos = new ArrayList<>();
	private int idLibro;
	private int cantidadEjemplares;
	private LocalDate fecha;
	private Estado estadoPedido;
	
	public Pedido(int idLibro, int cantidadEjemplares, LocalDate fecha){
		this.idLibro = idLibro;
		this.cantidadEjemplares = cantidadEjemplares;
		this.fecha = fecha;
		this.estadoPedido = mostrarEstados();
	}
	
	
	public static Estado mostrarEstados()
	{
		Estado retorno = null; int opcion;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Especificar el estado: ");
		System.out.println("opcion 1: RECHAZADO"
				+ "opcion 2: ANULADO" +
				"opcion 3: CONFIRMADO"
				+"opcion 4: PAUSADO" +
				"opcion 5: CERRADO" +
				"opcion 6: PENDIENTE");
		opcion = entrada.nextInt();
		switch(opcion)
		{
		case 1: 
			retorno = Estado.RECHAZADO;
		case 2: 
			retorno = Estado.ANULADO;
		case 3: 
			retorno = Estado.CONFIRMADO;
		case 4: 
			retorno = Estado.PAUSADO;	
		case 5: 
			retorno = Estado.CERRADO;
		case 6: 
			retorno = Estado.PENDIENTE;
		}
		return retorno;
	}
	
	public static void confirmarExistencia(int idLibro)
	{
		
	}
	


	
public class Libro{
	public static List<Libro> listaLibros = new ArrayList<>();
	
	private int id;
	private String edicion;
	private String editorial;
	private String titulos;
	private String autor;
	private int anio;
	private int cantidadEjemplares;
	
	public Libro(int id, String edicion, String editorial, String titulos, String autor, int anio, int cantidadEjemplares){
		this.id = id;
		this.edicion = edicion;
		this.editorial = editorial;
		this.titulos = titulos;
		this.autor = autor;
		this.anio = anio;
		this.cantidadEjemplares = cantidadEjemplares;
	}
	
	public static List<Libro> getListaLibros() {
		return listaLibros;
	}
	public static void setListaLibros(List<Libro> listaLibros) {
		Libro.listaLibros = listaLibros;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getTitulos() {
		return titulos;
	}
	public void setTitulos(String titulos) {
		this.titulos = titulos;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getCantidadEjemplares() {
		return cantidadEjemplares;
	}
	public void setCantidadEjemplares(int cantidadEjemplares) {
		this.cantidadEjemplares = cantidadEjemplares;
	}
	
	public static void altaLibro() {
		
	}
	
	public static void modificarLibro() {
		
	}
	
	public static void buscarLibro(){
		
	}
	
	public void incrementarEjemplares(int cantidad) {
		
	}
	
	public void decrementarEjemplares(int cantidad) {
		
	}
}

	public class Reserva{
		public static List<Reserva> listaReservas = new ArrayList<>();
		
		private int idPedido;
		private LocalDate fechaPedido;
		private LocalDate fechaRetiro;
		private LocalDate fechaDevolucion;
		private double importe;
		private FormasPago formaDePago;
		private Estado estadoReserva;
		private int idReserva;
		
		
		
		public Reserva(int idPedido, LocalDate fechaPedido, LocalDate fechaRetiro, LocalDate fechaDevolucion,
				double importe, int idReserva) {
			this.idPedido = idPedido;
			this.fechaPedido = fechaPedido;
			this.fechaRetiro = fechaRetiro;
			this.fechaDevolucion = fechaDevolucion;
			this.importe = importe;
			this.idReserva = idReserva;
			this.estadoReserva = mostrarEstados();
			this.formaDePago = mostrarPagos();
		}
		
		public static Estado mostrarEstados()
		{
			Estado retorno = null; int opcion;
			Scanner entrada = new Scanner (System.in);
			System.out.println("Especificar el estado: ");
			System.out.println("opcion 1: RECHAZADO"
					+ "opcion 2: ANULADO" +
					"opcion 3: CONFIRMADO"
					+"opcion 4: PAUSADO" +
					"opcion 5: CERRADO" +
					"opcion 6: PENDIENTE");
			opcion = entrada.nextInt();
			switch(opcion)
			{
			case 1: 
				retorno = Estado.RECHAZADO;
			case 2: 
				retorno = Estado.ANULADO;
			case 3: 
				retorno = Estado.CONFIRMADO;
			case 4: 
				retorno = Estado.PAUSADO;	
			case 5: 
				retorno = Estado.CERRADO;
			case 6: 
				retorno = Estado.PENDIENTE;
			}
			return retorno;
		}
		
		public static FormasPago mostrarPagos ()
		{
			FormasPago retorno = null; int opcion;
			Scanner entrada = new Scanner (System.in);
			System.out.println("Especificar la forma de pago: ");
			System.out.println("opcion 1: EFECTIVO"
					+ "opcion 2: TRANSFERENCIA" +
					"opcion 3: CTA_CTE"
					+"opcion 4: TARJETA_DEBITO" +
					"opcion 5: TARJETA_CREDITO" +
					"opcion 6: DONACION");
			opcion = entrada.nextInt();
			switch(opcion)
			{
			case 1: 
				retorno = FormasPago.EFECTIVO;
			case 2: 
				retorno = FormasPago.TRANSFERENCIA;
			case 3: 
				retorno = FormasPago.CTA_CTE;
			case 4: 
				retorno = FormasPago.TARJETA_DEBITO;	
			case 5: 
				retorno = FormasPago.TARJETA_CREDITO;
			case 6: 
				retorno = FormasPago.DONACION;
			}
			return retorno;
		}
		
	
		
		public static List<Reserva> getListaReservas() {
			return listaReservas;
		}
		public static void setListaReservas(List<Reserva> listaReservas) {
			Reserva.listaReservas = listaReservas;
		}
		public int getIdPedido() {
			return idPedido;
		}
		public void setIdPedido(int idPedido) {
			this.idPedido = idPedido;
		}
		public LocalDate getFechaPedido() {
			return fechaPedido;
		}
		public void setFechaPedido(LocalDate fechaPedido) {
			this.fechaPedido = fechaPedido;
		}
		public LocalDate getFechaRetiro() {
			return fechaRetiro;
		}
		public void setFechaRetiro(LocalDate fechaRetiro) {
			this.fechaRetiro = fechaRetiro;
		}
		public LocalDate getFechaDevolucion() {
			return fechaDevolucion;
		}
		public void setFechaDevolucion(LocalDate fechaDevolucion) {
			this.fechaDevolucion = fechaDevolucion;
		}
		public double getImporte() {
			return importe;
		}
		public void setImporte(double importe) {
			this.importe = importe;
		}
		public FormasPago getFormaDePago() {
			return formaDePago;
		}
		public void setFormaDePago(FormasPago formaDePago) {
			this.formaDePago = formaDePago;
		}
		public Estado getEstadoReserva() {
			return estadoReserva;
		}
		public void setEstadoReserva(Estado estadoReserva) {
			this.estadoReserva = estadoReserva;
		}

		public int getIdReserva() {
			return idReserva;
		}
		public void setIdReserva(int idReserva) {
			this.idReserva = idReserva;
		}
		
		public static void pagarReserva(int idReserva)
		{
			
		}
		
		public static void cambioEstado(int idReserva)
		{
			
		}
		
		
	}
}
