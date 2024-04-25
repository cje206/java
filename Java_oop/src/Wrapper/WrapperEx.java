package Wrapper;

public class WrapperEx {

	public static void main(String[] args) {
//		오토박싱: 기본 데이터 타입을 wrapper 클래스 객체로 자동 변환(int -> Integer)
		Integer integerValue = 5; // == Integer.valueOf(5);
		
//		오토언박싱: wrapper 클래스 객체를 기본 데이터 타입으로 자동 변환(Integer -> int)
		int intValue = integerValue;
		
//		문자열으로 되어있는 숫자를 Integer로 변환
		Integer parseInt = Integer.parseInt("123456789");
		System.out.println(parseInt);
		
//		최대값
		Integer maxInt = Integer.max(10, 30);
		System.out.println(maxInt);
		
//		integer의 최대값
		Integer max = Integer.MAX_VALUE;
		System.out.println(max);
		
		Double parseDouble = Double.parseDouble("1111.2222");
		System.out.println(parseDouble);

	}

}
