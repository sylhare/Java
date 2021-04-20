package option;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.atMostOnce;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OptionExampleTest {

    @Mock
    private RandomNull mockDependency;

    private final OptionExample optionalExample = new OptionExample();

    @Test
    public void optionalOfTest() {
        given(mockDependency.doStuff()).willReturn("Value");
        optionalExample.externalDependency = mockDependency;

        assertEquals("Value", optionalExample.optionalOf());
        verify(mockDependency, atMostOnce()).doStuff();
    }

    @Test
    public void optionalOfNullTest() {
        given(mockDependency.doStuff()).willReturn(null);
        optionalExample.externalDependency = mockDependency;

        assertThrows(NullPointerException.class, optionalExample::optionalOf);
        verify(mockDependency, atMostOnce()).doStuff();
    }
}
