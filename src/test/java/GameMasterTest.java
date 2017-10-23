import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertSame;

public class GameMasterTest {
    public void testSingleton() {
        GameMaster instance1 = GameMaster.instance();
        assertNotNull(instance1);
        GameMaster instance2 = GameMaster.instance();
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }
}
