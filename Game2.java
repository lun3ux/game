import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

@SuppressWarnings("serial")
public class Game2 extends JPanel implements KeyListener {

	private Image cat;
	private int x = 20, y = 20;

	public Game2() {
		cat = new ImageIcon("Assets/Characters/cat-black-back.png").getImage();
		setFocusable(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // Always call this first in paintComponent

		Graphics2D g2d = (Graphics2D) g;
		g.drawImage(cat, x, y, this);
		g2d.setColor(Color.RED);
		g2d.fillOval(0, 0, 30, 30);
		g2d.drawOval(0, 50, 30, 30);
		g2d.fillRect(50, 0, 30, 30);
		g2d.drawRect(50, 50, 30, 30);
		g2d.draw(new Ellipse2D.Double(0, 100, 30, 30));
	}


	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == java.awt.event.KeyEvent.VK_UP) {
			y -= 5;
		} else if (keyCode == java.awt.event.KeyEvent.VK_DOWN) {
			y += 5;
		} else if (keyCode == java.awt.event.KeyEvent.VK_LEFT) {
			x -= 5;
		} else if (keyCode == java.awt.event.KeyEvent.VK_RIGHT) {
			x += 5;
		}
		repaint();
	}	


	public static void main(String[] args) {
		JFrame frame = new JFrame("Untitled Game");
		Game2 spritePanel = new Game2();
		frame.add(spritePanel);
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		spritePanel.requestFocusInWindow();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
	}
}