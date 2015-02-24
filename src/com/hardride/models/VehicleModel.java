/*
 * Hard Ride
 * 
 * Copyright (C) 2014
 *
 */

package com.hardride.models;

import com.hardride.models.base.Model;

import android.content.Context;

public class VehicleModel extends Model {
	
    public VehicleModel(Context context) 
    {
    	super("vehicleHi.obj", context);
    	    	
    	mCollisionRectSizeX = 8.0f;
    	mCollisionRectSizeZ = 10.0f;
    }
}
