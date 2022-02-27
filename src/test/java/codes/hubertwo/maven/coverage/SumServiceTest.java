package codes.hubertwo.maven.coverage;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for {@link SumService}.
 */
class SumServiceTest {

    private static SumService sumService;

    @BeforeAll
    static void beforeAll() {
        SumServiceTest.sumService = new SumService();
    }

    @Test
    void sum() {
        assertEquals(5, sumService.sum(2, 3));
    }

}