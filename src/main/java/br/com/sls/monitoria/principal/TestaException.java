package br.com.sls.monitoria.principal;

public class TestaException {
	public static final void main(String [] args){
		int [][] i = {{1,2},{2,1}};
		
		
		for(int [] a : i){
			System.out.println(a);
		}
//		try{
//			throw new ArithmeticException();
//		}catch (Exception e) {
//			System.out.println("Exception 1");
//		}finally {
//			try{
//				int a = 2/0;
//			}catch (Exception e) {
//				System.out.println("Exception 2");
//			}
//		}
	}
}
