package com.demo.audit.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "SHEDLOCK")
public class Shedlock {


@Id
private String name;

@Column(name = "lock_until")
private LocalDateTime lockUntil;

@Column(name = "locked_at")
private LocalDateTime lockedAt;

 
 
@Column(name = "locked_by")
private String lockedBy;
 

}