package practicaaaa;

public enum TipoPersona {
	ESTUDIANTE(1),
	DOCENTE(2),
	CLIENTE(3);
	
	
	private int codigo;
	
	private TipoPersona(int codigo)
	{
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}


}

enum Estado{
	RECHAZADO, ANULADO, CONFIRMADO, PAUSADO, CERRADO, PENDIENTE;
	
}

enum FormasPago{
	EFECTIVO, TRANSFERENCIA, CTA_CTE, TARJETA_DEBITO, TARJETA_CREDITO, DONACION;
}



