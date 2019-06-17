package cn.tx.ann_demo;

import org.springframework.stereotype.Component;

@Component
public class Toyota implements Car{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("我是一个丰田");
	}

}
