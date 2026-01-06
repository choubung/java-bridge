package bridge.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ValidatorTest {
    @DisplayName("유효하지 않은 다리 길이 예외 처리")
    @ParameterizedTest(name = "입력값 \"{0}\" 일 때 예외 발생")
    @ValueSource(strings = {"2", " ", "abc", "!", "22"})
    void parseBridgeLengthExceptionTest(String input) {
        assertThatThrownBy(() -> {
            Validator.parseBridgeLength(input);
        })
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("다리 길이 정상 입력 시 예외가 발생하지 않는다")
    @ParameterizedTest(name = "입력값 \"{0}\" 통과")
    @ValueSource(strings = {"3", "17", "20"})
    void parseBridgeLengthNoExceptionTest(String input) {
        assertThatCode(() -> {
            Validator.parseBridgeLength(input);
        })
                .doesNotThrowAnyException();
    }

    @DisplayName("유효하지 않은 이동 옵션 예외 처리")
    @ParameterizedTest(name = "입력값 \"{0}\" 일 때 예외 발생")
    @ValueSource(strings = {"2", " ", "Q", "!", "가", "u", "d"})
    void validateIsOptionExceptionTest(String input) {
        assertThatThrownBy(() -> {
            Validator.validateIsOption(input);
        })
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("이동 옵션 정상 입력 시 예외가 발생하지 않는다")
    @ParameterizedTest(name = "입력값 \"{0}\" 통과")
    @ValueSource(strings = {"U", "D"})
    void validateIsOptionNoExceptionTest(String input) {
        assertThatCode(() -> {
            Validator.validateIsOption(input);
        })
                .doesNotThrowAnyException();
    }

    @DisplayName("유효하지 않은 재시작/종료 명령어 예외 처리")
    @ParameterizedTest(name = "입력값 \"{0}\" 일 때 예외 발생")
    @ValueSource(strings = {"2", " ", "U", "!", "가", "r", "q"})
    void validateIsCommandExceptionTest(String input) {
        assertThatThrownBy(() -> {
            Validator.validateIsCommand(input);
        })
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("재시작/종료 명령어 정상 입력 시 예외가 발생하지 않는다")
    @ParameterizedTest(name = "입력값 \"{0}\" 통과")
    @ValueSource(strings = {"R", "Q"})
    void validateIsCommandNoExceptionTest(String input) {
        assertThatCode(() -> {
            Validator.validateIsCommand(input);
        })
                .doesNotThrowAnyException();
    }
}
