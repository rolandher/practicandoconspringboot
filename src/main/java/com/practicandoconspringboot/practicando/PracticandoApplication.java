package com.practicandoconspringboot.practicando;

import com.practicandoconspringboot.practicando.bean.MyBean;
import com.practicandoconspringboot.practicando.bean.MyBeanWithDependency;
import com.practicandoconspringboot.practicando.bean.MyBeanWithProperties;
import com.practicandoconspringboot.practicando.component.ComponentDependency;
import com.practicandoconspringboot.practicando.pojo.UserPojo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticandoApplication implements CommandLineRunner {

	private Log LOGGER = LogFactory.getLog(PracticandoApplication.class);

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;

	private MyBeanWithProperties myBeanWithProperties;

	private UserPojo userPojo;

	public PracticandoApplication(ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency,
								  MyBeanWithProperties myBeanWithProperties, UserPojo userPojo) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
		this.myBeanWithProperties = myBeanWithProperties;
		this.userPojo = userPojo;
	}

	public static void main(String[] args) {
		SpringApplication.run(PracticandoApplication.class, args);

	}

	@Override
	public void run(String... args) {
		componentDependency.hello();
		myBean.print();
		myBeanWithDependency.printWithDependency();
		System.out.println(myBeanWithProperties.Function());
		System.out.println(userPojo.getEmail() + "-" + userPojo.getAge());

		try {
			//error
			int value= 10/0;
			LOGGER.debug("value"+ value);
		} catch (Exception e) {
			LOGGER.error("Este es un error al dividir por 0" + e.getMessage());
		}
	}

}
