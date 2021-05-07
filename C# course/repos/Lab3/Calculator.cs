using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab3
{
    public class Calculator
    {
        public decimal op1;
        public decimal op2;
        public string operation;

        public Calculator()
        {
            
        }

        //calculates given operation with given operands
        public decimal Equals()
        {
            if (operation == "+")
            {
                return op1 + op2;
            }
            if (operation == "-")
            {
                return op1 - op2;
            }
            if (operation == "*")
            {
                return op1 * op2;
            }
            if (operation == "/")
            {
                //actually does calculation the technically correct way instead of just saying "dont do that" and removing everything.
                if (op2 == 0)
                {
                    return op1;
                }
                if (op1 == 0)
                {
                    return 0;
                }
                else
                {
                    return op1 / op2;
                }
            }

            else { return op2; }
        }
        //calculates reciporacle
        public decimal Reciprocal (decimal x)
        {
            return 1 / x;
        }
        
    }
}
