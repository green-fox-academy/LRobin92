package com.greenfox.workshopdi.colors;

import com.greenfox.workshopdi.interfaces.MyColor;
import com.greenfox.workshopdi.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class RedColor implements MyColor {
  private Printer printer;

  public RedColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("It's red");
  }
}
