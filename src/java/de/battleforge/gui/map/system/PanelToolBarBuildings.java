/* This software is free; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package de.battleforge.gui.map.system;

import javax.swing.JButton;

import de.battleforge.action.ACTIONS;
import de.battleforge.action.ActionManager;
import de.battleforge.gui.map.AbstractToolBarPanel;

public class PanelToolBarBuildings extends AbstractToolBarPanel {

    public PanelToolBarBuildings() {
        super();
    }

    @Override
    protected JButton[] getButtons() {
        return new JButton[] { new JButton(ActionManager.getAction("", "Einheit bauen", "arrowRight.png", ACTIONS.BUILD_UNIT)) };
    } // getButtons

    /*
     * protected int getDefaultButtonIndex() { return 1; } //
     * getDefaultButtonIndex
     */
}