using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FIBONACCI_SERIE
{
    class Consultas
    {
        public int SerieFibonacci(int num)
        {
            if (num > 1)
            {
                return SerieFibonacci(num - 1) + (num - 2);
            }
            else if (num == 1)
            {
                return 1;
            }
            else if (num == 0)
            {
                return 0;
            }
            else
            {
              //  Console.WriteLine("el numero ingresado no es valido");
                return -1;
            }
        }
        public Boolean numprimo(int num)
        {
            Boolean numero = true;
            int divisor = 2;
            while ((numero) && (divisor != num))
            {
                if ((num % divisor == 0))
                {
                    numero = false;
                }
                else
                {
                    divisor++;
                }
            }
            return numero;
        }
    }
}
