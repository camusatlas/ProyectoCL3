package entidad;

import java.sql.Date;

public class Servidor {

	private int idnomEmpresa;
	private int codEmpresa;
	private String nomTienda;
	private String marcaTienda;
	private String Departamento;
	private String Provincia;
	private String Distrito;
	private String Region;
	private String IP_Servidor;
	private String HostName;
	private int Estado;
	private String VersionMicros;
	private String TamañoBD;
	private String SistemaOperativo;
	public int getIdnomEmpresa() {
		return idnomEmpresa;
	}
	public void setIdnomEmpresa(int idnomEmpresa) {
		this.idnomEmpresa = idnomEmpresa;
	}
	public int getCodEmpresa() {
		return codEmpresa;
	}
	public void setCodEmpresa(int codEmpresa) {
		this.codEmpresa = codEmpresa;
	}
	public String getNomTienda() {
		return nomTienda;
	}
	public void setNomTienda(String nomTienda) {
		this.nomTienda = nomTienda;
	}
	public String getMarcaTienda() {
		return marcaTienda;
	}
	public void setMarcaTienda(String marcaTienda) {
		this.marcaTienda = marcaTienda;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	public String getProvincia() {
		return Provincia;
	}
	public void setProvincia(String provincia) {
		Provincia = provincia;
	}
	public String getDistrito() {
		return Distrito;
	}
	public void setDistrito(String distrito) {
		Distrito = distrito;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public String getIP_Servidor() {
		return IP_Servidor;
	}
	public void setIP_Servidor(String iP_Servidor) {
		IP_Servidor = iP_Servidor;
	}
	public String getHostName() {
		return HostName;
	}
	public void setHostName(String hostName) {
		HostName = hostName;
	}
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
	public String getVersionMicros() {
		return VersionMicros;
	}
	public void setVersionMicros(String versionMicros) {
		VersionMicros = versionMicros;
	}
	public String getTamañoBD() {
		return TamañoBD;
	}
	public void setTamañoBD(String tamañoBD) {
		TamañoBD = tamañoBD;
	}
	public String getSistemaOperativo() {
		return SistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		SistemaOperativo = sistemaOperativo;
	}
	
}
