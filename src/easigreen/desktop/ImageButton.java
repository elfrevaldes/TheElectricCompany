package easigreen.desktop;

import easigreen.service.*;
import easigreen.system.*;

import javafx.event.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * This class lets you use an image as a button, but still lets you see
 * when it's being pressed. This code is being borrowed from blogmeister at tech.chitgoks.com
 * I've changed it a bit
 */
public class ImageButton extends Button
{

    /**
     * Style for when a button is normal
     */
    private final String STYLE_NORMAL = "-fx-background-color: transparent; -fx-padding: 5, 5, 5, 5;";

    /**
     * Style for whena button is pressed
     */
    private final String STYLE_PRESSED = "-fx-background-color: transparent; -fx-padding: 6 4 4 6;";

    /**
     * Constructor for Image Button
     *
     * @param imageurl the url for an image the button will look like
     */
    public ImageButton(String imageurl) 
    {
	Image     image = ImageGetter.getImage(imageurl);
	ImageView graphic = new ImageView(image);
	setGraphic(graphic);
        setStyle(STYLE_NORMAL);
        
        setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
		public void handle(MouseEvent event) {
                setStyle(STYLE_PRESSED);
            }            
	    });
        
        setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
		public void handle(MouseEvent event) {
		setStyle(STYLE_NORMAL);
            }            
	    });
    }
    
}
