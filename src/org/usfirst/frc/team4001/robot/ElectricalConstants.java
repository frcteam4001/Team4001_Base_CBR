package org.usfirst.frc.team4001.robot;


/**
 * ElectricalConstants is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.  ALL VALUES MUST BE VERIFIED off the default base code.
 */
public class ElectricalConstants {
	
		// ************************************************************************
		// **************************  GAME CONTROLLERS  **************************
		// ************************************************************************
		
		public static final int GAMECONTROLLER_PRIMARY_PORT					= 0;
		
	
		// ************************************************************************
		// **************************  DRIVETRAIN  ********************************
		// ************************************************************************
		// TODO set motor ports
		public static final int DRIVETRAIN_FRONT_LEFT 						= -1;  // SET THIS
		public static final int DRIVETRAIN_FRONT_RIGHT 						= -1;  // SET THIS
		public static final int DRIVETRAIN_REAR_LEFT							= -1;  // SET THIS
		public static final int DRIVETRAIN_REAR_RIGHT 						= -1;  // SET THIS
		

		// Inverse state of drivetrain motors
		// TODO verify motor reverse settings
		public static final boolean DRIVETRAIN_FRONT_LEFT_REVERSE				= true;		// CHECK
		public static final boolean DRIVETRAIN_FRONT_RIGHT_REVERSE		 		= true;		// CHECK
		public static final boolean DRIVETRAIN_REAR_LEFT_REVERSE			 	= true;		// CHECK
		public static final boolean DRIVETRAIN_REAR_RIGHT_REVERSE			 	= true;		// CHECK
		
		
		//this needs to be set accordingly for distance calculations
		// TODO verify specifications for encoder calculations
		public static final int driveWheelRadius		 			= 3;//wheel radius in inches
		public static final int drivePulsePerRotation 				= 1024; //encoder pulse per rotation
		public static final double driveGearRatio 					= 1/1; //ratio between wheel and encoder
		public static final double driveEncoderPulsePerRot 			= drivePulsePerRotation*driveGearRatio; //pulse per rotation * gear ratio
		public static final double driveEncoderDistPerTick 			=(Math.PI*2*driveWheelRadius)/driveEncoderPulsePerRot;
		public static final boolean leftDriveTrainEncoderReverse 	= true;
		public static final boolean rightDriveTrainEncoderReverse 	= false;
		
		//***************************************************************************
		//****************************** DRIVE ENCODERS *****************************
		//***************************************************************************
		
		public static final int LEFT_DRIVE_ENCODER_A                            = -1; 		//SET
		public static final int LEFT_DRIVE_ENCODER_B                            = -1;		//SET
		
		public static final int RIGHT_DRIVE_ENCODER_A                           = -1;		//SET
		public static final int RIGHT_DRIVE_ENCODER_B                           = -1;		//SET
		

}
