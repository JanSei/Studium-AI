package gui;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This class provides a panel for laying out labeled elements neatly with all
 * the labels and elements aligned down the screen.
 * 
 * @author David Fraser
 * @author Michael Harris
 * @author Erich Ehses
 */
@SuppressWarnings("serial")
public final class LabeledItemPanel extends JPanel {
    /** The row to add the next labeled item to */
    private int myNextItemRow = 0;

    /**
     * This method is the default constructor.
     */
    public LabeledItemPanel() {
        init();
    }

    /**
     * This method initializes the panel and layout manager.
     */
    private void init() {
        setLayout(new GridBagLayout());
        // Create a blank label to use as a vertical fill so that the
        // label/item pairs are aligned to the top of the panel and are not
        // grouped in the center if the parent component is taller than
        // the preferred size of the panel.
    }

    /**
     * This method adds a labeled item to the panel. The item is added to the
     * row below the last item added.
     * 
     * @param labelText
     *            The label text for the item.
     * @param item
     *            The item to be added.
     */
    public void addItem(String labelText, JComponent item) {
        JLabel label = new JLabel(labelText);

        GridBagConstraints labelConstraints = new GridBagConstraints();
        labelConstraints.gridx = 0;
        labelConstraints.gridy = myNextItemRow;
        labelConstraints.insets = new Insets(10, 10, 0, 0);
        labelConstraints.anchor = GridBagConstraints.NORTHEAST;
        labelConstraints.fill = GridBagConstraints.NONE;
        add(label, labelConstraints);

        // Add the component with its constraints
        if (item != null) {
            GridBagConstraints itemConstraints = new GridBagConstraints();
            itemConstraints.gridx = 1;
            itemConstraints.gridy = myNextItemRow;
            itemConstraints.insets = new Insets(10, 10, 0, 10);
            itemConstraints.weightx = 1.0;
            itemConstraints.anchor = GridBagConstraints.WEST;
            itemConstraints.fill = GridBagConstraints.HORIZONTAL;
            add(item, itemConstraints);
        }
        myNextItemRow++;
    }
}
