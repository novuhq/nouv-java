/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package co.novu.co.novu.sdk.utils;

import java.net.http.HttpRequest;
import java.util.function.BiPredicate;

/**
 * Public helper methods for use by customers and end-users.
 *
 */
public final class Helpers {

    /**
     * Returns an {@link HttpRequest.Builder} which is initialized with the 
     * state of the given {@link HttpRequest}. 
     * 
     * <p>Note that headers can be added and modified but not removed. To 
     * remove headers use {@link #copy(HttpRequest, BiPredicate)} (which applies
     * a filter to the headers while copying).
     * 
     * <p>Note also that this method is redundant from JDK 16 because the 
     * method {@code HttpRequest.newBuilder(HttpRequest)} is available.
     * 
     * @param request request to copy
     * @return a builder initialized with values from {@code request}
     */
    public static HttpRequest.Builder copy(HttpRequest request) {
        return Utils.copy(request);
    }
    
    /**
     * Returns an {@link HttpRequest.Builder} which is initialized with the 
     * state of the given {@link HttpRequest}.
     *
     * <p>Note that this method is redundant from JDK 16 because the 
     * method {@code HttpRequest.newBuilder(HttpRequest, BiPredicate)} is available.
      
     * @param request request to copy
     * @param filter selects which header key-values to include in the copied request
     * @return a builder initialized with values from {@code request}
     */
    public static HttpRequest.Builder copy(HttpRequest request, BiPredicate<String, String> filter) {
        return Utils.copy(request, filter); 
    }
}
