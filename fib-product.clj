; product of consecutive Fibonacci numbers
; https://www.codewars.com/kata/5541f58a944b85ce6d00006a

(defn product-fib
  ([prod] (product-fib prod 0N 1))
  ([prod n n+1]
    (cond
      (= prod (* n n+1)) [n n+1 true]
      (< prod (* n n+1)) [n n+1 false]
      :else (product-fib prod n+1 (+ n n+1))
    )
  )
)
