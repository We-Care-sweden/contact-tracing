package com.wecare.contacttracer;

import java.util.Date;

public interface ContactInfo {
    /** Day-level resolution that the contact occurred. */
    Date contactDate();

    /** Length of contact in 5 minute increments. */
    int duration();
}
