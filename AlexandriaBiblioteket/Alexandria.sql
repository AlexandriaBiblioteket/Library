use alexandria;

/*******************************************************************************
 * Selected metadata objects
 * -------------------------
 * Extracted at 2017-10-02 11:23:41
 ******************************************************************************/

/*******************************************************************************
 * Tables
 * ------
 * Extracted at 2017-10-02 11:23:41
 ******************************************************************************/

CREATE TABLE person (
  ID     Integer(11) NOT NULL AUTO_INCREMENT,
  `name` NVarChar(50) COLLATE utf8_general_ci, 
  PRIMARY KEY (
      ID
  )
) ENGINE=InnoDB AUTO_INCREMENT=1 ROW_FORMAT=DYNAMIC DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
ALTER TABLE person COMMENT = '';
CREATE TABLE member (
  id           BigInt(20) NOT NULL,
  email        NVarChar(255) COLLATE utf8_general_ci NOT NULL,
  `name`       NVarChar(25) COLLATE utf8_general_ci NOT NULL,
  phone_number NVarChar(12) COLLATE utf8_general_ci NOT NULL, 
  PRIMARY KEY (
      id
  )
) ENGINE=InnoDB ROW_FORMAT=DYNAMIC DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
ALTER TABLE member COMMENT = '';
CREATE TABLE media (
  ID        Integer(11) NOT NULL AUTO_INCREMENT,
  `name`    NVarChar(200) COLLATE utf8_general_ci,
  ISBN      NVarChar(32) COLLATE utf8_general_ci,
  status    TinyInt(4),
  authorID  Integer(11),
  mediatype NVarChar(10) COLLATE utf8_general_ci, 
  PRIMARY KEY (
      ID
  )
) ENGINE=InnoDB AUTO_INCREMENT=1 ROW_FORMAT=DYNAMIC DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
ALTER TABLE media COMMENT = '';
CREATE TABLE loan (
  ID       Integer(11) NOT NULL AUTO_INCREMENT,
  personID Integer(11),
  mediaID  Integer(11),
  dateOut  DateTime,
  dueBack  DateTime,
  returned DateTime,
  fee      NVarChar(45) COLLATE utf8_general_ci, 
  PRIMARY KEY (
      ID
  )
) ENGINE=InnoDB AUTO_INCREMENT=1 ROW_FORMAT=DYNAMIC DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
ALTER TABLE loan COMMENT = '';
CREATE TABLE hibernate_sequence (
  next_val BigInt(20)
) ENGINE=InnoDB ROW_FORMAT=DYNAMIC DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
ALTER TABLE hibernate_sequence COMMENT = '';
CREATE TABLE author (
  ID     Integer(11) NOT NULL AUTO_INCREMENT,
  `name` NChar(200) COLLATE utf8_general_ci, 
  PRIMARY KEY (
      ID
  )
) ENGINE=InnoDB AUTO_INCREMENT=1 ROW_FORMAT=DYNAMIC DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
ALTER TABLE author COMMENT = '';
