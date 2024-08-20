package DesignPatterns.Factory;

import DesignPatterns.Factory.componnet.button.Button;
import DesignPatterns.Factory.componnet.dropdown.DropDown;
import DesignPatterns.Factory.componnet.menu.Menu;

public interface UIFactory {
    // Factory Methods

    Button createButton();

    Menu createMenu();

    DropDown createDropDown();
}
