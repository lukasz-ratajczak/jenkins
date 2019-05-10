package pl.stormit;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.annotation.PostConstruct;
import javax.ejb.TimerService;
import javax.inject.Inject;

@RunWith(Arquillian.class)
public class TimeServiceTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(TimeService.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }
    @Inject
    TimeService timeService;


    @Test
    public void shouldReturnProperTime(){

    }


}
