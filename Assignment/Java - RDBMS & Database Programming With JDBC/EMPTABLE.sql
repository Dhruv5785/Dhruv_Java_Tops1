USE parth;

SELECT * FROM emptable

-- i. Select unique job from EMP table.

SELECT DISTINCT JOB FROM EMPTABLE

-- ii. List the details of the emps in asc order of the Dptnos and desc of Jobs? 

SELECT * FROM EMPTABLE 
ORDER BY Ename ASC, job DESC	

-- iii. Display all the unique job groups in the descending order?

SELECT DISTINCT JOB FROM EMPTABLE
GROUP BY job DESC

-- iv. List the emps who joined before 1981
SELECT ename FROM emptable WHERE LEFT (Hiredate, 4)< '1981'


-- v. List the Empno, Ename, Sal, Daily sal of all emps in the asc order of Annsal.
SELECT Ename, Empno, Sal, sal/30 AS dailysal, sal*12 AS annsal FROM Emptable ORDER BY annsal ASC


-- vi. List the Empno, Ename, Sal, Exp of all emps working for Mgr 7369 (Its a typo mistake, there is no 
-- experience is available and 7369 is not available in mgr
SELECT Ename, Empno, sal FROM emptable WHERE mgr=7902


-- vii. Display all the details of the emps who’s Comm. Is more than their Sal?
SELECT * FROM emptable WHERE comm > sal

-- viii. List the emps who are either ‘CLERK’ or ‘ANALYST’ in the Desc order
SELECT * FROM emptable WHERE Job='CLEARK' OR JOB= 'ANALYST' ORDER BY JOB DESC

-- ix. List the emps Who Annual sal ranging from 22000 and 45000. 
SELECT Ename, Empno, Sal, sal*12 AS annsal FROM Emptable WHERE sal*12 BETWEEN 22000 AND 45000;

-- x. List the Enames those are starting with ‘S’ and with five characters.
-- select left(ename,5) as Extractstring from emptable
SELECT ename FROM emptable WHERE ename LIKE 's____'

-- xi. List the emps whose Empno not starting with digit78.
SELECT Empno FROM emptable WHERE empno NOT LIKE '78%' 

-- xii. List all the Clerks of Deptno 20
SELECT * FROM emptable

SELECT job, deptno FROM emptable WHERE deptno=20 AND job='cleark'

-- xiii. List the Emps who are senior to their own MGRS
SELECT hiredate, job, ename FROM emptable ORDER BY hiredate ASC

-- xiv. List the Emps of Deptno 20 who’s Jobs are same as Deptno10

-- select ename,job deptno from emptable where deptno in (10,20)
-- SELECT ename,deptno FROM emptable WHERE deptno between 10 and 20
SELECT ename, job, deptno FROM emptable WHERE deptno =20 AND job IN (SELECT DISTINCT job FROM emptable WHERE deptno=10)

-- xv. List the Emps who’s Sal is same as FORD or SMITH in desc order of Sal.
 SELECT ename FROM TABLE WHERE salary=s
 
-- xvi. List the emps whose jobs same as SMITH or ALLEN.
SELECT * FROM emptable WHERE job IN('CLEARK', 'SALESMAN') -- AND (Ename= 'SMITH' OR ENAME='ALLEAN')


-- xvii. Any jobs of deptno 10 those that are not found in deptno 20. 
SELECT DISTINCT job FROM emptable WHERE deptno = 10 AND job NOT IN (SELECT job FROM emptable WHERE deptno=20)

-- xviii. Find the highest sal of EMP table
SELECT * FROM emptable	
 SELECT MAX(sal),ename FROM emptable


-- xix. Find details of highest paid employee. 
SELECT * FROM emptable	
 SELECT MAX(sal),ename FROM emptable


-- xx. Find the total sal given to the MGR. 

SELECT job, SUM(sal) AS totalsal FROM emptable WHERE Job='MANAGER';


-- xxi. List the emps whose names contains ‘A’

SELECT Ename FROM emptable WHERE Ename LIKE '%A%'



-- xxii. Find all the emps who earn the minimum Salary for each job wise in ascending order
SELECT * FROM emptable WHERE sal IN (SELECT MIN(sal)FROM emptable GROUP BY job) ORDER BY sal ASC



-- xxiii. List the emps whose sal greater than Blake’s sal. 
SELECT * FROM emptable WHERE sal > (SELECT sal FROM emptable WHERE ename='blake')



-- xxiv. Create view v1 to select ename, job, dname, loc whose deptno are same. 
CREATE VIEW v1 AS
SELECT e.ename, e.job, d.Dname, d.loc
FROM emptable e
JOIN depttable d
ON e.deptno = d.deptno;

SELECT * FROM depttable	
SELECT * FROM emptable

-- xxv. Create a procedure with dno as input parameter to fetch ename and dname. 

CREATE PROCEDURE get_ename_and_dname(IN deptno INT)
BEGIN
  SELECT e.ename, d.dname
  FROM emptable e
  JOIN depttable d
  ON e.deptno = d.deptno
  WHERE d.deptno = deptno;
END;

-- xxvi. Add column Pin with bigint data type in table student.
SELECT * FROM studenttable
   ALTER TABLE studenttable ADD PIN BIGINT;



