package Bai2;

public class Kythuat extends NhanVien{
	
	private String chuyennganh;
	
	

	public Kythuat() {
		
	}

	@Override
	public String Motacongviec() {
		// TODO Auto-generated method stub
		return chuyennganh;
	}
	public Kythuat(String mnv) {
		super(mnv);
	}
	public Kythuat(String mnv, String hoten, String namsinh, String diachi, String chuyennganh) {
		super (mnv, hoten, namsinh, diachi);
		chuyennganh=chuyennganh;
	}
	public String getChuyennganh() {
		return chuyennganh;
	}

	public void setChuyennganh(String chuyennganh) {
		this.chuyennganh = chuyennganh;
	}
	public String toString() {
        return "Kythuat[" + super.toString() +"chuyenganh='" + chuyennganh + '\'' +
                ']';
    }
	

}
