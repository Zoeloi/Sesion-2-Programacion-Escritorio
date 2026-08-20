package com.example.proyecto1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
  public static int sum (int n1, int n2){
      return n1+n2;
  }
    public static int sub (int n1, int n2){
        return n1-n2;
    }
    public static int mul (int n1, int n2){
        return n1*n2;
    }
    public static int div  (int n1, int n2){
        if (n2 != 0){
            return n1/n2;
        }
        return 0;
    }

}
