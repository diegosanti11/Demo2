package com.ait.mx.dto;

public class MyResponseDTO {
	
	private String mensaje;
	private String estado;
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public MyResponseDTO(String mensaje, String estado) {
		this.mensaje = mensaje;
		this.estado = estado;
	}
	
	public MyResponseDTO() {
	}
	
	

}
