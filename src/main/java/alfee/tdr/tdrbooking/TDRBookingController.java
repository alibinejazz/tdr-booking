package alfee.tdr.tdrbooking;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/tdr")
public class TDRBookingController {

    @Autowired  // implements all dependency
    private ITDRBooking repo; // interface repository (repository pattern)

    @GetMapping("/getAllBookings")
    public Collection<TDRBooking> viewAll(){
        return repo.findAll();
    }

    @PostMapping("/bookTdr")
    public String bookTdr(@RequestBody TDRBooking tdr) {
        repo.save(tdr);
        return "TDR Book";
    }


}
