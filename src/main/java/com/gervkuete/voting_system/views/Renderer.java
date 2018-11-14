
package com.gervkuete.voting_system.views;

import com.gervkuete.voting_system.models.Candidate;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;

public class Renderer extends DefaultListCellRenderer{
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean hasFocus) {
    JLabel renderer = (JLabel)(super.getListCellRendererComponent(list, value, index, isSelected, hasFocus));
    if (value instanceof Candidate) {
            Candidate candidate = (Candidate)value;
            String picture = candidate.getPicture();
            ImageIcon icon = new ImageIcon(picture);
            renderer.setText(candidate.getName() + "( " +candidate.getVoices()+ " voices)");
            renderer.setIcon(icon);
        }
        return renderer;
    }
}
