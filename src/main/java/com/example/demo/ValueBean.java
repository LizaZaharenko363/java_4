package com.example.demo;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.io.Serializable;

@Named("valueBean")
@SessionScoped
public class ValueBean implements Serializable {

    @Size(min = 3, max = 50, message = "Value must be between 3 and 50 characters")
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Value can only contain letters, numbers, and spaces")
    private String value;

    public ValueBean() {
        this.value = "change me";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String updateValue() {
        FacesContext context = FacesContext.getCurrentInstance();

        context.addMessage(null, new FacesMessage(
                FacesMessage.SEVERITY_INFO,
                "Success",
                "Value updated successfully"
        ));

        return null;
    }
}
