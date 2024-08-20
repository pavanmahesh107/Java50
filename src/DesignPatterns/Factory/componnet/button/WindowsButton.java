package DesignPatterns.Factory.componnet.button;

public class WindowsButton implements Button{
    @Override
    public void showButton() {
        System.out.println("showing windows button");
    }

    @Override
    public void clickButton() {
        System.out.println("clicking windows button");
    }
}
