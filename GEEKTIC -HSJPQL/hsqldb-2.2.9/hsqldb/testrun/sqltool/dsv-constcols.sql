/*
 * $Id: dsv-constcols.sql 610 2008-12-22 15:54:18Z unsaved $
 *
 * Tests setting column values with *DSV_CONST_COLS
 */

* *DSV_CONST_COLS= d = 2007-05-14 0:00:00  |   a  =  139  

CREATE TABLE t (i INT, a INT, d DATE);

\m dsv-constcols.dsv
SELECT COUNT(*) FROM t WHERE a = 139 AND d = '2007-05-14';

/* The d const value will override the .dsv-specified values. */
*if (*? != 2)
    \q Import using constants for int and date columns failed
*end if

DELETE from t;
* *DSV_CONST_COLS=
\m dsv-constcols.dsv

SELECT COUNT(*) FROM t WHERE a IS null AND d IS null;
*if (*? != 1)
    \q Failed to reset CONST_COLS behavior (1)
*end if

SELECT COUNT(*) FROM t WHERE a IS null AND d = '2006-12-11';
*if (*? != 1)
    \q Failed to reset CONST_COLS behavior (2)
*end if
