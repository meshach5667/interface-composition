public class Computer implements Electronic {

    public Computer(Storage storage, Processor cpu, RAM ram) {
        this.storage = storage;
        this.cpu = cpu;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", cpu=" + cpu +
                ", storage=" + storage +
                '}';
    }

    RAM ram;

    Processor cpu;

    Storage storage;

    @Override
    public boolean on() {
        return true;
    }

    @Override
    public boolean off() {
        return false;
    }

}
