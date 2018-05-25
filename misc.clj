(require '[clojure.string :as str])

; https://www.codewars.com/kata/563b662a59afc2b5120000c6
(defn nb-year [p0 percent aug p]
  (if (>= p0 p)
    0
    (inc (nb-year (+ p0 aug (int (* p0 0.01 percent))) percent aug p))
  )
)

; https://www.codewars.com/kata/5656b6906de340bd1b0000ac
(defn longest [s1 s2]
  (str/join (set (concat s1 s2)))
)

; https://www.codewars.com/kata/55e6f5e58f7817808e00002e
(defn seven2 [m steps]
  (if
    (<= m 99)
    [m steps]
    (seven2 (- (quot m 10) (* 2 (mod m 10))) (inc steps))
  )
)

(defn seven [m]
  (seven2 m 0)
)

; https://www.codewars.com/kata/56747fd5cb988479af000028
(defn get-middle [s]
  (let [mid (quot (count s) 2)]
    (if
      (odd? (count s))
      (subs s mid (inc mid))
      (subs s (dec mid) (inc mid))
    )
  )
)

; https://www.codewars.com/kata/566efcfbf521a3cfd2000056
(defn reverse-func2 [s]
  (if
    (str/blank? s)
    ""
    (str (get s 0) (reverse-func2 (str/reverse (subs s 1))))
  )
)

(defn reverse-fun [s]
  (reverse-func2 (str/reverse s))
)
