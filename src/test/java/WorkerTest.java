import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import production.Worker;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/test-application-context.xml")
public class WorkerTest {

    @Autowired
    private Worker worker;

    @Test
    public void getTools(){
        Assert.assertNotNull(worker);
        Assert.assertEquals(worker.getTools(), null);
    }
}