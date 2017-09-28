/*******************************************************************************
 * Selected metadata objects
 * -------------------------
 * Extracted at 2017-09-28 09:41:20
 ******************************************************************************/

/*******************************************************************************
 * Tables
 * ------
 * Extracted at 2017-09-28 09:41:20
 ******************************************************************************/

CREATE TABLE author (
  ID     Integer(11) NOT NULL,
  `name` NChar(200) COLLATE utf8_general_ci, 
  PRIMARY KEY (
      ID
  )
) ENGINE=InnoDB ROW_FORMAT=DYNAMIC DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
ALTER TABLE author COMMENT = '';
CREATE TABLE loan (
  ID       Integer(11) NOT NULL,
  personID Integer(11),
  mediaID  Integer(11),
  dateOut  DateTime,
  dueBack  DateTime,
  returned DateTime,
  fee      NVarChar(45) COLLATE utf8_general_ci, 
  PRIMARY KEY (
      ID
  )
) ENGINE=InnoDB ROW_FORMAT=DYNAMIC DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
ALTER TABLE loan COMMENT = '';
CREATE TABLE media (
  ID       Integer(11) NOT NULL,
  `name`   NVarChar(200) COLLATE utf8_general_ci,
  ISBN     NVarChar(32) COLLATE utf8_general_ci,
  status   TinyInt(4),
  authorID Integer(11),
  personID Integer(11), 
  PRIMARY KEY (
      ID
  )
) ENGINE=InnoDB ROW_FORMAT=DYNAMIC DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
ALTER TABLE media COMMENT = '';
CREATE TABLE person (
  ID     Integer(11) NOT NULL,
  `name` NVarChar(50) COLLATE utf8_general_ci, 
  PRIMARY KEY (
      ID
  )
) ENGINE=InnoDB ROW_FORMAT=DYNAMIC DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
ALTER TABLE person COMMENT = '';
