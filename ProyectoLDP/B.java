
public class B extends A{
	int v3;

	public void init(){
		super.init();
		v1 = v1*-1;
		v2 = v2*-1;
		v3 = -1;
	}

	public int m1(B xB, int w1, int w2){
		return xB.m2(w1,w2);
	}
}
