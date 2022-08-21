package com.coisini.design.pattern.structural.flyweight.book;

//白色棋子类：具体享元类
public class WhiteIgoChessman extends IgoChessman {
    @Override
    public String getColor() {
        return "白色";
    }
}
