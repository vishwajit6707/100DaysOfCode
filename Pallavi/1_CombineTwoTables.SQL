// Combine two tables - leetcode question.
// problem link - https://leetcode.com/problems/combine-two-tables/

select P.firstname, P.lastname, A.city, A.state from Person P LEFT OUTER JOIN Address A ON P.personId= A.personId;
