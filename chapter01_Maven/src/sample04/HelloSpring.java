package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Calc calc;
		calc = (CalcAdd) context.getBean("add");
		calc.calculate(25,36);
		calc = (CalcMul) context.getBean("mul");
		calc.calculate(25,36);
		
		((AbstractApplicationContext) context).close();
	}

}
