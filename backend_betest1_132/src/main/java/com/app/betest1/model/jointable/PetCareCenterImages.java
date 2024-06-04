package com.app.betest1.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.betest1.model.Pet;
import com.app.betest1.model.PetCareCenter;
import com.app.betest1.model.PetOwner;
import com.app.betest1.model.Document;
import com.app.betest1.model.PetService;
import com.app.betest1.enums.PetServiceType;
import com.app.betest1.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterImages")
@Table(schema = "\"betest1\"", name = "\"PetCareCenterImages\"")
@Data
public class PetCareCenterImages{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"DocId\"")
    private Integer docId;
 
}