package edu.uw.meteorRush.impl;

import java.awt.Graphics;

import edu.uw.meteorRush.common.Entity;
import edu.uw.meteorRush.common.Game;
import edu.uw.meteorRush.common.Vector2;

public class Alien extends Entity {

	private static final int WIDTH = 250;
	private static final int HEIGHT = 250;

	double rand;

	public Alien(Vector2 position) {
		super(position, new Vector2(WIDTH, HEIGHT));
		rand = 6 * Math.random();
	}

	@Override
	public void render(Graphics g) {
		Vector2 position = getPosition();
		g.drawImage(Assets.ALIEN, (int) (position.getX() - WIDTH / 2.0), (int) (position.getY() - HEIGHT / 2.0), null);
	}

	@Override
	public void tick() {
		Vector2 position = getPosition();
		position.setY(250 * Math.sin(rand + 2 * Game.getInstance().getTime()) + 250);
		position.add(-300 * Game.getInstance().getDeltaTime(), 0);
		setPosition(position);
	}

	@Override
	public void onCollisionEnter(Entity other) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onCollisionExit(Entity other) {
		// TODO Auto-generated method stub

	}

}