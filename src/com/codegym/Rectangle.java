package com.codegym;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {    // phuong thuc khoi tao khong tham so

    }

    // phuong thuc khoi tao co tham so
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // xay dung ham get set
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //xay dung phuong thuc tinh dient ich
    public int area() {
        return this.width * this.height;
    }

    // chu vi
    public int perimeter() {
        return (this.width + this.height) * 2;
    }
    // ham hien thi thong tin
    public String display(){
        return "Rectangle{"+"Width= "+width+" Height= "+ height+"}";
    }
}
