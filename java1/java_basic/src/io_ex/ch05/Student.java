package io_ex.ch05;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Student implements Serializable, Externalizable{
	// Object를 파일에 저장하고 싶을 때 -- FileOutString + FileObjectOutStream.
	// writeObject(Object) 를 사용
	// object는 읽기 힘들기 때문에 직렬화를 해주어야한다.
	// 직렬화 -- 클래스를 바이트 단위로 직렬화한다(010101010) -> Serializable 라고 함.

	private static final long serialVersionUID = 1L;
	// serialVersion => 고유 값
	
	// transient => 직렬화 할때 제외 하란 뜻. (데이터가 파일에 저장되지않는다.)
	
	String name;
	int age; 
	String tel;

	public Student() {
		
	}
	
	public Student(String name, int age, String tel) {
		this.name = name;
		this.age =  age;
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}

	

}
