package kim.zhyn.mybatis.mapper.sql;

public class TestSql {
    public static final String ALL_TEST_WITH_USER =
            "SELECT test.idx, " +
                    "test.description, " +
                    "user.name " +
            "  FROM TB_TEST test " +
        "INNER JOIN TB_USER user " +
        "     USING (idx)";

    public String findByJoinId(int idx) {
        StringBuilder sql = new StringBuilder(ALL_TEST_WITH_USER);

        if (idx > -1) {
            sql
                    .append("where idx = ")
                    .append(idx);
        }

        return sql.toString();
    }
}
