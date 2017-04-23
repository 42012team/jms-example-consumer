package com.util;

/**
 *
 * @author nik
 */
public final class ViewHelper {

    private ViewHelper() { }

    public static String getValuesAsString() {
        if(InMemoryStorage.getValues().size()>0)
            return InMemoryStorage.getValues().get(InMemoryStorage.getValues().size()-1); else
            return null;
    }
}