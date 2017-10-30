import junit.framework.TestCase;

public class GameMasterTest extends TestCase {
    public void testSingleton() {
        GameMaster instance1 = GameMaster.instance();
        assertNotNull(instance1);
        GameMaster instance2 = GameMaster.instance();
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }
}
