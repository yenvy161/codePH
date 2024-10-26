package nguyenNgocYenVy;

public abstract class PhongHoc {
	public abstract boolean datChuan();
	protected String maPhong,dayNha;
	protected double dienTich;
	protected int soBongDen;
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public int getSoBongDen() {
		return soBongDen;
	}
	public void setSoBongDen(int soBongDen) throws Exception {
		if (soBongDen>0) {
			this.soBongDen = soBongDen;
		} else {
			throw new Exception("1");
		}	
	}
	public boolean duSang() {
		if (getDienTich()/getSoBongDen()<=10) {
			return true;
		} else {
			return false;
		}
	}
	public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) throws Exception {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		if (soBongDen>0) {
			this.soBongDen = soBongDen;
		} else {
			throw new Exception("1");
		}	
	}
	public PhongHoc() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String duSang=duSang()?"Phong du sang" : "phong khong du sang";
		String s="";
		s+=s.format("|%10s|%10s|%10s|%10s|%10s|", getMaPhong(),getDayNha(),getDienTich(),getSoBongDen(),duSang);
		return s;
	}
}
