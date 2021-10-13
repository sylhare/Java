package mockito;

import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import mockito.Dep.*;

@MockitoSettings(strictness = Strictness.LENIENT)
class ComplexServiceTest {

    @Mock
    private A a;
    @Mock
    private B b;
    @Spy
    private C c;
    @Spy
    @InjectMocks
    private SimpleService simpleService;
    @InjectMocks
    private ComplexService complexService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        doCallRealMethod().when(a).doStuff();
        doCallRealMethod().when(b).doStuff();
        doCallRealMethod().when(c).doStuff();
    }

    @Test
    void complexLogicRealNoInjectionTest() {
        SimpleService ss = new SimpleService();
        ss.depA = a;
        ComplexService cs = new ComplexService();
        cs.set(b, c, ss);
        cs.complexLogic();

        verify(b).doStuff();
        verify(c).doStuff();
        verify(a).doStuff();
    }

    @Test
    void simpleLogic() {
        simpleService.simpleLogic();
        verify(a).doStuff();
        verify(simpleService).simpleLogic();
    }

    @Test
    void complexLogic() {
        complexService.complexLogic();
        verify(b).doStuff();
        verify(c).doStuff();
        verify(a).doStuff();
        verify(simpleService).simpleLogic();
    }
}
