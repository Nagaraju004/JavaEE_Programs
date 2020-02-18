@Entity
@Table(name = "EMPLOYEE", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID"),
        @UniqueConstraint(columnNames = "EMAIL") })
public class EmployeeEntity implements Serializable
{  
    private static final long serialVersionUID = -1798070786993154676L;
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer id;
     
    @Column(name = "EMAIL", unique = true, nullable = false, length = 100)
    private String email;
     
    @Column(name = "FIRST_NAME", unique = false, nullable = false, length = 100)
    private String firstName;
     
    @Column(name = "LAST_NAME", unique = false, nullable = false, length = 100)
    private String lastName;
 
    //Getters and setters
}