package leetcode.day16

  fun setZeroes(matrix: Array<IntArray>) {
    if (matrix.isEmpty() || matrix.first().isEmpty()) return
    var row0Clean = true
    var col0Clean = true

    for (i in 0..matrix.lastIndex) {
      for (j in 0..matrix.first().lastIndex) {
        if (matrix[i][j] == 0) {
          if (i == 0) row0Clean = false
          if (j == 0) col0Clean = false
          matrix[0][j] = 0
          matrix[i][0] = 0
        }
      }
    }
    for (i in 1..matrix.lastIndex) {
      if (matrix[i][0] == 0) {
        (matrix.first().indices).forEach { j -> matrix[i][j] = 0 }
      }
    }
    for (i in 1..matrix.first().lastIndex) {
      if (matrix[0][i] == 0) {
        (matrix.indices).forEach { j -> matrix[j][i] = 0 }
      }
    }
    if (!row0Clean) matrix.first().indices.forEach { matrix[0][it] = 0 }
    if (!col0Clean) matrix.indices.forEach { matrix[it][0] = 0 }
  }
