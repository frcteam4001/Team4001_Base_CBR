package org.usfirst.frc.team4001.robot;


/**
 * ElectricalConstants is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class ElectricalConstants {
	
		// ************************************************************************
		// **************************  GAME CONTROLLERS  **************************
		// ************************************************************************
		
		public static final int GAMECONTROLLER_PRIMARY_PORT					= 0;
		
		
	
		// ************************************************************************
		// **************************  DRIVETRAIN  ********************************
		// ************************************************************************
		public static final int DRIVETRAIN_FRONT_LEFT 						= 3;  
		public static final int DRIVETRAIN_FRONT_RIGHT 						= 1;  
		public static final int DRIVETRAIN_REAR_LEFT							= 4;  
		public static final int DRIVETRAIN_REAR_RIGHT 						= 2;  

		// Inverse state of drivetrain motors
		public static final boolean DRIVETRAIN_FRONT_LEFT_REVERSE			 = true;
		public static final boolean DRIVETRAIN_FRONT_RIGHT_REVERSE		 = true;
		public static final boolean DRIVETRAIN_REAR_LEFT_REVERSE			 = true;
		public static final boolean DRIVETRAIN_REAR_RIGHT_REVERSE			 = true;

}
