/* Second Highest Salary - Leetcode question */
/* Problem link - https://leetcode.com/problems/second-highest-salary/  */

select max(salary) as SecondHighestSalary from employee where 
salary IN(select salary from employee MINUS select max(salary) from employee);
