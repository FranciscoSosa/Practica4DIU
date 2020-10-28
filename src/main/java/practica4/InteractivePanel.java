package practica4;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;


public class InteractivePanel extends JPanel{
    
    class Point{
        
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        
        private int x;
        private int y;
    }

    public InteractivePanel() {
        this.backgroundColor = Color.WHITE;
        this.foregroundColor = Color.BLACK;
        coordinates = new ArrayList<>();
    }
     
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(backgroundColor);
        this.setForeground(foregroundColor);
        for (Point coordinate : coordinates) {
            g.fillOval(coordinate.x, coordinate.y, 15, 15);
        }
        coordinates.clear();
    }

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setCircleColor(Color circleColor) {
        this.circleColor = circleColor;
    }
    
    public Color getForegroundColor() {
        return foregroundColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public Color getCircleColor() {
        return circleColor;
    }
    
    public void addCoordinate(int x, int y){
        coordinates.add(new Point(x, y));
    }
    
    public int coordinatesSize(){
        return coordinates.size();
    }
    
    private Color foregroundColor;
    private Color backgroundColor;
    private Color circleColor;
    private final List<Point> coordinates;
}