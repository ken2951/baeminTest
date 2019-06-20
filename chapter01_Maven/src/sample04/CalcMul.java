package sample04;


import org.springframework.stereotype.Component;

@Component("mul")

public class CalcMul implements Calc {
	
	@Override
	public void calculate(int x, int y) {
		int res = x * y;
		System.out.println(x+ " * " + y+" = "+res);

	}

}
