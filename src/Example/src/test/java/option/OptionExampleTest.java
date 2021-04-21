package option;

import static option.RandomNull.DATA;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.atMostOnce;
import static org.mockito.Mockito.verify;

import java.util.NoSuchElementException;
import java.util.Optional;

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
        given(mockDependency.supplyData()).willReturn(DATA);
        optionalExample.externalDependency = mockDependency;

        assertEquals(DATA, optionalExample.optionalOf());
        verify(mockDependency, atMostOnce()).supplyData();
    }

    @Test
    public void optionalOfFailureTest() {
        given(mockDependency.supplyData()).willReturn(null);
        optionalExample.externalDependency = mockDependency;

        assertThrows(NullPointerException.class, optionalExample::optionalOf);
        verify(mockDependency, atMostOnce()).supplyData();
    }

    @Test
    public void optionalNullOfDataTest() {
        given(mockDependency.supplyData()).willReturn(DATA);
        optionalExample.externalDependency = mockDependency;

        assertEquals(DATA, optionalExample.optionalNullOf());
        verify(mockDependency, atMostOnce()).supplyData();
    }

    @Test
    public void optionalNullOfNullTest() {
        given(mockDependency.supplyData()).willReturn(null);
        optionalExample.externalDependency = mockDependency;

        assertNull(optionalExample.optionalNullOf());
        verify(mockDependency, atMostOnce()).supplyData();
    }

    @Test
    public void optionalNullGetTest() {
        given(mockDependency.supplyData()).willReturn(null);
        optionalExample.externalDependency = mockDependency;

        Optional<String> value = optionalExample.dataWrapper();
        assertThrows(NoSuchElementException.class, value::get);
        verify(mockDependency, atMostOnce()).supplyData();
    }

    @Test
    void getDataTest() {
        given(mockDependency.supplyData()).willReturn(DATA);
        optionalExample.externalDependency = mockDependency;

        assertEquals(DATA.toUpperCase(), optionalExample.getData());
        verify(mockDependency, atMostOnce()).supplyData();
    }

    @Test
    void getDataNullTest() {
        given(mockDependency.supplyData()).willReturn(null);
        optionalExample.externalDependency = mockDependency;

        assertNull(optionalExample.getData());
        verify(mockDependency, atMostOnce()).supplyData();
    }
}
