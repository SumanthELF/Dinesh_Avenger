package Testing;

import org.testng.annotations.Test;

public class Testing1 {

	@Test
	public void dgi() {
		System.out.println("zephyr");
	}
	@Test
	public void dinesh(){
		System.out.println("euphonious");
	}
	@Test(priority=1)
	public void abd() {
		System.out.println("invincible");
	}
	public void aaronfinch() {
		System.out.println("powerhitting");//it will not execute as we didn't use @test
	}
	public void brendon() {
		System.out.println("destructable");//  ""
	}
	public void Dwarner() {
		System.out.println("delicate");//      ""
	}
	
}
