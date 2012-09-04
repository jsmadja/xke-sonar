/* =======================================
 * JFreeChart : a Java Chart Class Library
 * =======================================
 * Version:         0.5.6;
 * Project Lead:    David Gilbert (david.gilbert@bigfoot.com);
 *
 * File:            HorizontalAxis.java
 * Author:          David Gilbert;
 * Contributor(s):  -;
 *
 * (C) Copyright 2000, Simba Management Limited;
 *
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation;
 * either version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this library;
 * if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 * MA 02111-1307, USA.
 *
 * $Id: HorizontalAxis.java,v 1.1.1.1.2.2 2000/11/14 21:29:06 dgilbert Exp $
 */

package com.jrefinery.chart;

import java.awt.*;
import java.awt.geom.*;

/**
 * An interface that must be supported by all horizontal axes - used for layout purposes.
 */
public interface HorizontalAxis {

  /**
   * Returns the area required to draw the axis in the specified draw area.
   * @param g2 The graphics device;
   * @param plot The plot that the axis belongs to;
   * @param drawArea The area within which the plot should be drawn;
   * @param reservedHeight The height reserved by the horizontal axis.
   */
  public Rectangle2D reserveAxisArea(Graphics2D g2, Plot plot, Rectangle2D drawArea,
                                     double reservedWidth);

  /**
   * Returns the height required to draw the axis in the specified draw area.
   * @param g2 The graphics device;
   * @param plot The plot that the axis belongs to;
   * @param drawArea The area within which the plot should be drawn.
   */
  public double reserveHeight(Graphics2D g2, Plot plot, Rectangle2D drawArea);

}
