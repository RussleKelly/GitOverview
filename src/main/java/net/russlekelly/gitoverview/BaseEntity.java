package net.russlekelly.gitoverview;

/**
 * Created by RuslanKuleshov on 25.10.16.
 */
public class BaseEntity {

    private Long id;

    public Long getId() {
        return id;
    }
nbgvfcdfchvjbknlmjnhbgv
    public void setId(Long id) {
        this.id = id;
    }

////i've created this branch to check whether it will get removed from remote brancehs from IDE

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                '}';
    }

    public boolean isNew(){
        return (this.id ==null);
    }
    }
}

