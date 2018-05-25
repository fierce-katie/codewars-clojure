; perimeter of squares in a rectangle
; https://www.codewars.com/kata/559a28007caad2ac4e000083

(def fib
  (cons 0
    (cons 1
      (lazy-seq (map +' fib (rest fib)))
    )
  )
)

(defn perimeter [n]
  (*' 4 (reduce +' (take (inc n) (rest fib))))
)
