package setterInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class ClientLogic {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("spconfig.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
		
		Object obj = factory.getBean("id1");
		
		WelcomeBean welcomeBean =(WelcomeBean) obj;
		
		welcomeBean.showMessage();
		
        Object obj1 = factory.getBean("id2");
		
		WelcomeBean welcomeBeans =(WelcomeBean) obj1;
		
		welcomeBeans.showMessage();
		
		Object obj2=factory.getBean("id3");
		
		WelcomeBean welcome=(WelcomeBean) obj2;
		
		welcome.showMessage();
	}

}