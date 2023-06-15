package entidad;

import java.sql.Date;

public class PuntoVenta {

	private int cod_Marca;
	private int nume_Tienda;
	private String Tienda;
	private String caja;
	private String IP_WorkStation;
	private String HostName;
	public int getCod_Marca() {
		return cod_Marca;
	}
	public void setCod_Marca(int cod_Marca) {
		this.cod_Marca = cod_Marca;
	}
	public int getNume_Tienda() {
		return nume_Tienda;
	}
	public void setNume_Tienda(int nume_Tienda) {
		this.nume_Tienda = nume_Tienda;
	}
	public String getTienda() {
		return Tienda;
	}
	public void setTienda(String tienda) {
		Tienda = tienda;
	}
	public String getCaja() {
		return caja;
	}
	public void setCaja(String caja) {
		this.caja = caja;
	}
	public String getIP_WorkStation() {
		return IP_WorkStation;
	}
	public void setIP_WorkStation(String iP_WorkStation) {
		IP_WorkStation = iP_WorkStation;
	}
	public String getHostName() {
		return HostName;
	}
	public void setHostName(String hostName) {
		HostName = hostName;
	}
	
	
}
