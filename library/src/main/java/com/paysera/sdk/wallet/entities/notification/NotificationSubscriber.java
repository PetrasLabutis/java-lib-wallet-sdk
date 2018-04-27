package com.paysera.sdk.wallet.entities.notification;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
public class NotificationSubscriber {
    public static final String PRIVACY_LEVEL_HIGH = "high";
    public static final String PRIVACY_LEVEL_LOW = "low";

    public static final String STATUS_ACTIVE = "active";

    protected Integer id;
    protected String status = STATUS_ACTIVE;

    protected NotificationRecipient recipient;
    protected List<NotificationEvent> events = new ArrayList<>();
    protected String locale;
    protected String privacyLevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NotificationRecipient getRecipient() {
        return recipient;
    }

    public void setRecipient(NotificationRecipient recipient) {
        this.recipient = recipient;
    }

    public List<NotificationEvent> getEvents() {
        return events;
    }

    public void setEvents(List<NotificationEvent> events) {
        this.events.clear();
        this.events.addAll(events);
    }

    public void addEvent(NotificationEvent event) {
        this.events.add(event);
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getPrivacyLevel() {
        return privacyLevel;
    }

    public void setPrivacyLevel(String privacyLevel) {
        this.privacyLevel = privacyLevel;
    }

    public boolean isHighPrivacyLevel() {
        return this.getPrivacyLevel().equals(PRIVACY_LEVEL_HIGH);
    }

    public boolean hasEvent(NotificationEvent event) {
        for (NotificationEvent existingEvent : this.getEvents()) {
            if (existingEvent.equals(event)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean equals(Object object) {
        return
               object instanceof NotificationSubscriber
            && this.getPrivacyLevel().equals(((NotificationSubscriber) object).getPrivacyLevel())
            && this.getLocale().equals(((NotificationSubscriber) object).getLocale())
            && this.getRecipient().equals(((NotificationSubscriber) object).getRecipient())
            && this.getEvents().containsAll(((NotificationSubscriber) object).getEvents())
            && ((NotificationSubscriber) object).getEvents().containsAll(this.getEvents())
        ;
    }
}
