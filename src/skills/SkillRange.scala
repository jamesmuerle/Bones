package skills

/**
 * Created by James on 1/14/14.
 */
class SkillRange(val min: Int, val max: Int) extends Iterable[Int] {
  def this(max: Int) = this(0, max)
  def iterator: SkillRangeIterator = new SkillRangeIterator

  class SkillRangeIterator extends Iterator[Int] {
    var curr: Int = SkillRange.this.min
    override def next(): Int = {
      val tmp = curr
      curr += 1
      tmp
    }
    override def hasNext(): Boolean = {
      curr <= SkillRange.this.max
    }
  }
}
