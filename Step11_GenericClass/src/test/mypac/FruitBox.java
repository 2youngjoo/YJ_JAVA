package test.mypac;
/*
 *  클래스 안에서 사용하는 특정 type을 고정하지 않고
 *  
 *  클래스를 사용하는 시점에 type을 정할 수 있게 할 수 있다.
 *  
 *  - 아래 선언한 T는 마음대로 스펠링이나 단어를 정할 수 있다.
 *    보통 type 이라는 의미에서 T라고 많이 정한다.
 *    
 *    - T를 포괄 클래스(Generic Class)라고 한다.
 */

// 가상의 과일 박스
// 상황에 따라사 <T, T2>이렇게 두개도 생성 가능
public class FruitBox<T> { // <T> 클래스 안에서 필요한 때 원하는 타입을 전달 받아서 사용
	// 필드
	private T item;
	
	// 과일을 포장하는 메소드
	public void pack(T item) {
		this.item=item;
	}
	
	// 과일을 리턴하는 메소드
	public T unPack() {
		return item;
	}
}
