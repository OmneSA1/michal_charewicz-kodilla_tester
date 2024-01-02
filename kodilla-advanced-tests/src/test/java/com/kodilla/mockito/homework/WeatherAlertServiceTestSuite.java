package com.kodilla.mockito.homework;
import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class WeatherAlertServiceTestSuite {
        WeatherAlertService service;
        Client client;
        Notification notification;
        String location;

        @BeforeEach
        void setUp() {
            service = new WeatherAlertService();
            client = mock(Client.class);
            notification = mock(Notification.class);
            location = "Warsaw";
        }

        @Test
        public void clientSubscribedToLocationShouldReceiveAlert() {
            service.subscribe(client, location);
            service.sendAlert(notification, location);

            verify(client).receive(notification);
        }

        @Test
        public void clientNotSubscribedToLocationShouldNotReceiveAlert() {
            service.sendAlert(notification, location);

            verify(client, never()).receive(notification);
        }

        @Test
        public void clientUnsubscribedFromLocationShouldNotReceiveAlert() {
            service.subscribe(client, location);
            service.unsubscribe(client, location);
            service.sendAlert(notification, location);

            verify(client, never()).receive(notification);
        }

        @Test
        public void clientUnsubscribedFromAllShouldNotReceiveAnyAlerts() {
            service.subscribe(client, location);
            service.unsubscribeFromAll(client);
            service.sendAlert(notification, location);

            verify(client, never()).receive(notification);
        }

        @Test
        public void allSubscribedClientsShouldReceiveAlert() {
            Client secondClient = mock(Client.class);
            service.subscribe(client, location);
            service.subscribe(secondClient, location);
            service.sendAlert(notification, location);

            verify(client).receive(notification);
            verify(secondClient).receive(notification);
        }

        @Test
        public void alertShouldBeSentToAllClientsRegardlessOfLocation() {
            Client secondClient = mock(Client.class);
            service.subscribe(client, "Location1");
            service.subscribe(secondClient, "Location2");
            service.sendAlertToAll(notification);

            verify(client).receive(notification);
            verify(secondClient).receive(notification);
        }

        @Test
        public void deletingLocationShouldStopSendingAlertsToThatLocation() {
            service.subscribe(client, location);
            service.deleteLocation(location);
            service.sendAlert(notification, location);

            verify(client, never()).receive(notification);
        }
    }

