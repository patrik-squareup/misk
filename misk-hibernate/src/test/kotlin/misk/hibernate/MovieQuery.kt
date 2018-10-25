package misk.hibernate

import java.time.LocalDate

interface MovieQuery : Query<DbMovie> {
  @Constraint(path = "release_date", operator = Operator.LT)
  fun releaseDateBefore(date: LocalDate): MovieQuery

  @Constraint(path = "id", operator = Operator.EQ)
  fun id(id: Id<DbMovie>): MovieQuery
}