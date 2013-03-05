/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.draw2d.extras.translate;

import static com.google.common.base.Preconditions.checkNotNull;

import org.eclipse.draw2d.PositionConstants;

import com.vainolo.jdraw2d.HorizontalAlignment;

public enum JDraw2dToDraw2dTranslations {
  INSTANCE;

  public static int translateVerticalAlignment() {
    return 1;
  }

  public static int translateHorizontalAlignment(HorizontalAlignment hAlignment) {
    checkNotNull(hAlignment);
    switch(hAlignment) {
      case LEFT:
        return PositionConstants.LEFT;
      case CENTER:
        return PositionConstants.CENTER;
      case RIGHT:
        return PositionConstants.RIGHT;
      default:
        throw new IllegalArgumentException("Alignment " + hAlignment + " is not supported.");
    }
  }
}
