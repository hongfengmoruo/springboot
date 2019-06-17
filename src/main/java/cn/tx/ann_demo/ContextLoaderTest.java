package cn.tx.ann_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextLoaderTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ParentConfig.class);
		Car car = (Car) context.getBean("toyota");
		car.print();
		Car car1 = (Car) context.getBean("BMW");
		car1.print();
	}
}
