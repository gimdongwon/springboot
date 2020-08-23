package com.dongwon.book.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트(){
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // assertThat 는 테스트 검증 라이브러리의 검증 메소드이다.
        // 여기서의 assertThat은 junit의 기본 assertTaht이 아닌 assertj의 assertThat인데
        // coreMatchers와 달리 추가적으로 라이브러리가 필요하지 않다.
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
