package com.greenfox.workshopdi;

import com.greenfox.workshopdi.colors.BlueColor;
import com.greenfox.workshopdi.colors.RedColor;
import com.greenfox.workshopdi.interfaces.MyColor;
import com.greenfox.workshopdi.services.Printer;
import com.greenfox.workshopdi.services.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkshopdiApplication implements CommandLineRunner {
	private SpellChecker checker;
	private Printer printer;
	private MyColor color;
	private RedColor red;

	public static void main(String[] args) {
		SpringApplication.run(WorkshopdiApplication.class, args);
	}

	@Autowired
	WorkshopdiApplication(SpellChecker checker, Printer printer,MyColor color) {
		this.checker = checker;
		this.printer = printer;
		this.color = color;
	}

	@Override
	public void run(String... args) throws Exception {
		checker.checkSpelling();
		printer.log("It's working");
		color.printColor();
	}

}


