package com.wuk.base;

import java.util.ServiceLoader;

public final class WkServiceLoader {
    private WkServiceLoader() {
    }

    public static <S> S load(Class<S> service) {
        try {
            return ServiceLoader.load(service).iterator().next();
        } catch (Exception e) {
            return null;
        }
    }
}
