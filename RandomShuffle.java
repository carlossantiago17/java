public static void main (String args[]) throws InterruptedException{
  int i; // loop variable i
  int max = 52 ; // maximum number of cards
  int maxmatches = 0;
  // define arrays
  int baseInts[] = new int[max];
  int randomInts[] = new int[max];
  int matches = 0;
  double count = 0;
  for (;;){
    if (count > 1000  ) break;
    count++;
    for (i = 0; i < max; i++) {
        baseInts[i] = i;
        randomInts[i] = -1;

    }
    System.out.println
    printArray(baseInts);
    randomInts = shuffle(baseInts,randomInts,max);
    System.out.println
    printArray(randomInts);
    Thread.sleep(1000);
    matches = getMatches(randomInts);
    if (matches)> maxmatches
