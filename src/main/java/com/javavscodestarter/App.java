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
        String salt = "468d5ed7-3c2b-402c-b49b-92adea5d574d"; // https://www.uuidgenerator.net/
        String input = String.format("%s%s", rawValue, salt);
        System.out.println(String.format("The hash of %s with salt %s is:\n  %s.", rawValue, salt, hash(input)));
    }

    public static String hash(String rawValue) {
        String sha256hex = DigestUtils.sha256Hex(rawValue);
        return sha256hex;
    }
}
