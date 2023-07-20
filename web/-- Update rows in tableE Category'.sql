SELECT  name,mobile,gmail,[State],idU FROM profiles p, Account a
             WHERE p.idU=a.uID AND   p.idU= ?