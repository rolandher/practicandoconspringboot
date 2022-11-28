package com.practicandoconspringboot.practicando;

import com.practicandoconspringboot.practicando.bean.MyBean;
import com.practicandoconspringboot.practicando.bean.MyBeanWithDependency;
import com.practicandoconspringboot.practicando.component.ComponentDependency;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticandoApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;

	private MyBeanWithDependency myBeanWithDependency;

	public PracticandoApplication(ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(PracticandoApplication.class, args);

	}
	@Override
	public void run(String... args) {
		componentDependency.hello();
		myBean.print();
		myBeanWithDependency.printWithDependency();
	}
}
