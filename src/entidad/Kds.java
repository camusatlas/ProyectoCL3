package entidad;

import java.sql.Date;

public class Kds {

	private String HostName;
	private String nom_Tienda;
	private String marca_tienda;
	private String emp_tienda;
	private String num_tienda;
	private String IP_kds;
	private int Estado;
	private String Modelo;
	public String getHostName() {
		return HostName;
	}
	public void setHostName(String hostName) {
		HostName = hostName;
	}
	public String getNom_Tienda() {
		return nom_Tienda;
	}
	public void setNom_Tienda(String nom_Tienda) {
		this.nom_Tienda = nom_Tienda;
	}
	public String getMarca_tienda() {
		return marca_tienda;
	}
	public void setMarca_tienda(String marca_tienda) {
		this.marca_tienda = marca_tienda;
	}
	public String getEmp_tienda() {
		return emp_tienda;
	}
	public void setEmp_tienda(String emp_tienda) {
		this.emp_tienda = emp_tienda;
	}
	public String getNum_tienda() {
		return num_tienda;
	}
	public void setNum_tienda(String num_tienda) {
		this.num_tienda = num_tienda;
	}
	public String getIP_kds() {
		return IP_kds;
	}
	public void setIP_kds(String iP_kds) {
		IP_kds = iP_kds;
	}
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	
}
