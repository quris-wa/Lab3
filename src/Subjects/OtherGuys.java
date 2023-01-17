package Subjects;

import Abstracts.IsSleeping;

public class OtherGuys {
    private String name;
    private IsSleeping isSleeping;
    public OtherGuys(String name, IsSleeping isSleeping){
        this.name = name;
        this.isSleeping=isSleeping;
        System.out.println(name + " присоедились к истории");
    }
    public void toSleep(){
        System.out.println(name + " уснули");
    }
    public String getIsSleeping() {
        return isSleeping.toString();
    }
    @Override
    public String toString() {
        return this.getIsSleeping();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ((OtherGuys) obj).getIsSleeping().equals(getIsSleeping());
    }

}
