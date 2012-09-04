/* =======================================
 * JFreeChart : a Java Chart Class Library
 * =======================================
 * Version:         0.5.6;
 * Project Lead:    David Gilbert (david.gilbert@bigfoot.com);
 *
 * File:            PlotFitAlgorithm.java
 * Author:          Matthew Wright;
 * Contributor(s):  David Gilbert;
 *
 * (C) Copyright 2000, by Matthew Wright;
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
 * $Id: PlotFitAlgorithm.java,v 1.1.2.1 2000/11/14 00:22:06 dgilbert Exp $
 *
 */

package com.jrefinery.chart.data;

import com.jrefinery.chart.*;
import com.jrefinery.chart.ui.*;
import com.jrefinery.util.ui.*;

/**
 * an interface that any PlotFit needs to use to get the curve
 * for the plot fit.  The algorithm takes an XYDataSource and
 * comes up with a plot fit formula.  Then, using this formula,
 * it must return a y for any x supplied.  The PlotFit class is
 * responsible for querying the PlotFitAlgorithm for the data points
 * in order to get the curve to display.
 */
public interface PlotFitAlgorithm {

  /** @return the name that you want to see in the legend.
   *	This is prepended to the series name that generated
   *	this plot i.e. for "Chicago Moving Average" , the name
   *	would be, "Moving Average" and "Chicago" would be the
   *	name of the series that generated the moving average.
   */
  public String getName();

  /** this Algorithm might or might not need an XYDataSource to be relevant
   *  @param ds the XYDataSource for this PlotFit
   */
  public void setXYDataSource(XYDataSource ds);

  /**
   * for a given x, must return a y
   * @param x the x value
   * @param i the series
   * @return the y value
   */
  public Number getY(int i, Number x);

}