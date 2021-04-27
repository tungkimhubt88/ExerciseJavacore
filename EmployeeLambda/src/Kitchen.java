public class Kitchen extends Employee{
    private long serviceCharge;

    public Kitchen(int id, String name, int age, long basicSalary,long serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    @Override
    public long calculaorSalary() {
        return serviceCharge + getBasicSalary();
    }

    @Override
    public String toString() {
        return super.toString() + "Kitchen{" +
                "serviceCharge=" + serviceCharge +
                '}' + " luong"+calculaorSalary();
    }
}
