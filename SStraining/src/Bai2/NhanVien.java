package Bai2;

public abstract class NhanVien {
	private String mnv;
	private String hoten;
	private String namsinh;
	private String diachi;
	
	public NhanVien() {}
	public NhanVien(String mnv) {
		this.mnv=mnv;
	}
	public NhanVien(String mnv, String hoten, String namsinh, String diachi) {
		this.mnv=mnv;
		this.hoten=hoten;
		this.namsinh=namsinh;
		this.diachi=diachi;
	}
	
	public String getMnv() {
		return mnv;
	}
	public void setMnv(String mnv) {
		this.mnv = mnv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(String namsinh) {
		this.namsinh = namsinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
	public String getmnv() {
		return mnv;
	}
	public abstract String Motacongviec();
	
	 public String toString() {
	        return "Nhanvien[" +
	                "mnv='" + mnv + '\'' +
	                ", hoten='" + hoten + '\'' +
	                ", namsinh='" + namsinh + '\'' +
	                ", diachi='" + diachi + '\'' +
	                ']';
	    }
	
	

}
