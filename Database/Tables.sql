CREATE TABLE `User` (
                        `idUser` int NOT NULL AUTO_INCREMENT,
                        `UserName` varchar(45) DEFAULT NULL,
                        `UserBuildings` varchar(45) DEFAULT NULL,
                        `CreationDateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
                        PRIMARY KEY (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `Elevator` (
                            `idElevator` int NOT NULL AUTO_INCREMENT,
                            `ElevatorName` varchar(200) DEFAULT NULL,
                            `ElevatorFloors` varchar(200) DEFAULT NULL,
                            `ElevatorCurrentFloor` int DEFAULT NULL,
                            `ElevatorSTATE` varchar(100) DEFAULT NULL,
                            `CreationDateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
                            PRIMARY KEY (`idElevator`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `Building` (
                            `idBuilding` int NOT NULL AUTO_INCREMENT,
                            `BuildingName` varchar(200) DEFAULT NULL,
                            `BuildingLocation` varchar(200) DEFAULT NULL,
                            `BuildingElevators` varchar(100) DEFAULT NULL,
                            `CreationDateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
                            PRIMARY KEY (`idBuilding`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



