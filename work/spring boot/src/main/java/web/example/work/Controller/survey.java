package web.example.work.Controller;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class survey {
    @Id public Integer no;
    public String food;
    public String season;
    @CreationTimestamp public LocalDataTime rdate;



    
}
