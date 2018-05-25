; array substrings
; https://www.codewars.com/kata/550554fd08b86f84fe000a58

(require '[clojure.string :as str])

(defn any-substr? [s arr]
  (some #(str/includes? % s) arr)
)

(defn in-array [array1 array2]
  (distinct (sort (filter #(any-substr? % array2) array1)))
)
