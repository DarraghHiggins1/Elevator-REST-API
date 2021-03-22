INSERT INTO `ElevatorTest`.`Building`
(`BuildingName`,`BuildingLocation`,`BuildingElevators`)
VALUES
('Woodview Apartments','Galway','1,2'),
('Sea Road Offices','Galway','4,5,6,7'),
('Claddagh House','Galway','3')
;


INSERT INTO `ElevatorTest`.`Elevator`
(`ElevatorName`,`ElevatorFloors`,`ElevatorCurrentFloor`,`ElevatorSTATE`)
VALUES
('Reception','1,2,3',1,'UP'),
('Main','1,2,3',1,'UP'),
('Service','',1,'UP'),
('Reception 1','1,2,3,4',1,'DOWN'),
('Reception 2','1,2,3',1,'DOWN'),
('Building 1','1,2,3,4',1,'DOWN'),
('Building 2','1,2,3',1,'DOWN');

INSERT INTO `ElevatorTest`.`User`
(`UserName`, `UserBuildings`)
VALUES
('Tom','Woodview Apartments'),
('John','Sea Road Offices'),
('Tim','Claddagh House');

