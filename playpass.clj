; making passphrases
; https://www.codewars.com/kata/559536379512a64472000053

(require '[clojure.string :as str])

(def letters (set (map char (range (int \A) (inc (int \Z))))))
(def digits (set (map char (range (int \0) (inc (int \9))))))
(defn letter? [c] (contains? letters c))
(defn digit? [c] (contains? digits c))

(defn shift-letter [c n]
  (if (letter? c)
    (char (+ (int \A) (mod (+ n (int c) (- (int \A))) 26)))
    c
  )
)

(defn shift-digit [c]
  (if (digit? c)
    (char (+ (int \0) (int \9) (- (int c))))
    c
  )
)

(defn play-pass [s n]
  (->> s
    (map #(shift-letter % n))
    (map shift-digit)
    (map-indexed (fn [i c] (if (odd? i) (str/lower-case c) (str/upper-case c))))
    reverse
    (apply str)
  )
)
