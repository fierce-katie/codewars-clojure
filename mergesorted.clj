; "merge" function from merge sort
; https://www.codewars.com/kata/52336a4436e0b095d8000093

(defn mergesorted
  [[x & xs :as a] [y & ys :as b]]
  (cond
    (empty? a) b
    (empty? b) a
    (< x y)
      (into [x] (mergesorted xs b))
    :else
      (into [y] (mergesorted a ys))
  )
)
