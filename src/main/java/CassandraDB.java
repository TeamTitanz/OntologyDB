/*******************************************************************************
 * Copyright 2016 Titans
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 ******************************************************************************/

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CassandraDB {

    public boolean Create_KeySpace() {

        String query = "CREATE KEYSPACE Ontology WITH replication "
                + "= {'class':'SimpleStrategy', 'replication_factor':1};";

        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect();

        session.execute(query);
        System.out.println("Ontology Keyspace created");

        return true;
    }

    public boolean CreateCourtTable() {

        String query = "CREATE TABLE court(" +
                "court_id text PRIMARYKEY," +
                "court_name text," +
                "authority_over_court_id text," +
                "jury_id text)";

        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect();

        session.execute(query);

        return true;
    }

    public boolean CreateJuryTable() {

        String query = "CREATE TABLE jury(" +
                "jury_id text PRIMARYKEY," +
                "jury_name text," +
                "jury_size int," +
                "Jurors_head_id text," +
                "Jurors_id text)";

        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect();

        session.execute(query);

        return true;
    }

    public boolean CreateCourtTypeTable() {

        String query = "CREATE TABLE CourtType(" +
                "ID text PRIMARYKEY," +
                "Name text)";

        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect();

        session.execute(query);

        return true;
    }

    public boolean CreateCourtAssignJuryTable() {

        String query = "CREATE TABLE CourtAssignJury(" +
                "court_id text PRIMARYKEY," +
                "jury_id text)";

        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect();

        session.execute(query);

        return true;
    }

    public boolean CreateRoleTable() {

        String query = "CREATE TABLE Role(" +
                "role_id text PRIMARYKEY," +
                "name text," +
                "type text," +
                "description text)";

        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect();

        session.execute(query);

        return true;
    }

    public boolean CreateJurorsTable() {

        String query = "CREATE TABLE Jurors(" +
                "juror_id text PRIMARYKEY," +
                "jury_id text," +
                "name text)";

        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect();

        session.execute(query);

        return true;
    }

    public boolean CreatePersonTable() {

        String query = "CREATE TABLE Person(" +
                "person_id text PRIMARYKEY," +
                "first_name text," +
                "last_name text," +
                "family_name text," +
                "age int," +
                "address text," +
                "phone text," +
                "email text," +
                "occupation text," +
                "jury_id text)";

        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect();

        session.execute(query);

        return true;
    }

    public boolean CreateJudgeTable() {

        String query = "CREATE TABLE Judge(" +
                "judge_number text PRIMARYKEY," +
                "description text)";

        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect();

        session.execute(query);

        return true;
    }

    public boolean CreateCountryTable() {

        String query = "CREATE TABLE Country(" +
                "country_code text PRIMARYKEY," +
                "name text," +
                "state_id text)";

        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect();

        session.execute(query);

        return true;
    }

    public boolean CreateStateTable() {

        String query = "CREATE TABLE State(" +
                "state_code text PRIMARYKEY," +
                "name text)";

        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect();

        session.execute(query);

        return true;
    }

    public boolean CreateOrganizationTable() {

        String query = "CREATE TABLE Organization(" +
                "organization_id text PRIMARYKEY," +
                "name text," +
                "type text," +
                "description text)";

        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect();

        session.execute(query);

        return true;
    }

    public boolean CreateLegalPersonTable() {

        String query = "CREATE TABLE LegalPerson(" +
                "id text PRIMARYKEY," +
                "description text)";

        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect();

        session.execute(query);

        return true;
    }

    public static void main(String[] args) {

    }


}
