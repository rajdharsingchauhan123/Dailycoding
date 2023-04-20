package hunderedquestion.designpattern;

public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    public String toString(){
        return "RAM="+this.getRAM()+"HDD="+this.getCPU()+"CPU="+this.getCPU();
    }




}
class PC extends Computer{
    private String ram;
    private String hdd;
    private String cpu;

    public PC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return null;
    }

    @Override
    public String getHDD() {
        return null;
    }

    @Override
    public String getCPU() {
        return null;
    }
}
class Server extends Computer{

    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return null;
    }

    @Override
    public String getHDD() {
        return null;
    }

    @Override
    public String getCPU() {
        return null;
    }
}
class ComputerFactory{
    public static Computer getComputer(String type,String ram,String  hdd ,String cpu){
        if("PC".equalsIgnoreCase(type))return new PC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);


        return null;

    }


}
class TestFactory{

    public static void main(String[] args) {
        Computer pc=ComputerFactory.getComputer("Pc","2Gb","500gb","2.4ghz");

    }
}