import com.kodilla.spring.basic.spring_dependency_injection.homework.DeliveryService;
import com.kodilla.spring.basic.spring_dependency_injection.homework.NotificationService;
import com.kodilla.spring.basic.spring_dependency_injection.homework.ShippingCenter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShippingCenterTestSuite {

    @Test
    void shouldReturnSuccessMessageWhenWeightIsLessThan30() {
        DeliveryService deliveryService = new DeliveryService();
        NotificationService notificationService = new NotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);

        String result = shippingCenter.sendPackage("Test Address", 29.99);
        assertEquals("Package delivered to: Test Address", result);
    }

    @Test
    void shouldReturnFailureMessageWhenWeightIsMoreThan30() {
        DeliveryService deliveryService = new DeliveryService();
        NotificationService notificationService = new NotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);

        String result = shippingCenter.sendPackage("Test Address", 30.01);
        assertEquals("Package not delivered to: Test Address", result);
    }
}
