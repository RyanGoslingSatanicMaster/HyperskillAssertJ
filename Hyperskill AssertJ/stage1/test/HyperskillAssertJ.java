import org.hyperskill.hstest.dynamic.DynamicTest;
import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.CheckResult;

public class HyperskillAssertJ extends StageTest {
    @DynamicTest
    CheckResult test() {
        return CheckResult.correct();
    }
}
