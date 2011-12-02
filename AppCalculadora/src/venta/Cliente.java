

package venta;

public class Cliente {

	private String codigo;
	private String ruc;
	private String razonSocial;
	private String fechaInicio;
	
	private int empleados;

	public Cliente(String codigo, String ruc, String razonSocial,
			String fechaInicio, String tipoEmpresa, int empleados) {
		super();  //el super siempre va en primer lugar
		this.codigo = codigo;
		this.ruc = ruc;
		this.razonSocial = razonSocial;
		this.fechaInicio = fechaInicio;
		
		this.empleados = empleados;		
	}

	public String getCodigo() {
		
		return codigo;
	}

	public String getRuc() {
		
		return ruc;
	}

	public String getRazonSocial() {
		
		return razonSocial;
	}

	public String getFechaInicio() {
		
		return fechaInicio;
	}


	public int getEmpleados() {

		return empleados;
	}



}
