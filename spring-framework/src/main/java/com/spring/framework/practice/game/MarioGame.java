package com.spring.framework.practice.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{
	
	public void up() {
		
		System.out.println("jump");
	}
	
public void down() {
		
		System.out.println("go down to the hole");
	}

public void left() {
	
	System.out.println("stop");
}

public void right() {
	
	System.out.println("move fast");
}

}
