package DesignPatterns.Factory.componnet.button;

public class IOSButton implements Button{
    @Override
    public void showButton() {
        System.out.println("showing IOS Button");
    }

    @Override
    public void clickButton() {
        System.out.println("clicking IOS button");
    }
}
