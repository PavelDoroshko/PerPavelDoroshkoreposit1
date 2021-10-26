package by.ita.je.module;

import by.ita.je.module.Announcement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "COMENT")
public class Coment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coment_id")
    private long id;
    private String message;

    //@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH},fetch = FetchType.EAGER)
   // @JoinColumn(name = "announcement_id")
    @OneToOne(cascade = CascadeType.MERGE)
    private Announcement announcement;
}