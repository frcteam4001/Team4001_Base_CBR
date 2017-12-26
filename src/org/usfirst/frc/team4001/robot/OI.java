package org.usfirst.frc.team4001.robot;

import edu.wpi.first.wpilibj.buttons.Button;

import com.team4001.lib.util.Gamepad;
import org.usfirst.frc.team4001.robot.ElectricalConstants;;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	/**
	 * The primary game controller (driver controller).  Gamepad controller mappings based on Logitech F310 controller.
	 * @see Gamepad
	 */
	public Gamepad game_controller;
	
	// declare primary controller buttons
	

		
	/**
	 * Instantiate controller objects and bind buttons to commands.
	 */
	public OI() {
		// instantiate game controllers
		game_controller = new Gamepad(ElectricalConstants.GAMECONTROLLER_PRIMARY_PORT);
		
		// bind game_controller buttons to commands
		
		
	}
}
