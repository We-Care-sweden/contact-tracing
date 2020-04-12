package com.wecare.contacttracer;

public interface Status {
    int SUCCESS = 0;
    int FAILED_REJECTED_OPT_IN = 1;
    int FAILED_SERVICE_DISABLED = 2;
    int FAILED_BLUETOOTH_SCANNING_DISABLED = 3;
    int FAILED_TEMPORARILY_DISABLED = 4;
    int FAILED_INSUFFICENT_STORAGE = 5;
    int FAILED_INTERNAL = 6;
}
