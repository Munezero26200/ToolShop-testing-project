package customParameter;

import DomainObj.Email;
import DomainObj.Password;
import io.cucumber.java.ParameterType;

public class CustomParameterTypes {

    @ParameterType(".*")
    public Email email(String emailAddress){
        return new Email(emailAddress);
    }

    @ParameterType(".*")
    public Password password(String word){
        return new Password(word);
    }
}
