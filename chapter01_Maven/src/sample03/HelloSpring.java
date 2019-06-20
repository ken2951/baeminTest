package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		MessageBean bean = (MessageBean) context.getBean("messageBean");
		bean.sayHello("Spring");
		System.out.println();
		MessageBean bean2 = context.getBean("messageBean", MessageBean.class);
		bean2.sayHello("Spring");			//id속성
		System.out.println();
		MessageBean bean3 = (MessageBean) context.getBean("messageBean", MessageBean.class);
		bean3.sayHello("Spring");						//name속성
		
		((AbstractApplicationContext) context).close();
	}

}


//Spring container 의존 = (~~new() 하지않음!!) Spring container가 알아서 생성 -> bean을 생성한다고 말함
//Spring 설정파일 = applicationContext.xml : src 밑에 만들어야함


