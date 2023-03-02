/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.test;

/**
 *
 * @author Chau Nhat Truong
 */
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import swp391.customer.CustomerDTO;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.naming.NamingException;

public class NewEmptyTestNGTest {

    private TestngDAO dao;

    @BeforeClass
    public void setUp() {
        dao = new TestngDAO();
    }

    @AfterClass
    public void tearDown() {
        dao = null;
    }

    @Test
    public void testCheckLogin() throws SQLException, NamingException {
        String email = "test@example.com";
        String password = "password";
        CustomerDTO expected = new CustomerDTO("Test User", email, "123456789", "123 Test St.");
        CustomerDTO actual = dao.checkLogin(email, password);
        Assert.assertEquals(actual, expected, "Login information does not match");
    }

    @Test
    public void testLoadInformationForPayment() throws SQLException, NamingException {
        String email = "test@example.com";
        CustomerDTO expected = new CustomerDTO(1, "Test User", email, "123456789", "123 Test St.");
        CustomerDTO actual = dao.loadInformationForPayment(email);
        Assert.assertEquals(actual, expected, "Payment information does not match");
    }

    @Test
    public void testCreateAccount() throws SQLException, NamingException, ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date dob = format.parse("01-01-1999");
        CustomerDTO dto = new CustomerDTO("New User", "password", dob,
                "newuser@example.com", "987654321", "456 New St.", false, 2, true, true);
        boolean result = dao.createAccount(dto);
        Assert.assertTrue(result, "Account creation failed");
    }

}
