package com.javavscodestarter;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String rawValue = "some-customer@example-email-provider.com";
        System.out.println(String.format("The hash of %s is %s.", rawValue, hash(rawValue)));
    }

    public static String hash(String rawValue) {
        String sha256hex = DigestUtils.sha256Hex(rawValue);
        return sha256hex;
    }
}
