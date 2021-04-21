package option;

import static option.RandomNull.DATA;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
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
        given(mockDependency.getData()).willReturn(DATA);
        optionalExample.externalDependency = mockDependency;

        assertEquals(DATA, optionalExample.optionalOf());
        verify(mockDependency, atMostOnce()).getData();
    }

    @Test
    public void optionalOfFailureTest() {
        given(mockDependency.getData()).willReturn(null);
        optionalExample.externalDependency = mockDependency;

        assertThrows(NullPointerException.class, optionalExample::optionalOf);
        verify(mockDependency, atMostOnce()).getData();
    }

    @Test
    public void optionalNullOfDataTest() {
        given(mockDependency.getData()).willReturn(DATA);
        optionalExample.externalDependency = mockDependency;

        assertEquals(DATA, optionalExample.optionalNullOf());
        verify(mockDependency, atMostOnce()).getData();
    }

    @Test
    public void optionalNullOfNullTest() {
        given(mockDependency.getData()).willReturn(null);
        optionalExample.externalDependency = mockDependency;

        assertNull(optionalExample.optionalNullOf());
        verify(mockDependency, atMostOnce()).getData();
    }
}
