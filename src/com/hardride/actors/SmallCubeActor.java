/*
 * Hard Ride
 * 
 * Copyright (C) 2014
 *
 */

package com.hardride.actors;

import com.hardride.actors.base.Actor;
import com.hardride.models.SmallCubeModel;
import com.hardride.models.base.Model;

import android.content.Context;

public class SmallCubeActor extends Actor {
	
	protected static Model msModel;
	
	public SmallCubeActor(Context context) {
		super(context);
		
		if (msModel == null) {
			msModel = new SmallCubeModel(context);
		}
		
		setModel(msModel);
	}
	
   public SmallCubeActor(Context context, float x, float y, float z, float yaw, float pitch, float roll) {
		super(context, x, y, z, yaw, pitch, roll);
		
		if (msModel == null) {
			msModel = new SmallCubeModel(context);
		}
		
		setModel(msModel);		   
   }
}
