-- PL/SQL: Control Structures Example
DECLARE
    v_num NUMBER := 10;
BEGIN
    IF v_num > 0 THEN
        DBMS_OUTPUT.PUT_LINE('Positive number');
    ELSIF v_num < 0 THEN
        DBMS_OUTPUT.PUT_LINE('Negative number');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Zero');
    END IF;
END;
/