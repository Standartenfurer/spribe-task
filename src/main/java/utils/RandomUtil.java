package utils;


import net.datafaker.Faker;

/**
 * Utility to generate random test data
 */
public class RandomUtil {

    private static final Faker faker = new Faker();

    public static String getRandomUserName() {
        return faker.regexify("[a-z]{8,10}[0-9]{0,2}");
    }

    public static String getRandomPassword() {
        return faker.regexify("[a-z!@_]{8,10}[0-9]{0,2}");
    }

    public static Integer getRandomAge() {
        return faker.number().numberBetween(18, 90);
    }



}
