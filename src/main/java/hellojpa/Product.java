package hellojpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "PRODUCT_ID")
    private Long id;

    private String name;

//    @OneToMany(mappedBy = "product")
//    private List<MemberProduct> memberProducts = new ArrayList<>();


}
