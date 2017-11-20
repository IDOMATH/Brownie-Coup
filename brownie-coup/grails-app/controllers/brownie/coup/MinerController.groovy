package brownie.coup

class MinerController
{

    static defaultAction = "displayBrownies"

    def displayBrownies()
    {
      def currentBrownies = 0
      [ brownies: currentBrownies]
    }
}
