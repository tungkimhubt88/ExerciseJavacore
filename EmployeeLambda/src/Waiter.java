public class Waiter extends Employee{
    private long compensate;



    @Override
    public long calculaorSalary() {
        return compensate + getBasicSalary() ;
    }

    public long getCompensate() {
        return compensate;
    }

    public void setCompensate(long compensate) {
        this.compensate = compensate;
    }

    public Waiter(int id, String name, int age, long basicSalary, long compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    @Override
    public String toString() {
        return super.toString() + "Waiter{" + "compensate=" + compensate + '}'  +" luong"+calculaorSalary();
    }
    public static  int compareName(Waiter o1,Waiter o2){
        return o1.getName().compareTo(o2.getName());
    }
    public static int compareSalary(Waiter o1,Waiter o2){
        return (int) (o1.getBasicSalary()-o2.getBasicSalary());
    }


}
