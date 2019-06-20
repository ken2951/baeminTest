package sample03;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("messageBean")
@Scope("prototype")
			//내가 잡히길 원하는 bean 이름 : xml에 적어놓은 Id
public class MessageBeanKo implements MessageBean {
	private int num;
	
	public MessageBeanKo() {
		System.out.println("MessageBeanKo 기본생성자");
	}
	
	@Override
	public void sayHello(String name) {
		num++;
		System.out.println("num="+num);
		System.out.println("안녕하세요 " + name);
		
		
	}

}
