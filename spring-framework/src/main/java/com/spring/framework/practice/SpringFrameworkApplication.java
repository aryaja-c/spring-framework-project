package com.spring.framework.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.framework.practice.enterprise.web.WebController;
import com.spring.framework.practice.game.GameRunner;
import com.spring.framework.practice.game.GamingConsole;
import com.spring.framework.practice.game.MarioGame;
import com.spring.framework.practice.game.PacManGame;
import com.spring.framework.practice.game.SuperContraGame;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringFrameworkApplication.class, args);
		
		
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
//		GamingConsole game = new PacManGame();
//		GameRunner runner = new GameRunner(game);
		
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		WebController controller = context.getBean(WebController.class);
		System.out.println(controller.returnBusinnessValue());
	}

}
