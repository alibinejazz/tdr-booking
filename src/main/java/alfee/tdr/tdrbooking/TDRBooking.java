package alfee.tdr.tdrbooking;

import java.util.Date;
import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

// import java.sql.Date;

//import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tdr_booking")
public class TDRBooking {
    
    @Id  //primary key
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private Integer tdr_id;
    private Integer customer_id;
    private Integer tdr_number;
    private Integer account_id;
    private Date    maturity_date;
    private Integer active;
    private String  instruction;
    private float   rate;
    private float   amount;
    private String  zakat_examption;
    private String  tax;
    
}
