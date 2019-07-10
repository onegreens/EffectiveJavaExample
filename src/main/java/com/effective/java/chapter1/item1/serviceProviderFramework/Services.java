package com.effective.java.chapter1.item1.serviceProviderFramework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
    public Services() {
    }

    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();
    private static final String DEFAULT_NAME = "def";

    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_NAME, p);
    }

    public static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    public static Provider getInstance() {
        return newInstance(DEFAULT_NAME);
    }

    public static Provider newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null)
            throw new IllegalArgumentException("No Provides registered with name :" + name);
        return p;

    }
}
