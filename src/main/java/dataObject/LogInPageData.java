package dataObject;

import com.github.javafaker.Faker;

public interface LogInPageData {
    Faker faker = new Faker();
    String
            textIncorectLogIn = ("მომხმარებელი ან პაროლი არასწორია"),
        userNumber = faker.number().digits(5),
        userPassword = faker.internet().password();



}
