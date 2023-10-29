package com.example.reactiveform;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Model {
    static SimpleStringProperty name;
    public static SimpleIntegerProperty value = new SimpleIntegerProperty();

    public Model(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public static String addStar()
    {
        String s = name.get();
        s+="*";
        name.set(s);
        return s;
    }

    public static String delLeft()
    {
        String s = name.get();
        if(!name.get().isEmpty())
        {
            s = s.substring(1);
            name.set(s);
        }
        return s;
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public int getValue() {
        return value.get();
    }

    public  SimpleIntegerProperty valueProperty() {
        return value;
    }

    public void setValue(int value) {
        this.value.set(value);
    }

    public static int increment()
    {
        int i = 1+value.get();
        value.set(1+value.get());
      return i;
    }

    public static int decrement()
    {

        int i = value.get()-1;
        value.set(-1+value.get());
        return i;
    }
}
