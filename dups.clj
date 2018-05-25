; counting duplicates
; https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1

(require '[clojure.string :as str])

(defn duplicate-count
  ([text] (duplicate-count (str/lower-case text) ""))
  ([text acc]
    (cond
      (str/blank? text)
        (count (set acc))
      (str/includes? (subs text 1) (subs text 0 1))
        (duplicate-count (subs text 1) (str (get text 0) acc))
      :else
       (duplicate-count (subs text 1) acc)
    )
  )
)
