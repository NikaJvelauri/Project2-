package DataBaseActions;

import com.github.javafaker.Faker;

public class GenerateData {
    static Faker faker = new Faker();


    public static String firstName = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String number = faker.address().buildingNumber();
    public static String password = faker.internet().password();
    public static String address = faker.address().streetAddress();
    public static String email = faker.internet().emailAddress();
    public static String country = faker.address().country();
    public static String state = faker.address().state();
    public static String city = faker.address().city();
    public static String zip = faker.address().zipCode();
    public static String shortZip = zip.substring(0,5); //zogi ZipCodes ar amatedbda bazashi grdzeliao da ese marto pirvel 5 cifrs vchri






}
