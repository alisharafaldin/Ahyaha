
package controls;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JTextField;

public class JMyButton extends JButton{
    
    public JMyButton(){
        setOpaque(false);
        setContentAreaFilled(false); // رسم البوتن بشكل بيضاوي
        setForeground(Color.white); //لون النص داخل البوتن
        setCursor(new Cursor(Cursor.HAND_CURSOR)); // إظهار اليد مع الماوس عند الوقوف ع البوتن
    }
    @Override
    protected void paintComponent(Graphics g){
        g.setColor(new Color(70, 130, 180));
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
        super.paintComponent(g);
    }
    
    @Override
    protected void paintBorder(Graphics g){
        g.setColor(Color.BLUE);
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
    }
            
}
