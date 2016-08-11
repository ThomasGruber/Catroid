/*
 * Catroid: An on-device visual programming system for Android devices
 * Copyright (C) 2010-2016 The Catrobat Team
 * (<http://developer.catrobat.org/credits>)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * An additional term exception under section 7 of the GNU Affero
 * General Public License, version 3, is available at
 * http://developer.catrobat.org/license_additional_term
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.catrobat.catroid.content.bricks;

import android.util.Log;
import android.view.View;

import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;

import org.catrobat.catroid.R;
import org.catrobat.catroid.content.Project;
import org.catrobat.catroid.content.Sprite;
import org.catrobat.catroid.formulaeditor.Formula;

import java.util.List;

public class JumpingSumoRotateLeftBrick extends JumpingSumoRotateBrick {

	private static final long serialVersionUID = 1L;
	private static final String TAG = JumpingSumoRotateLeftBrick.class.getSimpleName();

	public JumpingSumoRotateLeftBrick(float degree) {
		super(degree);
	}

	public JumpingSumoRotateLeftBrick(Formula degree) {
		super(degree);
	}

	@Override
	protected String getBrickLabel(View view) {
		return view.getResources().getString(R.string.brick_jumping_sumo_rotate_left);
	}

	@Override
	public List<SequenceAction> addActionToSequence(Sprite sprite, SequenceAction sequence) {
		//Log.i(TAG, "Angel: take that way, young boy: " + getAngularDim());
		sequence.addAction(sprite.getActionFactory().createJumpingSumoRotateLeftAction(sprite,
				getFormulaWithBrickField(BrickField.JUMPING_SUMO_ROTATE)/*, getAngularDim()*/));
		return null;
	}

	@Override
	public void updateReferenceAfterMerge(Project into, Project from) {
	}
}
