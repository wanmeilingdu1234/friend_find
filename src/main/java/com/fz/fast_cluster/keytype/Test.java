/**
 * 
 */
package com.fz.fast_cluster.keytype;

/**
 * @author fansy
 * @date 2015-6-23
 */
public class Test {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Test t = new Test();
		DoubleArrWritable tt = new DoubleArrWritable(new double[]{1,9,7},"sdf");
		System.out.println(tt);
		t.update(tt);
		System.out.println(tt);
	}
	
	private void update(DoubleArrWritable tt){
		tt.getDoubleArr()[0]=9;
	}

}