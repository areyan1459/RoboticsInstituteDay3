package frc.robot;


import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class Drive extends SubsystemBase{
        private CANSparkMax leftLeader = new CANSparkMax(0, MotorType.kBrushless);
        private CANSparkMax leftFollower = new CANSparkMax(0, MotorType.kBrushless);
        private CANSparkMax rightLeader = new CANSparkMax(0, MotorType.kBrushless);
        private CANSparkMax rightFollower = new CANSparkMax(0, MotorType.kBrushless);
        DifferentialDrive diffDrive;
    public Drive() {
        rightLeader.setInverted(true);
        
        rightFollower.follow(rightLeader);
        
        leftFollower.follow(leftLeader);

        
    }
    //meant to run every tick
    public void drive(double left, double right){
        diffDrive.tankDrive(left, right);
    }
}
