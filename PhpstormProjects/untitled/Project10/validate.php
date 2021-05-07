<?php
session_start();

class validate
{
    /*
    public string $fName;
    public string $lName;
    public string $email;
    public string $phone;
    public string $username;
    public string $password;
    */


    function redirect() {
        header("Location: form.php");
    }

    function isProperLength($string,$min,$max) {
        $string = filter_var($string, FILTER_SANITIZE_STRING);
        if (strlen($string) < $min){
            return false;
        }
        elseif (strlen($string) > $max){
            return false;
        }
        else{
            return true;
        }
    }
    function isAlpha($string) {
        if (preg_match('/^[a-zA-Z]*$/',$string) == 1){
            return true;
        }
        else {
            return false;
        }
    }

    function isAlphaNum($string) {
        if (preg_match('/^[a-zA-Z0-9]*$/',$string) == 1){
            return true;
        }
        else {
            return false;
        }
    }
    function isEmail($string){
        if (preg_match("/^\S{1,}@\S{2,}\.\S{2,}$/", $string) == 1){
            return true;
        }
        else{
            return false;
        }
    }
    function isPhone($string){
        if (preg_match("/(?:[-][0-9]{3}){1,5}/", $string) == 1){
            return true;
        }
        else{
            return false;
        }
    }
}