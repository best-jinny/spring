package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component	// 해당 클래스가 스프링에서 관리해야 하는 대상임을 표시
@Data		//
public class Restaurant {
	// Restaurant 객체는 Chef 타입의 객체를 필요로 한다(Restaurant 클래스에 Chef 주입)
	@Setter(onMethod_ = @Autowired) // 자동으로 setChef()를 컴파일 시 생성
	private Chef chef;
}
