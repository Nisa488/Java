package çalışmalarım;

public T linearSearch(T[] list, T target)
{
   int index = 0;
   boolean found = false;

   while (!found && index < list.length)
   {
      if (list[index].equals(target))
         found = true;
      else
         index++;
   }

   if (found)
      return list[index];
   else
      return null;
}
