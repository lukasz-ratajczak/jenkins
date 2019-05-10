package pl.stormit;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class GreeterFacadeTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(TimeService.class)
                .addClass(GreeterFacade.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }
    @Inject
    GreeterFacade greeterFacade;

    @Test
    public void shouldReturnProperTime(){

    }
}
