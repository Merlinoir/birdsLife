package view;

import modele.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AwtBirds {

    public static void main(String[] args) {
        new AwtBirds();
    }

    public AwtBirds() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }

                final JFrame frame = new JFrame("Spot");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                final Birds balls = new Birds();
                frame.add(balls);
                frame.setSize(400, 400);
                frame.setVisible(true);
                
              
              new Thread(new Runnable() {
				
				public void run() {
					  while (true)
		                {
		                	SwingUtilities.invokeLater(new Runnable() {
		                        public void run() {
		                            frame.repaint();
		                            
		                        }
		                    });
		                	try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		                }
				}
			}).start();

            }
        });
    }

    public static int random(int maxRange) {
        return (int) Math.round((Math.random() * maxRange));
    }

    public class Birds extends JPanel {

        private ArrayList<Bird> birdsUp;
        public ArrayList<Point> allPoint;
        private Bird myBird;
        public Birds() {
        	allPoint = new ArrayList<Point>();
            allPoint.add(new Point(10, 20)) ;
        	allPoint.add(new Point(10, 40)) ;
        	allPoint.add(new Point(10, 60)) ;
        	allPoint.add(new Point(10, 80)) ;
        	allPoint.add(new Point(10, 100)) ;
        	allPoint.add(new Point(10, 120)) ;
        	birdsUp = new ArrayList<Bird>(25);
            myBird = new Bird(new Color(5,5,99));
            for (int index = 0; index < 1; index++) {
                birdsUp.add(new Bird(new Color(random(255), random(255), random(255))));
            }
        }
        @Override
        protected void paintComponent(Graphics g) {
        	
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            for (Bird ball : birdsUp) {
                ball.paint(g2d);
            }

            

            for (Point unPoint : allPoint) {
            	myBird.setLocation(new Point(unPoint));
            	myBird.size=new Dimension(10,10);
                myBird.paint(g2d);
                myBird.setSpeed(new Point(200, 200));
                
            }
            g2d.dispose();
//            myBird.setLocation(new Point(i, j));
//            myBird.size=new Dimension(10,10);
//            i++;j++;
//            myBird.paint(g2d);
//            myBird.setSpeed(new Point(200, 200));
//            g2d.dispose();
        }

        public ArrayList<Bird> getBirds() {
            return birdsUp;
        }
    }

    public class Bird {

        private Color color;
        private Point location;
        private Dimension size;
        private Point speed;

        public Bird(Color color) {

            setColor(color);

            speed = new Point(10 - random(20), 10 - random(20));
            size = new Dimension(30, 30);

        }

        public Dimension getSize() {
            return size;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public void setLocation(Point location) {
            this.location = location;
        }

        public Color getColor() {
            return color;
        }

        public Point getLocation() {
            return location;
        }

        public Point getSpeed() {
            return speed;
        }

        public void setSpeed(Point speed) {
            this.speed = speed;
        }

        protected void paint(Graphics2D g2d) {

            Point p = getLocation();
            if (p != null) {
                g2d.setColor(getColor());
                Dimension size = getSize();
                g2d.fillOval(p.x, p.y, size.width, size.height);
            }

        }
    }
}
