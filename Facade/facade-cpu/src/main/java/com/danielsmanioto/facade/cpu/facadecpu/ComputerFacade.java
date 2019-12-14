public class ComputerFacade {
   private CPU cpu;
   private Memory memory;
   private HardDrive hardDrive;
 
   public ComputerFacade() {
	this.cpu = new CPU();
    	this.memory = new Memory();
	this.hardDrive = new HardDrive();	   
   }

   public void start() {
      this.cpu.freeze();
      this.memory.load();
      this.cpu.jump(1);	
   }
 
}
