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
 * A content pane for sim city
 *
 * @version 0.2.1
 * @author Sam Graham
 * @author Haru McClellan
 * @author Larson Caldwell
 */
public class FossilEngineering
    extends UpgradeItem
{
    /**
     * Gets the title of this 
     */
    protected String getTitle()
    {
        return new String("Fossil Fuel Engineering");
    }

    protected String[] getTips()
    {
        return new String[] {"+Fossil Fuel Security", "+Fossil Fuel Energy Produced"};
    }

    /**
     * Constructor
     * @param SimCity pModel the current sim city Model
     */
    public FossilEngineering(SimCity pModel)
    {
        super(pModel);
    }

    protected void update()
    {
	mChange = 0;
        mValue.setText("" + mModel.getUpgradeManager().getFossilEngineering());
    }
}
