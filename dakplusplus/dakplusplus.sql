CREATE TABLE `Employees` (
	`EmployeeID` INT NOT NULL AUTO_INCREMENT,
	`FirstName` VARCHAR(20) NOT NULL,
	`LastName` VARCHAR(20) NOT NULL,
	`PhoneNumber` VARCHAR(12),
	`EmergencyPhoneNumber` VARCHAR(12),
	`BithDate` VARCHAR(10),
	`Wage` DOUBLE,
	PRIMARY KEY (`EmployeeID`)
) ENGINE=InnoDB;

-- -----------------------------------------------------------------------------
-- - Construction of the Projects table                                    ---
-- -----------------------------------------------------------------------------

CREATE TABLE `Projects` (
	`ProjectID` INT NOT NULL AUTO_INCREMENT,
	`StartDate` VARCHAR(10),
	`Description` VARCHAR(255),
	`Price` DOUBLE,
	`EndDate` VARCHAR(10),
	PRIMARY KEY (`ProjectID`)
) ENGINE=InnoDB;


-- -----------------------------------------------------------------------------
-- - Construction of the workdone association table              ---
-- -----------------------------------------------------------------------------

CREATE TABLE WorkDone (
    EmployeeID   INT  NOT NULL,
    ProjectID  INT  NOT NULL,
    FOREIGN KEY (EmployeeID) REFERENCES Employees(EmployeeID),
     FOREIGN KEY (ProjectID) REFERENCES Projects(ProjectID)
)Engine InnoDB;






