/* =======================================
 * JFreeChart : a Java Chart Class Library
 * =======================================
 * Version:         0.5.6;
 * Project Lead:    David Gilbert (david.gilbert@bigfoot.com);
 *
 * File:            CategoryAxis.java
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
 * $Id: CategoryAxis.java,v 1.1.1.1.2.2 2000/11/14 21:29:06 dgilbert Exp $
 */

package com.jrefinery.chart;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.util.*;

/**
 * An axis that displays categories.  Used for bar charts and line charts.
 * <P>
 * The axis needs to rely on the plot for placement of labels, since the plot controls how the
 * categories are distributed.
 */
public abstract class CategoryAxis extends Axis {

  /**
   * Standard constructor: returns a new CategoryAxis with attributes as specified by the
   * caller.
   * @param label The axis label;
   * @param labelFont The font for displaying the axis label;
   * @param labelPaint The paint used to draw the axis label;
   * @param labelInsets Determines the amount of blank space around the label;
   * @param showCategoryLabels Flag indicating whether or not category (tick) labels are visible;
   * @param categoryLabelFont The font used to display category (tick) labels;
   * @param categoryLabelPaint The paint used to draw category (tick) labels;
   * @param showTickMarks Flag indicating whether or not tick marks are visible;
   * @param tickMarkStroke The stroke used to draw tick marks (if visible).
   */
  public CategoryAxis(String label, Font labelFont, Paint labelPaint, Insets labelInsets,
                      boolean showCategoryLabels, Font categoryLabelFont, Paint categoryLabelPaint,
                      Insets categoryLabelInsets, boolean showTickMarks, Stroke tickMarkStroke) {

    super(label, labelFont, labelPaint, labelInsets,
          showCategoryLabels, categoryLabelFont, categoryLabelPaint, categoryLabelInsets,
          showTickMarks, tickMarkStroke);

  }

  /**
   * Standard constructor - builds a category axis with default values for most attributes.
   * <P>
   * Note that this class is not intended to be instantiated directly - use a subclass.
   * @param label The axis label;
   */
  public CategoryAxis(String label) {
    super(label);
  }

}
