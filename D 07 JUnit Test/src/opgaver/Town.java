package opgaver;

public class Town {
	private int children;

	public Town(int children) {
		this.children = children;
	}

	// small pre school children
	// big children attending regular school
	// return total payment minus discount
	// big == 1000
	// small == 2000
	public int totalpayment(int small, int big) {
		if (small == 1 && big == 0) {
			return 2000;
		} else if (big == 1 && small != 1) {
			return 1000;
		}
		if (big == 2 && small == 0) { // 1000 + 1750
			return 1750;
		} else if (big == 3) { // 1000 + 750 + 750
			return 2500;
		}
		if (small == 2 && big == 0) { // 2000 + 1500
			return 3500;
		} else if (small == 3) { // 2000 + 1500 + 1500
			return 5000;
		}
		if (big == 1 && small == 1) { // 750 + 2000
			return 2750;
		}
		if (big == 2 && small == 1) { // 750 + 750 + 2000
			return 3500;
		}
		if (big == 1 && small == 2) { // 750 + 1500 + 2000
			return 4250;
		}
		return 0;
	}
}
