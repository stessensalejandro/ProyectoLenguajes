
public class C extends B{
	
	public void init() {
		super.init();
	}
	
	public int m2(int w1, int w2){
		if(w1 < 0 | w2 < 0) {
			return super.m2(w1, w2);
		}
		B xB = new B();
		xB.init();
		return xB.m1(this,-1, w2);
	}

}
