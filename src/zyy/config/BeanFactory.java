package zyy.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ��ȡspring���ý���bean��ʼ��
 * 
 * @author zyy
 *
 */
public class BeanFactory {

	private static final String SPRING_CONFIG_PATH = "zyy/config/spring_conf.xml";
	private static ApplicationContext context = new ClassPathXmlApplicationContext(
			SPRING_CONFIG_PATH);

	private BeanFactory() {
	}

	public static Object getBean(String beanId) {

		return context.getBean(beanId);
	}
}
