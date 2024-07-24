package com.mycompany.traintrack.client.app;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.mycompany.traintrack.client.igu.Test;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.UIManager;



public class TrainTrack {

    public static void main(String[] args) {
        FlatMacLightLaf.setup();

        UIManager.put( "Component.arrowType", "chevron" );
        UIManager.put( "Component.focusWidth", 0 );
        UIManager.put( "Component.innerFocusWidth", 0 );

        //Estilos de Scrollbar
        UIManager.put( "ScrollBar.trackArc", 999 );
        UIManager.put( "ScrollBar.thumbArc", 999 );
        UIManager.put( "ScrollBar.trackInsets", new Insets( 2, 4, 2, 4 ) );
        UIManager.put( "ScrollBar.thumbInsets", new Insets( 2, 2, 2, 2 ) );
        UIManager.put( "ScrollBar.track", new Color( 0xe0e0e0 ) );
        
        
        new Test();
    }
}
