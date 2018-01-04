package org.usfirst.frc.team4001.robot.subsystems;

import org.usfirst.frc.team4001.robot.ElectricalConstants;
import org.usfirst.frc.team4001.robot.commands.ArcadeDrive;



import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;

/**
 * Implementation of a basic 4 Victor motor {@link DriveTrain}
 * @author eric
 *@see DriveTrain
 */
public class DriveTrain4Victor extends DriveTrain {
	
	private Victor frontLeftMotor;
	private Victor frontRightMotor;
	private Victor rearLeftMotor;
	private Victor rearRightMotor;
	
	
	
	public DriveTrain4Victor() {
		
		//Initialize motors
		frontLeftMotor = new Victor(ElectricalConstants.DRIVETRAIN_FRONT_LEFT);
		frontLeftMotor.setInverted(ElectricalConstants.DRIVETRAIN_FRONT_LEFT_REVERSE);
		
		frontRightMotor = new Victor(ElectricalConstants.DRIVETRAIN_FRONT_RIGHT);
		frontRightMotor.setInverted(ElectricalConstants.DRIVETRAIN_FRONT_RIGHT_REVERSE);
		
		rearLeftMotor = new Victor(ElectricalConstants.DRIVETRAIN_REAR_LEFT);
		rearLeftMotor.setInverted(ElectricalConstants.DRIVETRAIN_REAR_LEFT_REVERSE);
		
		rearRightMotor = new Victor(ElectricalConstants.DRIVETRAIN_REAR_RIGHT);
		rearRightMotor.setInverted(ElectricalConstants.DRIVETRAIN_REAR_RIGHT_REVERSE);
		
		//initialize Drive Train
		drive = new RobotDrive(frontLeftMotor, rearLeftMotor,frontRightMotor , rearRightMotor);
				
		
	}
	

	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new ArcadeDrive());
	}

	@Override
	public void runLeftDrive(double power) {
		frontLeftMotor.set(power);
		rearLeftMotor.set(power);
	}
	

	@Override
	public void runRightDrive(double power) {
		frontRightMotor.set(power);
		rearRightMotor.set(power);
	}

}
