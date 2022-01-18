package com.aserendipper.demo.book.zenofdesignpattern.designpattern.iteratorpattern.one;

public class Project implements IProject {
    //项目名称
    private String name = "";
    //项目成员数量
    private int num = 0;
    //项目费用
    private int cost = 0;
    //定义一个构造函数，把所有老板需要看到的信息存储起来
    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }
    //得到项目的信息
    @Override
    public String getProjectInfo() {
        String info = "";
        info = info + "项目名称是：" + this.name;
        info = info + "\t项目人数：" + this.num;
        info = info + "\t项目费用：" + this.cost;
        return info;
    }
}
