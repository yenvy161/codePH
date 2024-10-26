package nguyenNgocYenVy;

public class PhongTN extends PhongHoc{

	@Override
	public boolean datChuan() {
		// TODO Auto-generated method stub
		return false;
	}
	private String chuyenNghanh;
	private int suaChua;
	private boolean coBonRua;

	public String getChuyenNghanh() {
		return chuyenNghanh;
	}

	public void setChuyenNghanh(String chuyenNghanh) {
		this.chuyenNghanh = chuyenNghanh;
	}

	public int getSuaChua() {
		return suaChua;
	}

	public void setSuaChua(int suaChua) {
		this.suaChua = suaChua;
	}

	public boolean isCoBonRua() {
		return coBonRua;
	}

	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}

	public PhongTN(String chuyenNghanh, int suaChua, boolean coBonRua) {
		super();
		this.chuyenNghanh = chuyenNghanh;
		this.suaChua = suaChua;
		this.coBonRua = coBonRua;
	}

	public PhongTN() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhongTN(String maPhong, String dayNha, double dienTich, int soBongDen) throws Exception {
		super(maPhong, dayNha, dienTich, soBongDen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String bonRua = (isCoBonRua())?"Co bon rua": "Khong co bon rua";
		return super.toString()+String.format("|%10s|%10s|%10s|", getChuyenNghanh(),getSuaChua(), bonRua);
	}
}
