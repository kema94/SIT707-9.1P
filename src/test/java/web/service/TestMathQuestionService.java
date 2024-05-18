package web.service;

import org.junit.Assert;
import org.junit.Test;

import web.service.MathQuestionService;

public class TestMathQuestionService {
	
	 @Test
	    public void testTrueAdd() {
	        Assert.assertEquals(MathQuestionService.q1Addition("1", "2"), 3, 0);
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testAddNumber1Empty() {
	        MathQuestionService.q1Addition("", "2");
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testAddNumber2Empty() {
	        MathQuestionService.q1Addition("1", "");
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testAddNumber1Null() {
	        MathQuestionService.q1Addition(null, "2");
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testAddNumber2Null() {
	        MathQuestionService.q1Addition("1", null);
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testAddNumber1Alpha() {
	        MathQuestionService.q1Addition("abc", "2");
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testAddNumber2Alpha() {
	        MathQuestionService.q1Addition("1", "xyz");
	    }

	    @Test
	    public void testAddWrongAnswer() {
	        Assert.assertNotEquals(MathQuestionService.q1Addition("1", "2"), 4, 0);
	    }

	    // Subtraction Method Tests
	    @Test
	    public void testTrueSub() {
	        Assert.assertEquals(MathQuestionService.q2Subtraction("23", "3"), 20, 0);
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testSubNumber1Empty() {
	        MathQuestionService.q2Subtraction("", "3");
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testSubNumber2Empty() {
	        MathQuestionService.q2Subtraction("23", "");
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testSubNumber1Null() {
	        MathQuestionService.q2Subtraction(null, "3");
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testSubNumber2Null() {
	        MathQuestionService.q2Subtraction("23", null);
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testSubNumber1Alpha() {
	        MathQuestionService.q2Subtraction("abc", "3");
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testSubNumber2Alpha() {
	        MathQuestionService.q2Subtraction("23", "xyz");
	    }

	    @Test
	    public void testSubWrongAnswer() {
	        Assert.assertNotEquals(MathQuestionService.q2Subtraction("23", "3"), 21, 0);
	    }

	    // Multiplication Method Tests
	    @Test
	    public void testTrueMul() {
	        Assert.assertEquals(MathQuestionService.q3Multiplication("2", "2"), 4, 0);
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testMulNumber1Empty() {
	        MathQuestionService.q3Multiplication("", "2");
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testMulNumber2Empty() {
	        MathQuestionService.q3Multiplication("2", "");
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testMulNumber1Null() {
	        MathQuestionService.q3Multiplication(null, "2");
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testMulNumber2Null() {
	        MathQuestionService.q3Multiplication("2", null);
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testMulNumber1Alpha() {
	        MathQuestionService.q3Multiplication("abc", "2");
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testMulNumber2Alpha() {
	        MathQuestionService.q3Multiplication("2", "xyz");
	    }

	    @Test
	    public void testMulWrongAnswer() {
	        Assert.assertNotEquals(MathQuestionService.q3Multiplication("2", "2"), 5, 0);
	    }
	    
	    
	    
	    @Test
	    public void testq1Additionition() {
	        // Valid inputs
	        Assert.assertEquals(MathQuestionService.q1Addition("1", "2"), 3, 0);

	        // Empty inputs
	        try {
	            MathQuestionService.q1Addition("", "2");
	            Assert.fail("Expected IllegalArgumentException for empty input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }

	        try {
	            MathQuestionService.q1Addition("1", "");
	            Assert.fail("Expected IllegalArgumentException for empty input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }

	        // Null inputs
	        try {
	            MathQuestionService.q1Addition(null, "2");
	            Assert.fail("Expected IllegalArgumentException for null input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }

	        try {
	            MathQuestionService.q1Addition("1", null);
	            Assert.fail("Expected IllegalArgumentException for null input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }

	        // Non-numeric inputs
	        try {
	            MathQuestionService.q1Addition("abc", "2");
	            Assert.fail("Expected IllegalArgumentException for non-numeric input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }

	        try {
	            MathQuestionService.q1Addition("1", "xyz");
	            Assert.fail("Expected IllegalArgumentException for non-numeric input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }
	    }

	    // Functional tests for q2Subtractionion
	    @Test
	    public void testq2Subtractionion() {
	        // Valid inputs
	        Assert.assertEquals(MathQuestionService.q2Subtraction("23", "3"), 20, 0);

	        // Empty inputs
	        try {
	            MathQuestionService.q2Subtraction("", "3");
	            Assert.fail("Expected IllegalArgumentException for empty input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }

	        try {
	            MathQuestionService.q2Subtraction("23", "");
	            Assert.fail("Expected IllegalArgumentException for empty input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }

	        // Null inputs
	        try {
	            MathQuestionService.q2Subtraction(null, "3");
	            Assert.fail("Expected IllegalArgumentException for null input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }

	        try {
	            MathQuestionService.q2Subtraction("23", null);
	            Assert.fail("Expected IllegalArgumentException for null input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }

	        // Non-numeric inputs
	        try {
	            MathQuestionService.q2Subtraction("abc", "3");
	            Assert.fail("Expected IllegalArgumentException for non-numeric input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }

	        try {
	            MathQuestionService.q2Subtraction("23", "xyz");
	            Assert.fail("Expected IllegalArgumentException for non-numeric input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }
	    }

	    // Functional tests for multiplication
	    @Test
	    public void testMultiplication() {
	        // Valid inputs
	        Assert.assertEquals(MathQuestionService.q3Multiplication("2", "2"), 4, 0);

	        // Empty inputs
	        try {
	            MathQuestionService.q3Multiplication("", "2");
	            Assert.fail("Expected IllegalArgumentException for empty input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }

	        try {
	            MathQuestionService.q3Multiplication("2", "");
	            Assert.fail("Expected IllegalArgumentException for empty input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }

	        // Null inputs
	        try {
	            MathQuestionService.q3Multiplication(null, "2");
	            Assert.fail("Expected IllegalArgumentException for null input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }

	        try {
	            MathQuestionService.q3Multiplication("2", null);
	            Assert.fail("Expected IllegalArgumentException for null input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }

	        // Non-numeric inputs
	        try {
	            MathQuestionService.q3Multiplication("abc", "2");
	            Assert.fail("Expected IllegalArgumentException for non-numeric input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }

	        try {
	            MathQuestionService.q3Multiplication("2", "xyz");
	            Assert.fail("Expected IllegalArgumentException for non-numeric input");
	        } catch (IllegalArgumentException e) {
	            // expected
	        }
	    }
}