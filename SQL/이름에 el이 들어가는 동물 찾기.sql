SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE LOWER(NAME) LIKE LOWER("%EL%") and ANIMAL_TYPE = "Dog"
ORDER BY NAME;