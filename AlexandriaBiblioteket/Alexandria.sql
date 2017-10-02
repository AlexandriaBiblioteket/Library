use alexandria;


/*******************************************************************************
 * Selected metadata objects
 * -------------------------
 * Extracted at 2017-10-02 10:07:33
 ******************************************************************************/

/*******************************************************************************
 * Tables
 * ------
 * Extracted at 2017-10-02 10:07:33
 ******************************************************************************/

CREATE TABLE author (
  ID     Integer(11) NOT NULL,
  `name` NChar(200) COLLATE utf8_general_ci, 
  PRIMARY KEY (
      ID
  )
) ENGINE=InnoDB ROW_FORMAT=DYNAMIC DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
ALTER TABLE author COMMENT = '';
CREATE TABLE hibernate_sequence (
  next_val BigInt(20)
) ENGINE=InnoDB ROW_FORMAT=DYNAMIC DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
ALTER TABLE hibernate_sequence COMMENT = '';
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
  ID        Integer(11) NOT NULL,
  `name`    NVarChar(200) COLLATE utf8_general_ci,
  ISBN      NVarChar(32) COLLATE utf8_general_ci,
  status    TinyInt(4),
  authorID  Integer(11),
  mediatype NVarChar(10) COLLATE utf8_general_ci, 
  PRIMARY KEY (
      ID
  )
) ENGINE=InnoDB ROW_FORMAT=DYNAMIC DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
ALTER TABLE media COMMENT = '';
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
CREATE TABLE person (
  ID     Integer(11) NOT NULL,
  `name` NVarChar(50) COLLATE utf8_general_ci, 
  PRIMARY KEY (
      ID
  )
) ENGINE=InnoDB ROW_FORMAT=DYNAMIC DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
ALTER TABLE person COMMENT = '';
/*******************************************************************************
 * Indices
 * -------
 * Extracted at 2017-10-02 10:07:33
 ******************************************************************************/

CREATE INDEX FKodtsfp2vo18f5gl55fpnb9ph4 
 ON media(authorID);
/*******************************************************************************
 * Unique Constraints
 * ------------------
 * Extracted at 2017-10-02 10:07:33
 ******************************************************************************/

ALTER TABLE member ADD CONSTRAINT UK9qv6yhjqm8iafto8qk452gx8h UNIQUE 
    (email);

/*******************************************************************************
 * Foreign Key Constraints
 * -----------------------
 * Extracted at 2017-10-02 10:07:33
 ******************************************************************************/

ALTER TABLE loan ADD CONSTRAINT fk_loan_media FOREIGN KEY (mediaID)
  REFERENCES media (ID)
  ON DELETE NO ACTION 
  ON UPDATE NO ACTION;

ALTER TABLE loan ADD CONSTRAINT fk_loan_person FOREIGN KEY (personID)
  REFERENCES person (ID)
  ON DELETE NO ACTION 
  ON UPDATE NO ACTION;

ALTER TABLE media ADD CONSTRAINT fk_media_author FOREIGN KEY (authorID)
  REFERENCES author (ID)
  ON DELETE NO ACTION 
  ON UPDATE NO ACTION;

