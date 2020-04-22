USE testdb;

SELECT numb, (digit - numb) AS len
FROM (SELECT digit, @num := @num + 1, @num AS numb, (if(digit = @num, @temp := 0, @num := digit)) AS n
      FROM numbers,
           (SELECT @num := 0) AS num,
           (SELECT @temp := 0) AS temp) AS pretab
WHERE n > 0;