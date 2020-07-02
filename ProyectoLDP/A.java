
public class A {
	int v1, v2;

	public void init() {
		v1 = 100;
		v2 = 10;
 	}
	
	public int m1() {
		int value = 0;
	    int a;
	    int rtn;
	    
	    for(a=0; a<10 & value*2 < 10; a++){
	       value = Sistema.read();
	    }
	    
	    rtn = (this.m2(value,a)+this.m2(v1,v2));
	    
	    return rtn;
	 }
	
	public int m2(int w1, int w2) { 
	    v1 = v1*w1;
	    v2 = v2*v1*w2;
	    return v1+v2+w1+w2;
	}

}
