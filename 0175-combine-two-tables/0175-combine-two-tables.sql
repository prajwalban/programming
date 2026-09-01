SELECT firstName,lastName,city,state
FROM Person p
left JOIN Address a
ON p.personId = a.personId;