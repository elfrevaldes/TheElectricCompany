package easigreen.desktop;

import easigreen.service.*;

import java.util.*;

import javafx.scene.control.*;
import javafx.scene.layout.*;

import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.text.*;

/**
 * Upgrade Item
 * @version 0.2.0
 * @author Haru McClellan
 */
public class UpgradeItem
    extends ContentComponent
{
    /**
     * Holds a reference to the model
     */
    protected SimCity mModel;

    /**
     * Gets the columns
     * @return integer array of columns
     */
    protected int[] getColumns()
    {
        return new int[] {15, 45, 25, 15};
    }

    /**
     * Gets the rows
     * @return integer array of rows
     */
    protected int[] getRows()
    {
        return new int[] {49, 17, 17, 17};
    }

    /**
     * Gets the title
     * @return the title a string
     */
    protected String getTitle()
    {
        return new String("Unknown");
    }

    /**
     * Gets the tips
     * @return String array of tips
     */
    protected String[] getTips()
    {
        return new String[] {"Unknown1", "Unknown2"};
    }

    /**
     * Holds the value label
     */
    protected Label mValue;
    
    /**
     * Holds the title label
     */
    protected Label mTitle;
    
    /**
     * Holds the map from string to labels
     */
    protected Map<String, Label> mTips;

    /**
     * Holds the up button
     */
    protected Button mUp;
    
    /**
     * Holds the down button
     */
    protected Button mDown;

    /**
     * Initializer
     */
    protected void init()
    {
        EventHandler<ActionEvent> upEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            }
        };
        EventHandler<ActionEvent> downEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            }
        };
        mUp   = new ImageButton("up.png"  , upEvent);
        mDown = new ImageButton("down.png", downEvent);
        mUp  .setPrefSize(0, 0);
        mDown.setPrefSize(0, 0);
        setHalignment(mUp  , HPos.CENTER);
        setHalignment(mDown, HPos.CENTER);
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public UpgradeItem(SimCity pModel)
    {
        super(pModel);
    }

    /**
     * Set up the items
     */
    protected void setup()
    {
        setLabels();
        add(mTitle, 0, 0, 3, 1);

        String[] tipNames = getTips();
        for (int i = 0; i < tipNames.length; i++) {
            add(mTips.get(tipNames[i]), 1, i + 1, 2, 1);
        }

        add(mValue, 2, 0, 1, 4);
        add(mUp   , 3, 0, 1, 1);
        add(mDown , 3, 1, 1, 3);
    }

    /**
     * Set up Labels
     */
    protected void setLabels()
    {
        mValue = new Label("?");
        mTitle = new Label(getTitle());
        mValue.setFont(new Font("Arial", 20));
        mTitle.setFont(new Font("Arial", 20));
        setHalignment(mValue, HPos.RIGHT);
        mTips = new HashMap<String, Label>();
        String[] tipNames = getTips();
        for (String tip : tipNames) {
            Label newTip = new Label(tip);
            newTip.setFont(new Font("Arial", 12));
            mTips.put(tip, newTip);
        }
        update();
    }

    /**
     * Updater
     */
    protected void update()
    {
        mValue.setText("0");
    }
}
