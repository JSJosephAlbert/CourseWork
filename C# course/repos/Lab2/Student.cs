using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab2
{
    public class Student
    {
        public string StudentName { get; set; }
        public List<int> Scores { get; set; }
        public int ScoreTotal { get; set; }
        public Student()
        {
            Scores = new List<int>();
        }

        public int Sum()
        {
            //if statement seemingly does absolutely nothing
            if (Scores != null)
            {
                int sum = Scores.Sum();
                return sum;
            }
            else { return 0; }
        }

        public int Count()
        {
            //if statement seemingly does absolutely nothing
            int count = 0;
            if (Scores != null)
            {
                foreach (var score in Scores)
                {
                    count++;
                }
            }
            return count;
        }

        public double Average()
        {
            //if statement seemingly does absolutely nothing
            if (Scores != null)
            {
                double average = Scores.Average();
                return average;
            }
            else { return 0; }
        }

        public override string ToString()
        {
            string output = "";
            output += StudentName;

            foreach (var score in Scores)
            {
                output += "|" + score;
            }

            return output;
        }
    }
}
