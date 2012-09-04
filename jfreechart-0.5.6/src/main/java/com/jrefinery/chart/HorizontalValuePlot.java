/* =======================================
 * JFreeChart : a Java Chart Class Library
 * =======================================
 * Version:         0.5.6;
 * Project Lead:    David Gilbert (david.gilbert@bigfoot.com);
 *
 * File:            HorizontalValuePlot.java
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
 * $Id: HorizontalValuePlot.java,v 1.1.1.1.2.2 2000/11/14 21:29:06 dgilbert Exp $
 */

package com.jrefinery.chart;

/**
 * An interface defining methods for interrogating a plot that displays values along the
 * horizontal axis;
 * <P>
 * Used by horizontal axes (when auto-adjusting the axis range) to determine the minimum and
 * maximum data values.
 */
public interface HorizontalValuePlot {

  /**
   * Returns the minimum value in either the domain or the range, whichever is displayed against
   * the horizontal axis for the particular type of plot implementing this interface.
   */
  public Number getMinimumHorizontalDataValue();

  /**
   * Returns the maximum value in either the domain or the range, whichever is displayed against
   * the horizontal axis for the particular type of plot implementing this interface.
   */
  public Number getMaximumHorizontalDataValue();

}