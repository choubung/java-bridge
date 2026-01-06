package bridge.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class BridgeOptionTest {
    @DisplayName("입력값에 따른 결과 반환 테스트")
    @ParameterizedTest(name = "입력 \"{0}\" -> 결과 {1}")
    @CsvSource({
            "U, UP",
            "D, DOWN"
    })
    void findByNameTest(String input, BridgeOption expected) {
        // when
        BridgeOption result = BridgeOption.findByName(input);

        // then
        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("입력값에 따른 결과 반환 테스트")
    @ParameterizedTest(name = "입력 \"{0}\" -> 결과 {1}")
    @CsvSource({
            "1, UP",
            "0, DOWN"
    })
    void findByDirectionTest(int input, BridgeOption expected) {
        // when
        BridgeOption result = BridgeOption.findByDirection(input);

        // then
        assertThat(result).isEqualTo(expected);
    }
}
