package constructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainProgram {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("spconfig.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
		
		Object obj = factory.getBean("id1");
		
		DemoBean demoBean = (DemoBean) obj;
		
		demoBean.show();
	}
}