package collection;

class Box2<T>{
	T t;
}
//제네릭, Generic
//1. List<>  : 중복 상관 없이 줄세우기
//2. Set<>	 : 집합 중복x
//3. Map<>   : 키가 존재, 키와 밸류	=> 컬렉션 프레임워크

//배열은 고정값 
public class Box {
	PineApple pa1 = new PineApple();
	
	Apple[] apple = new Apple[10];
	
	Apple a1 = new Apple();
	Apple a2 = new Apple();
}
