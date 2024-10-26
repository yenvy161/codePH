package nguyenNgocYenVy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListPhongHoc {
	List<PhongHoc> ls;

	public ListPhongHoc() {
		ls = new ArrayList<PhongHoc>(2);
	}

	public boolean ThemPhong(PhongHoc p) {
		if (ls.contains(p)) {
			return false;
		} else {
			ls.add(p);
			return true;
		}

	}

	public int soPhongHoc() {
		return ls.size();
	}

	public boolean XoaPhong(String maPhong) {
		for (PhongHoc ph : ls)
			if (ph.maPhong.equalsIgnoreCase(maPhong)) {
				ls.remove(ls);
				return true;
			}
		return false;
	}

	public List<PhongHoc> XuatPhongHoc() {
		return ls;
	}

	public List<PhongHoc> danhSachPhongDatChuan() {
		List<PhongHoc> dsDC = new ArrayList<PhongHoc>();
		for (PhongHoc ph : ls)
			if (ph.datChuan())
				dsDC.add(ph);
		return dsDC;

	}

	public void SapXep() {
		Collections.sort(ls, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				String x = new String(o1.getMaPhong());
				String y = new String(o2.getMaPhong());
				return x.compareToIgnoreCase(y);
			}

		});
	}

	public boolean soBongDen(String maPhong, int soBong) throws Exception {
		for (PhongHoc ph : ls)
			if (maPhong.equalsIgnoreCase(ph.getMaPhong())) {
				ph.setSoBongDen(soBong);
				return true;
			}
		return false;
	}
}
