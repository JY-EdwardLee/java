package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

/*
    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj; // 다운캐스팅 필수 Object -> UserV2
        return id.equals(user.id);
    }
*/

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        UserV2 userV2 = (UserV2) o;
//        return Objects.equals(id, userV2.id);
//    }

}
