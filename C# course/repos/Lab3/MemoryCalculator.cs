using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab3
{
    public class MemoryCalculator
    {
        private double memoryValue;
        public bool hasMemory = false;
        public Form1 MyForm;

        //I could have done this the easy way and not passed the form as reference but i wanted to challenge myself.
        //However, i found this kinda confusing. could you point in the way of a good explanation of why this works?
        public MemoryCalculator(Form1 form)
        {
            this.MyForm = form;
        }

        //stores given text as memoryValue
        public void MemoryStore(string text)
        {
            memoryValue = Convert.ToDouble(text);

            hasMemory = true;
            this.MyForm.txtMemory.Text = "M";
        }
        
        //sets text of textbox1 to memoryValue
        public void MemoryRecall()
        {
            this.MyForm.textBox1.Text = Convert.ToString(memoryValue);
        }

        //adds given text to memoryValue
        public void MemoryAdd(string text)
        {
            memoryValue += Convert.ToDouble(text);
        }

        //clears memoryValue
        public void MemoryClear()
        {
            memoryValue = 0;

            hasMemory = false;
            this.MyForm.txtMemory.Text = "";
        }
    }
}
