using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab6
{
    class PigGreekTranslator : ITranslator
    {
        const string VOWEL_ENDING = "oi";
        const string CONS_ENDING = "omatos";
        const string ALLOWED = @"'ABCDEFGHIJKLMNOPQRSTUVWXYZ.,;:!?abcdefghijklmnopqrstuvwxyz";
        const string VOWELS = "AIUEOaiueo";
        const string CONSONANTS = "BCDFGHJKLMNPQRSTVWXZbcdfghjklmnpqrstvwxyz";
        const string PUNCTUATION = ".?!,:;";
        public string Translate(string toTranslate)
        {
            //filters random stuff like numbers or email addresses
            if (!toTranslate.All(c => ALLOWED.Contains(c))) return toTranslate;

            string punctuation = "";
            char firstLetter = toTranslate[0];

            //checks if first letter is uppercase
            bool uppercase = false;
            if (char.IsUpper(firstLetter) == true)
            {
                uppercase = true;
            }

            //checks if first letter is a vowel
            if (VOWELS.Contains(firstLetter))
            {
                //checks if string ends in punctuation
                if (PUNCTUATION.Contains(toTranslate[toTranslate.Length - 1]))
                {
                    char c = toTranslate[toTranslate.Length - 1];
                    punctuation = c.ToString();
                    toTranslate = toTranslate.Remove(toTranslate.Length - 1, 1);
                }
                toTranslate += VOWEL_ENDING;
                toTranslate += punctuation;
            }

            //checks if first letter is a consonant
            if (CONSONANTS.Contains(firstLetter))
            {
                string translated = "";
                string temp = "";

                bool vowel = false;
                toTranslate = toTranslate.ToLower();

                foreach (char letter in toTranslate)
                {
                    //if loop hasn't reached a vowel, keep doing stuff
                    if (vowel == false)
                    {
                        //if letter is consonant
                        if (CONSONANTS.Contains(letter))
                        {
                            temp += letter;
                        }
                        //if letter is vowel
                        if (VOWELS.Contains(letter))
                        {
                            translated += letter;
                            vowel = true;
                        }
                        //if letter is punctuation. probably redundant
                        if (PUNCTUATION.Contains(letter))
                        {
                            punctuation += letter;
                        }
                    }

                    //if loop has reached a vowel
                    else if (vowel == true)
                    {
                        //if letter is punctuation
                        if (PUNCTUATION.Contains(letter))
                        {
                            punctuation += letter;
                        }
                        else
                        {
                            translated += letter;
                        }
                    }

                }
                string upperTranslated = "";
                //if first letter was uppercase
                if (uppercase)
                {
                    firstLetter = translated[0];
                    firstLetter = char.ToUpper(firstLetter);
                    translated = translated.Substring(1);
                    upperTranslated = firstLetter + translated;
                    translated = upperTranslated;

                }
                translated += temp;
                translated += CONS_ENDING;
                translated += punctuation;
                toTranslate = translated;
            }
            return toTranslate;

        }
    }
}
