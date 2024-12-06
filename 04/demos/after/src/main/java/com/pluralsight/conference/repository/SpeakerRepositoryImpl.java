package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Speaker;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("speakerRepository")
public class SpeakerRepositoryImpl implements SpeakerRepository {

    private final JdbcTemplate jdbcTemplate;

    public SpeakerRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Speaker> findAll() {
        String sql = "SELECT * FROM speaker";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Speaker speaker = new Speaker();
            speaker.setName(rs.getString("name"));
            speaker.setSkill(rs.getString("skill"));
            return speaker;
        });
    }

    @Override
    public Speaker create(Speaker speaker) {
        jdbcTemplate.update("INSERT INTO speaker (name) values (?)", speaker.getName());

//        SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
//
//        insert.setTableName("speaker");
//
//        List<String> columns = new ArrayList<>();
//        columns.add("name");
//
//        Map<String, Object> data = new HashMap<>();
//        data.put("name", speaker.getName());
//
//        insert.setGeneratedKeyName("id");
//
//        Number key = insert.executeAndReturnKey(data);
//
//        System.out.println(key);

        return null;
    }
}
